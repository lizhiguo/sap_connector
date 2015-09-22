package com.majul.controller;

import java.util.List;

import org.hibersap.session.Session;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.majul.bapi.AGS_API.ItNodeIds;
import com.majul.bapi.AGS_API.ItTabTypes;
import com.majul.bapi.AGS_API_CHANGE_PROJECT_CONTENT.AgsApiChangeProjectContent;
import com.majul.bapi.AGS_API_CHANGE_PROJECT_CONTENT.ItTabContentAttributes;
import com.majul.bapi.AGS_API_CHANGE_PROJECT_STRUCT.AgsApiChangeProjectStruct;
import com.majul.bapi.AGS_API_CHANGE_PROJECT_STRUCT.ItNodeAttributes;
import com.majul.bapi.AGS_API_CHANGE_PROJECT_STRUCT.ItSubNodes;
import com.majul.bapi.AGS_API_READ_PROJECTSTRUCTURE.AgsApiReadProjectstructure;
import com.majul.bapi.AGS_API_READ_PROJ_CONTENT_OBJ.AgsApiReadProjContentObj;
import com.majul.bapi.AGS_API_READ_PROJ_CONTENT_TYPE.AgsApiReadProjContentType;
import com.majul.bapi.AGS_API_READ_PROJ_CONT_OBJ_TYP.AgsApiReadProjContObjTyp;
import com.majul.sap.SapSessionManager;

@RestController
@RequestMapping("/bapi")
public class BapiController {

	@RequestMapping(value = "/AGS_API_CHANGE_PROJECT_CONTENT", method = RequestMethod.GET)
	public @ResponseBody AgsApiChangeProjectContent AGS_API_CHANGE_PROJECT_CONTENT(
			@RequestParam(required = false) final String iProjectId,
			@RequestParam(required = false) final List<ItNodeIds> itNodeIds,
			@RequestParam(required = false) final List<ItTabContentAttributes> itTabContentAttributes,
			@RequestParam(required = false) final String iLockId) {

		final Session session = SapSessionManager.openSession();

		AgsApiChangeProjectContent agsApiChangeProjectContent;

		try {

			agsApiChangeProjectContent = new AgsApiChangeProjectContent(iProjectId, itNodeIds, itTabContentAttributes,
					iLockId);

			session.execute(agsApiChangeProjectContent);

		} finally {
			session.close();
		}

		return agsApiChangeProjectContent;
	}

	@RequestMapping(value = "/AGS_API_CHANGE_PROJECT_STRUCT", method = RequestMethod.GET)
	public @ResponseBody AgsApiChangeProjectStruct AGS_API_CHANGE_PROJECT_STRUCT(
			@RequestParam(required = false) final String iNodeId,
			@RequestParam(required = false) final String iProjectId,
			@RequestParam(required = false) final List<ItSubNodes> itSubNodes,
			@RequestParam(required = false) final List<ItNodeAttributes> itNodeAttributes,
			@RequestParam(required = false) final String iLockId) {

		final Session session = SapSessionManager.openSession();

		AgsApiChangeProjectStruct agsApiChangeProjectStruct;

		try {

			agsApiChangeProjectStruct = new AgsApiChangeProjectStruct(iNodeId, iProjectId, itSubNodes, itNodeAttributes,
					iLockId);

			session.execute(agsApiChangeProjectStruct);

		} finally {
			session.close();
		}

		return agsApiChangeProjectStruct;
	}

	@RequestMapping(value = "/AGS_API_READ_PROJ_CONT_OBJ_TYP", method = RequestMethod.GET)
	public @ResponseBody AgsApiReadProjContObjTyp AGS_API_READ_PROJ_CONT_OBJ_TYP(
			@RequestParam(required = false) final String iLangu,
			@RequestParam(required = false) final String iInternal,
			@RequestParam(required = false) final List<ItTabTypes> itTabTypes) {

		final Session session = SapSessionManager.openSession();

		AgsApiReadProjContObjTyp agsApiReadProjContObjTyp;

		try {

			agsApiReadProjContObjTyp = new AgsApiReadProjContObjTyp(iLangu, iInternal, itTabTypes);

			session.execute(agsApiReadProjContObjTyp);

		} finally {
			session.close();
		}

		return agsApiReadProjContObjTyp;
	}

	@RequestMapping(value = "/AGS_API_READ_PROJ_CONTENT_OBJ", method = RequestMethod.GET)
	public @ResponseBody AgsApiReadProjContentObj AGS_API_READ_PROJ_CONTENT_OBJ(
			@RequestParam(required = false) final String iProjectId,
			@RequestParam(required = false) final List<ItNodeIds> itNodeIds,
			@RequestParam(required = false) final String iInternal,
			@RequestParam(required = false) final List<ItTabTypes> itTabTypes) {

		final Session session = SapSessionManager.openSession();

		AgsApiReadProjContentObj agsApiReadProjContentObj;

		try {

			agsApiReadProjContentObj = new AgsApiReadProjContentObj(iProjectId, itNodeIds, iInternal, itTabTypes);

			session.execute(agsApiReadProjContentObj);

		} finally {
			session.close();
		}

		return agsApiReadProjContentObj;
	}

	@RequestMapping(value = "/AGS_API_READ_PROJ_CONTENT_TYPE", method = RequestMethod.GET)
	public @ResponseBody AgsApiReadProjContentType AGS_API_READ_PROJ_CONTENT_TYPE(
			@RequestParam(required = false) final String iLangu,
			@RequestParam(required = false) final String iProjectId,
			@RequestParam(required = false) final String iInternal) {

		final Session session = SapSessionManager.openSession();

		AgsApiReadProjContentType agsApiReadProjContentType;

		try {

			agsApiReadProjContentType = new AgsApiReadProjContentType(iLangu, iProjectId, iInternal);

			session.execute(agsApiReadProjContentType);

		} finally {
			session.close();
		}

		return agsApiReadProjContentType;
	}

	@RequestMapping(value = "/AGS_API_READ_PROJECTSTRUCTURE", method = RequestMethod.GET)
	public @ResponseBody AgsApiReadProjectstructure AGS_API_READ_PROJECTSTRUCTURE(
			@RequestParam(required = false) final Integer iLevels,
			@RequestParam(required = false) final String iGetGraphicData,
			@RequestParam(required = false) final String iGetAdditionalAttributes,
			@RequestParam(required = false) final String iProjectId,
			@RequestParam(required = false) final List<ItNodeIds> itNodeIds) {

		final Session session = SapSessionManager.openSession();

		AgsApiReadProjectstructure agsApiReadProjectstructure;

		try {

			agsApiReadProjectstructure = new AgsApiReadProjectstructure(iLevels, iGetGraphicData,
					iGetAdditionalAttributes, iProjectId, itNodeIds);

			session.execute(agsApiReadProjectstructure);

		} finally {
			session.close();
		}

		return agsApiReadProjectstructure;
	}

}
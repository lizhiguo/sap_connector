package com.majul.bapi.AGS_API_READ_PROJ_CONTENT_OBJ;

import java.util.List;

import com.majul.bapi.AGS_API.EtTabContentAttributes;
import com.majul.bapi.AGS_API.ItNodeIds;
import com.majul.bapi.AGS_API.ItTabTypes;

@org.hibersap.annotations.Bapi("AGS_API_READ_PROJ_CONTENT_OBJ")
public class AgsApiReadProjContentObj {

	@org.hibersap.annotations.Import
	@org.hibersap.annotations.Parameter("I_PROJECT_ID")
	private java.lang.String _iProjectId;

	@org.hibersap.annotations.Import
	@org.hibersap.annotations.Parameter("IT_NODE_IDS")
	private java.util.List<ItNodeIds> _itNodeIds;

	@org.hibersap.annotations.Import
	@org.hibersap.annotations.Parameter("I_INTERNAL")
	private java.lang.String _iInternal;

	@org.hibersap.annotations.Import
	@org.hibersap.annotations.Parameter("IT_TAB_TYPES")
	private java.util.List<ItTabTypes> _itTabTypes;

	@org.hibersap.annotations.Export
	@org.hibersap.annotations.Parameter("ET_TAB_CONTENT_ATTRIBUTES")
	private java.util.List<EtTabContentAttributes> _etTabContentAttributes;

	public AgsApiReadProjContentObj(
			String _iProjectId,
			List<ItNodeIds> _itNodeIds,
			String _iInternal,
			List<ItTabTypes> _itTabTypes) {

		super();

		this._iProjectId = _iProjectId;
		this._itNodeIds = _itNodeIds;
		this._iInternal = _iInternal;
		this._itTabTypes = _itTabTypes;

	}

	public java.lang.String getIProjectId() {

		return _iProjectId;
	}

	public void setIProjectId(
			java.lang.String _iProjectId) {

		this._iProjectId = _iProjectId;
	}

	public java.util.List<ItNodeIds> getItNodeIds() {

		return _itNodeIds;
	}

	public void setItNodeIds(
			java.util.List<ItNodeIds> _itNodeIds) {

		this._itNodeIds = _itNodeIds;
	}

	public java.lang.String getIInternal() {

		return _iInternal;
	}

	public void setIInternal(
			java.lang.String _iInternal) {

		this._iInternal = _iInternal;
	}

	public java.util.List<ItTabTypes> getItTabTypes() {

		return _itTabTypes;
	}

	public void setItTabTypes(
			java.util.List<ItTabTypes> _itTabTypes) {

		this._itTabTypes = _itTabTypes;
	}

	public java.util.List<EtTabContentAttributes> getEtTabContentAttributes() {

		return _etTabContentAttributes;
	}

	public void setEtTabContentAttributes(
			java.util.List<EtTabContentAttributes> _etTabContentAttributes) {

		this._etTabContentAttributes = _etTabContentAttributes;
	}

}
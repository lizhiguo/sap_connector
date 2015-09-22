package com.majul.bapi.AGS_API_CHANGE_PROJECT_CONTENT;

import java.util.List;

import org.hibersap.annotations.ParameterType;

import com.majul.bapi.AGS_API.ItNodeIds;

@org.hibersap.annotations.Bapi("AGS_API_CHANGE_PROJECT_CONTENT")
public class AgsApiChangeProjectContent {

	@org.hibersap.annotations.Import
	@org.hibersap.annotations.Parameter(value = "I_PROJECT_ID")
	private java.lang.String _iProjectId;

	@org.hibersap.annotations.Import
	@org.hibersap.annotations.Parameter(value = "IT_NODE_IDS", type = ParameterType.TABLE_STRUCTURE)
	private java.util.List<ItNodeIds> _itNodeIds;

	@org.hibersap.annotations.Import
	@org.hibersap.annotations.Parameter(value = "IT_TAB_CONTENT_ATTRIBUTES", type = ParameterType.TABLE_STRUCTURE)
	private java.util.List<ItTabContentAttributes> _itTabContentAttributes;

	@org.hibersap.annotations.Import
	@org.hibersap.annotations.Parameter(value = "I_LOCK_ID")
	private java.lang.String _iLockId;

	public AgsApiChangeProjectContent(
			String _iProjectId,
			List<ItNodeIds> _itNodeIds,
			List<ItTabContentAttributes> _itTabContentAttributes,
			String _iLockId) {

		super();

		this._iProjectId = _iProjectId;
		this._itNodeIds = _itNodeIds;
		this._itTabContentAttributes = _itTabContentAttributes;
		this._iLockId = _iLockId;

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

	public java.util.List<ItTabContentAttributes> getItTabContentAttributes() {

		return _itTabContentAttributes;
	}

	public void setItTabContentAttributes(
			java.util.List<ItTabContentAttributes> _itTabContentAttributes) {

		this._itTabContentAttributes = _itTabContentAttributes;
	}

	public java.lang.String getILockId() {

		return _iLockId;
	}

	public void setILockId(
			java.lang.String _iLockId) {

		this._iLockId = _iLockId;
	}

}
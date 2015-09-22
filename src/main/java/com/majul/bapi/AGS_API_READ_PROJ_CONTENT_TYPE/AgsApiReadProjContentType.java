package com.majul.bapi.AGS_API_READ_PROJ_CONTENT_TYPE;

import org.hibersap.annotations.ParameterType;

@org.hibersap.annotations.Bapi("AGS_API_READ_PROJ_CONTENT_TYPE")
public class AgsApiReadProjContentType {

	@org.hibersap.annotations.Import
	@org.hibersap.annotations.Parameter(value = "I_LANGU")
	private java.lang.String _iLangu;

	@org.hibersap.annotations.Import
	@org.hibersap.annotations.Parameter(value = "I_PROJECT_ID")
	private java.lang.String _iProjectId;

	@org.hibersap.annotations.Import
	@org.hibersap.annotations.Parameter(value = "I_INTERNAL")
	private java.lang.String _iInternal;

	@org.hibersap.annotations.Export
	@org.hibersap.annotations.Parameter(value = "ET_TAB_INFORMATION", type = ParameterType.TABLE_STRUCTURE)
	private java.util.List<EtTabInformation> _etTabInformation;

	public AgsApiReadProjContentType(
			String _iLangu,
			String _iProjectId,
			String _iInternal) {

		super();

		this._iLangu = _iLangu;
		this._iProjectId = _iProjectId;
		this._iInternal = _iInternal;

	}

	public java.lang.String getILangu() {

		return _iLangu;
	}

	public void setILangu(
			java.lang.String _iLangu) {

		this._iLangu = _iLangu;
	}

	public java.lang.String getIProjectId() {

		return _iProjectId;
	}

	public void setIProjectId(
			java.lang.String _iProjectId) {

		this._iProjectId = _iProjectId;
	}

	public java.lang.String getIInternal() {

		return _iInternal;
	}

	public void setIInternal(
			java.lang.String _iInternal) {

		this._iInternal = _iInternal;
	}

	public java.util.List<EtTabInformation> getEtTabInformation() {

		return _etTabInformation;
	}

	public void setEtTabInformation(
			java.util.List<EtTabInformation> _etTabInformation) {

		this._etTabInformation = _etTabInformation;
	}

}
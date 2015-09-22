package com.majul.bapi.AGS_API_READ_PROJ_CONT_OBJ_TYP;

import java.util.List;

import org.hibersap.annotations.ParameterType;

import com.majul.bapi.AGS_API.EtTabObjectAttributes;
import com.majul.bapi.AGS_API.ItTabTypes;

@org.hibersap.annotations.Bapi("AGS_API_READ_PROJ_CONT_OBJ_TYP")
public class AgsApiReadProjContObjTyp {

	@org.hibersap.annotations.Import
	@org.hibersap.annotations.Parameter(value = "I_LANGU")
	private java.lang.String _iLangu;

	@org.hibersap.annotations.Import
	@org.hibersap.annotations.Parameter(value = "I_INTERNAL")
	private java.lang.String _iInternal;

	@org.hibersap.annotations.Import
	@org.hibersap.annotations.Parameter(value = "IT_TAB_TYPES", type = ParameterType.TABLE_STRUCTURE)
	private java.util.List<ItTabTypes> _itTabTypes;

	@org.hibersap.annotations.Export
	@org.hibersap.annotations.Parameter(value = "ET_OBJECT_TYPES", type = ParameterType.TABLE_STRUCTURE)
	private java.util.List<EtObjectTypes> _etObjectTypes;

	@org.hibersap.annotations.Export
	@org.hibersap.annotations.Parameter(value = "ET_OBJECT_ATTRIBUTES", type = ParameterType.TABLE_STRUCTURE)
	private java.util.List<EtObjectAttributes> _etObjectAttributes;

	@org.hibersap.annotations.Export
	@org.hibersap.annotations.Parameter(value = "ET_TAB_OBJECT_ATTRIBUTES", type = ParameterType.TABLE_STRUCTURE)
	private java.util.List<EtTabObjectAttributes> _etTabObjectAttributes;

	public AgsApiReadProjContObjTyp(
			String _iLangu,
			String _iInternal,
			List<ItTabTypes> _itTabTypes) {

		super();

		this._iLangu = _iLangu;
		this._iInternal = _iInternal;
		this._itTabTypes = _itTabTypes;

	}

	public java.lang.String getILangu() {

		return _iLangu;
	}

	public void setILangu(
			java.lang.String _iLangu) {

		this._iLangu = _iLangu;
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

	public java.util.List<EtObjectTypes> getEtObjectTypes() {

		return _etObjectTypes;
	}

	public void setEtObjectTypes(
			java.util.List<EtObjectTypes> _etObjectTypes) {

		this._etObjectTypes = _etObjectTypes;
	}

	public java.util.List<EtObjectAttributes> getEtObjectAttributes() {

		return _etObjectAttributes;
	}

	public void setEtObjectAttributes(
			java.util.List<EtObjectAttributes> _etObjectAttributes) {

		this._etObjectAttributes = _etObjectAttributes;
	}

	public java.util.List<EtTabObjectAttributes> getEtTabObjectAttributes() {

		return _etTabObjectAttributes;
	}

	public void setEtTabObjectAttributes(
			java.util.List<EtTabObjectAttributes> _etTabObjectAttributes) {

		this._etTabObjectAttributes = _etTabObjectAttributes;
	}

}
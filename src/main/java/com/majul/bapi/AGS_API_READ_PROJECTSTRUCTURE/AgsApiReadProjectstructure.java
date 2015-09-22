package com.majul.bapi.AGS_API_READ_PROJECTSTRUCTURE;

import java.util.List;

import org.hibersap.annotations.ParameterType;

import com.majul.bapi.AGS_API.ItNodeIds;

@org.hibersap.annotations.Bapi("AGS_API_READ_PROJECTSTRUCTURE")
public class AgsApiReadProjectstructure {

	@org.hibersap.annotations.Import
	@org.hibersap.annotations.Parameter(value = "I_LEVELS")
	private java.lang.Integer _iLevels;

	@org.hibersap.annotations.Import
	@org.hibersap.annotations.Parameter(value = "I_GET_GRAPHIC_DATA")
	private java.lang.String _iGetGraphicData;

	@org.hibersap.annotations.Import
	@org.hibersap.annotations.Parameter(value = "I_GET_ADDITIONAL_ATTRIBUTES")
	private java.lang.String _iGetAdditionalAttributes;

	@org.hibersap.annotations.Import
	@org.hibersap.annotations.Parameter(value = "I_PROJECT_ID")
	private java.lang.String _iProjectId;

	@org.hibersap.annotations.Import
	@org.hibersap.annotations.Parameter(value = "IT_NODE_IDS", type = ParameterType.TABLE_STRUCTURE)
	private java.util.List<ItNodeIds> _itNodeIds;

	@org.hibersap.annotations.Export
	@org.hibersap.annotations.Parameter(value = "ET_NODE_TYPES", type = ParameterType.TABLE_STRUCTURE)
	private java.util.List<EtNodeTypes> _etNodeTypes;

	@org.hibersap.annotations.Export
	@org.hibersap.annotations.Parameter(value = "ET_SOURCE_TYPES", type = ParameterType.TABLE_STRUCTURE)
	private java.util.List<EtSourceTypes> _etSourceTypes;

	@org.hibersap.annotations.Export
	@org.hibersap.annotations.Parameter(value = "ET_NODE_ATTRIBUTES", type = ParameterType.TABLE_STRUCTURE)
	private java.util.List<EtNodeAttributes> _etNodeAttributes;

	@org.hibersap.annotations.Export
	@org.hibersap.annotations.Parameter(value = "ET_NODE_ATTRIBUTE_TYPES", type = ParameterType.TABLE_STRUCTURE)
	private java.util.List<EtNodeAttributeTypes> _etNodeAttributeTypes;

	@org.hibersap.annotations.Export
	@org.hibersap.annotations.Parameter(value = "ET_STRUCTURE", type = ParameterType.TABLE_STRUCTURE)
	private java.util.List<EtStructure> _etStructure;

	@org.hibersap.annotations.Export
	@org.hibersap.annotations.Parameter(value = "ET_GRAPHIC_EDGES", type = ParameterType.TABLE_STRUCTURE)
	private java.util.List<EtGraphicEdges> _etGraphicEdges;

	public AgsApiReadProjectstructure(
			Integer _iLevels,
			String _iGetGraphicData,
			String _iGetAdditionalAttributes,
			String _iProjectId,
			List<ItNodeIds> _itNodeIds) {

		super();

		this._iLevels = _iLevels;
		this._iGetGraphicData = _iGetGraphicData;
		this._iGetAdditionalAttributes = _iGetAdditionalAttributes;
		this._iProjectId = _iProjectId;
		this._itNodeIds = _itNodeIds;

	}

	public java.lang.Integer getILevels() {

		return _iLevels;
	}

	public void setILevels(
			java.lang.Integer _iLevels) {

		this._iLevels = _iLevels;
	}

	public java.lang.String getIGetGraphicData() {

		return _iGetGraphicData;
	}

	public void setIGetGraphicData(
			java.lang.String _iGetGraphicData) {

		this._iGetGraphicData = _iGetGraphicData;
	}

	public java.lang.String getIGetAdditionalAttributes() {

		return _iGetAdditionalAttributes;
	}

	public void setIGetAdditionalAttributes(
			java.lang.String _iGetAdditionalAttributes) {

		this._iGetAdditionalAttributes = _iGetAdditionalAttributes;
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

	public java.util.List<EtNodeTypes> getEtNodeTypes() {

		return _etNodeTypes;
	}

	public void setEtNodeTypes(
			java.util.List<EtNodeTypes> _etNodeTypes) {

		this._etNodeTypes = _etNodeTypes;
	}

	public java.util.List<EtSourceTypes> getEtSourceTypes() {

		return _etSourceTypes;
	}

	public void setEtSourceTypes(
			java.util.List<EtSourceTypes> _etSourceTypes) {

		this._etSourceTypes = _etSourceTypes;
	}

	public java.util.List<EtNodeAttributes> getEtNodeAttributes() {

		return _etNodeAttributes;
	}

	public void setEtNodeAttributes(
			java.util.List<EtNodeAttributes> _etNodeAttributes) {

		this._etNodeAttributes = _etNodeAttributes;
	}

	public java.util.List<EtNodeAttributeTypes> getEtNodeAttributeTypes() {

		return _etNodeAttributeTypes;
	}

	public void setEtNodeAttributeTypes(
			java.util.List<EtNodeAttributeTypes> _etNodeAttributeTypes) {

		this._etNodeAttributeTypes = _etNodeAttributeTypes;
	}

	public java.util.List<EtStructure> getEtStructure() {

		return _etStructure;
	}

	public void setEtStructure(
			java.util.List<EtStructure> _etStructure) {

		this._etStructure = _etStructure;
	}

	public java.util.List<EtGraphicEdges> getEtGraphicEdges() {

		return _etGraphicEdges;
	}

	public void setEtGraphicEdges(
			java.util.List<EtGraphicEdges> _etGraphicEdges) {

		this._etGraphicEdges = _etGraphicEdges;
	}

}
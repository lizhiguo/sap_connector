package com.majul.bapi.AGS_API_CHANGE_PROJECT_STRUCT;

import java.util.List;

import org.hibersap.annotations.ParameterType;

@org.hibersap.annotations.Bapi("AGS_API_CHANGE_PROJECT_STRUCT")
public class AgsApiChangeProjectStruct {

	@org.hibersap.annotations.Import
	@org.hibersap.annotations.Parameter(value = "I_NODE_ID")
	private java.lang.String _iNodeId;

	@org.hibersap.annotations.Import
	@org.hibersap.annotations.Parameter(value = "I_PROJECT_ID")
	private java.lang.String _iProjectId;

	@org.hibersap.annotations.Import
	@org.hibersap.annotations.Parameter(value = "IT_SUB_NODES", type = ParameterType.TABLE_STRUCTURE)
	private java.util.List<ItSubNodes> _itSubNodes;

	@org.hibersap.annotations.Import
	@org.hibersap.annotations.Parameter(value = "IT_NODE_ATTRIBUTES", type = ParameterType.TABLE_STRUCTURE)
	private java.util.List<ItNodeAttributes> _itNodeAttributes;

	@org.hibersap.annotations.Import
	@org.hibersap.annotations.Parameter(value = "I_LOCK_ID")
	private java.lang.String _iLockId;

	public AgsApiChangeProjectStruct(
			String _iNodeId,
			String _iProjectId,
			List<ItSubNodes> _itSubNodes,
			List<ItNodeAttributes> _itNodeAttributes,
			String _iLockId) {

		super();

		this._iNodeId = _iNodeId;
		this._iProjectId = _iProjectId;
		this._itSubNodes = _itSubNodes;
		this._itNodeAttributes = _itNodeAttributes;
		this._iLockId = _iLockId;

	}

	public java.lang.String getINodeId() {

		return _iNodeId;
	}

	public void setINodeId(
			java.lang.String _iNodeId) {

		this._iNodeId = _iNodeId;
	}

	public java.lang.String getIProjectId() {

		return _iProjectId;
	}

	public void setIProjectId(
			java.lang.String _iProjectId) {

		this._iProjectId = _iProjectId;
	}

	public java.util.List<ItSubNodes> getItSubNodes() {

		return _itSubNodes;
	}

	public void setItSubNodes(
			java.util.List<ItSubNodes> _itSubNodes) {

		this._itSubNodes = _itSubNodes;
	}

	public java.util.List<ItNodeAttributes> getItNodeAttributes() {

		return _itNodeAttributes;
	}

	public void setItNodeAttributes(
			java.util.List<ItNodeAttributes> _itNodeAttributes) {

		this._itNodeAttributes = _itNodeAttributes;
	}

	public java.lang.String getILockId() {

		return _iLockId;
	}

	public void setILockId(
			java.lang.String _iLockId) {

		this._iLockId = _iLockId;
	}

}
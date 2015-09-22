package com.majul.bapi.AGS_API_READ_PROJECTSTRUCTURE;

@org.hibersap.annotations.BapiStructure
public class EtGraphicEdges
{
	@org.hibersap.annotations.Parameter("TYPE")
	private java.lang.String _type;

	@org.hibersap.annotations.Parameter("TARGET_ID")
	private java.lang.String _targetId;

	@org.hibersap.annotations.Parameter("PARENT_ID")
	private java.lang.String _parentId;

	@org.hibersap.annotations.Parameter("SOURCE_ID")
	private java.lang.String _sourceId;

	@org.hibersap.annotations.Parameter("EDGE_ID")
	private java.lang.String _edgeId;

	public java.lang.String getType()
	{
		return _type;
	}

	public void setType(java.lang.String _type)
	{
		this._type = _type;
	}

	public java.lang.String getTargetId()
	{
		return _targetId;
	}

	public void setTargetId(java.lang.String _targetId)
	{
		this._targetId = _targetId;
	}

	public java.lang.String getParentId()
	{
		return _parentId;
	}

	public void setParentId(java.lang.String _parentId)
	{
		this._parentId = _parentId;
	}

	public java.lang.String getSourceId()
	{
		return _sourceId;
	}

	public void setSourceId(java.lang.String _sourceId)
	{
		this._sourceId = _sourceId;
	}

	public java.lang.String getEdgeId()
	{
		return _edgeId;
	}

	public void setEdgeId(java.lang.String _edgeId)
	{
		this._edgeId = _edgeId;
	}

}
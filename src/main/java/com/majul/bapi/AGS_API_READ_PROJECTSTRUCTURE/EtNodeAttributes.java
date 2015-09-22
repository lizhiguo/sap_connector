package com.majul.bapi.AGS_API_READ_PROJECTSTRUCTURE;

@org.hibersap.annotations.BapiStructure
public class EtNodeAttributes
{
	@org.hibersap.annotations.Parameter("ATTRIBUTE_VALUE")
	private java.lang.String _attributeValue;

	@org.hibersap.annotations.Parameter("NODE_ID")
	private java.lang.String _nodeId;

	@org.hibersap.annotations.Parameter("ATTRIBUTE_TYPE")
	private java.lang.String _attributeType;

	public java.lang.String getAttributeValue()
	{
		return _attributeValue;
	}

	public void setAttributeValue(java.lang.String _attributeValue)
	{
		this._attributeValue = _attributeValue;
	}

	public java.lang.String getNodeId()
	{
		return _nodeId;
	}

	public void setNodeId(java.lang.String _nodeId)
	{
		this._nodeId = _nodeId;
	}

	public java.lang.String getAttributeType()
	{
		return _attributeType;
	}

	public void setAttributeType(java.lang.String _attributeType)
	{
		this._attributeType = _attributeType;
	}

}
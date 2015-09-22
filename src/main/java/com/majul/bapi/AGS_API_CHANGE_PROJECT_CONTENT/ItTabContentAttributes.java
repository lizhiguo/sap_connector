package com.majul.bapi.AGS_API_CHANGE_PROJECT_CONTENT;

@org.hibersap.annotations.BapiStructure
public class ItTabContentAttributes
{
	@org.hibersap.annotations.Parameter("OBJECT_ORDER")
	private java.lang.Integer _objectOrder;

	@org.hibersap.annotations.Parameter("ATTRIBUTE_VALUE")
	private java.lang.String _attributeValue;

	@org.hibersap.annotations.Parameter("TAB_TYPE")
	private java.lang.String _tabType;

	@org.hibersap.annotations.Parameter("NODE_ID")
	private java.lang.String _nodeId;

	@org.hibersap.annotations.Parameter("ATTRIBUTE_TYPE")
	private java.lang.String _attributeType;

	public java.lang.Integer getObjectOrder()
	{
		return _objectOrder;
	}

	public void setObjectOrder(java.lang.Integer _objectOrder)
	{
		this._objectOrder = _objectOrder;
	}

	public java.lang.String getAttributeValue()
	{
		return _attributeValue;
	}

	public void setAttributeValue(java.lang.String _attributeValue)
	{
		this._attributeValue = _attributeValue;
	}

	public java.lang.String getTabType()
	{
		return _tabType;
	}

	public void setTabType(java.lang.String _tabType)
	{
		this._tabType = _tabType;
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
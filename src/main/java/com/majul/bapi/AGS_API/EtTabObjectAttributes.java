package com.majul.bapi.AGS_API;

@org.hibersap.annotations.BapiStructure
public class EtTabObjectAttributes
{
	@org.hibersap.annotations.Parameter("OBJECT_TYPE")
	private java.lang.String _objectType;

	@org.hibersap.annotations.Parameter("IS_MANDATORY")
	private java.lang.String _isMandatory;

	@org.hibersap.annotations.Parameter("TAB_TYPE")
	private java.lang.String _tabType;

	@org.hibersap.annotations.Parameter("ATTRIBUTE_TYPE")
	private java.lang.String _attributeType;

	public java.lang.String getObjectType()
	{
		return _objectType;
	}

	public void setObjectType(java.lang.String _objectType)
	{
		this._objectType = _objectType;
	}

	public java.lang.String getIsMandatory()
	{
		return _isMandatory;
	}

	public void setIsMandatory(java.lang.String _isMandatory)
	{
		this._isMandatory = _isMandatory;
	}

	public java.lang.String getTabType()
	{
		return _tabType;
	}

	public void setTabType(java.lang.String _tabType)
	{
		this._tabType = _tabType;
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
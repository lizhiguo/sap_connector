package com.majul.bapi.AGS_API_READ_PROJ_CONT_OBJ_TYP;

@org.hibersap.annotations.BapiStructure
public class EtObjectAttributes
{
	@org.hibersap.annotations.Parameter("ATTRIBUTE_TYPE")
	private java.lang.String _attributeType;

	@org.hibersap.annotations.Parameter("ATTRIBUTE_TEXT")
	private java.lang.String _attributeText;

	public java.lang.String getAttributeType()
	{
		return _attributeType;
	}

	public void setAttributeType(java.lang.String _attributeType)
	{
		this._attributeType = _attributeType;
	}

	public java.lang.String getAttributeText()
	{
		return _attributeText;
	}

	public void setAttributeText(java.lang.String _attributeText)
	{
		this._attributeText = _attributeText;
	}

}
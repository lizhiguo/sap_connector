package com.majul.bapi.AGS_API_READ_PROJ_CONT_OBJ_TYP;

@org.hibersap.annotations.BapiStructure
public class EtObjectTypes
{
	@org.hibersap.annotations.Parameter("OBJECT_TEXT")
	private java.lang.String _objectText;

	@org.hibersap.annotations.Parameter("OBJECT_TYPE")
	private java.lang.String _objectType;

	public java.lang.String getObjectText()
	{
		return _objectText;
	}

	public void setObjectText(java.lang.String _objectText)
	{
		this._objectText = _objectText;
	}

	public java.lang.String getObjectType()
	{
		return _objectType;
	}

	public void setObjectType(java.lang.String _objectType)
	{
		this._objectType = _objectType;
	}

}
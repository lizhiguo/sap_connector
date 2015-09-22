package com.majul.bapi.AGS_API_READ_PROJECTSTRUCTURE;

@org.hibersap.annotations.BapiStructure
public class EtSourceTypes
{
	@org.hibersap.annotations.Parameter("TEXT")
	private java.lang.String _text;

	@org.hibersap.annotations.Parameter("SOURCE_TYPE")
	private java.lang.String _sourceType;

	public java.lang.String getText()
	{
		return _text;
	}

	public void setText(java.lang.String _text)
	{
		this._text = _text;
	}

	public java.lang.String getSourceType()
	{
		return _sourceType;
	}

	public void setSourceType(java.lang.String _sourceType)
	{
		this._sourceType = _sourceType;
	}

}
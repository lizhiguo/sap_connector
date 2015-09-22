package com.majul.bapi.AGS_API_READ_PROJECTSTRUCTURE;

@org.hibersap.annotations.BapiStructure
public class EtNodeTypes
{
	@org.hibersap.annotations.Parameter("NODE_TYPE")
	private java.lang.String _nodeType;

	@org.hibersap.annotations.Parameter("TEXT")
	private java.lang.String _text;

	public java.lang.String getNodeType()
	{
		return _nodeType;
	}

	public void setNodeType(java.lang.String _nodeType)
	{
		this._nodeType = _nodeType;
	}

	public java.lang.String getText()
	{
		return _text;
	}

	public void setText(java.lang.String _text)
	{
		this._text = _text;
	}

}
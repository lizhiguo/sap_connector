package com.majul.bapi.AGS_API_READ_PROJECTSTRUCTURE;

@org.hibersap.annotations.BapiStructure
public class EtNodeAttributeTypes
{
	@org.hibersap.annotations.Parameter("NODE_TYPE")
	private java.lang.String _nodeType;

	@org.hibersap.annotations.Parameter("IS_MANDATORY")
	private java.lang.String _isMandatory;

	@org.hibersap.annotations.Parameter("IS_READ_ONLY")
	private java.lang.String _isReadOnly;

	@org.hibersap.annotations.Parameter("ATTRIBUTE_TYPE")
	private java.lang.String _attributeType;

	@org.hibersap.annotations.Parameter("ATTRIBUTE_TEXT")
	private java.lang.String _attributeText;

	public java.lang.String getNodeType()
	{
		return _nodeType;
	}

	public void setNodeType(java.lang.String _nodeType)
	{
		this._nodeType = _nodeType;
	}

	public java.lang.String getIsMandatory()
	{
		return _isMandatory;
	}

	public void setIsMandatory(java.lang.String _isMandatory)
	{
		this._isMandatory = _isMandatory;
	}

	public java.lang.String getIsReadOnly()
	{
		return _isReadOnly;
	}

	public void setIsReadOnly(java.lang.String _isReadOnly)
	{
		this._isReadOnly = _isReadOnly;
	}

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
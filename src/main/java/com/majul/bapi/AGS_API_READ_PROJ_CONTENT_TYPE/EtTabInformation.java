package com.majul.bapi.AGS_API_READ_PROJ_CONTENT_TYPE;

@org.hibersap.annotations.BapiStructure
public class EtTabInformation
{
	@org.hibersap.annotations.Parameter("TAB_TYPE")
	private java.lang.String _tabType;

	@org.hibersap.annotations.Parameter("TAB_TEXT")
	private java.lang.String _tabText;

	public java.lang.String getTabType()
	{
		return _tabType;
	}

	public void setTabType(java.lang.String _tabType)
	{
		this._tabType = _tabType;
	}

	public java.lang.String getTabText()
	{
		return _tabText;
	}

	public void setTabText(java.lang.String _tabText)
	{
		this._tabText = _tabText;
	}

}
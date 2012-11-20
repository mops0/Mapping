package com.szymczyszyn.mapping;

import java.util.StringTokenizer;

public class StringParser  {
	private String key;
	private String value;
	private String commandType;
	protected StringParser()
	{
		
	}
	protected StringParser(String string)
	{
		StringTokenizer st = new StringTokenizer(string);
		if(st.hasMoreTokens()) commandType=st.nextToken();
		if(st.hasMoreTokens()) key=st.nextToken();
		if(st.hasMoreTokens()) value=st.nextToken();
	}
	public void parseString(String string)
	{
		StringTokenizer st = new StringTokenizer(string);
		if(st.hasMoreTokens()) commandType=st.nextToken();
		if(st.hasMoreTokens()) key=st.nextToken();
		if(st.hasMoreTokens()) value=st.nextToken();
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getCommandType() {
		return commandType;
	}
	public void setCommandType(String commandType) {
		this.commandType = commandType;
	}
	
}

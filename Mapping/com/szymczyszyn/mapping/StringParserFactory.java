package com.szymczyszyn.mapping;

public abstract class StringParserFactory {

	public static StringParser create(String string)
	{
		return new StringParser(string);
		
	}
	public static StringParser create()
	{
		return new StringParser();
		
	}
}

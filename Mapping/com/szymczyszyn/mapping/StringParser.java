package com.szymczyszyn.mapping;

import java.util.Map;
import java.util.StringTokenizer;

public class StringParser  {
	private String key;
	private String value;
	private String commandType;
	public static StringParser create()
	{
		return new StringParser();
		
	}
	public Command parseString(String string,Map<String,String> map, TextConsole console)
	{
		key=null;
		value=null;
		commandType=null;
		
		
		StringTokenizer st = new StringTokenizer(string);
		
		if(st.hasMoreTokens()) commandType=st.nextToken();
		if(st.hasMoreTokens()) key=st.nextToken();
		if (st.hasMoreTokens()) value=st.nextToken();
		return newCommand(map,console);
	}
	
	private Command newCommand(Map<String,String> map, TextConsole console)
	{
		Command command;
		switch (commandType)
		{
			case "set":
				command=new Set(key,value,map,console);
			break;
			case "get":
				command=new Get(key,map,console);
			break;	
			case "keys":
				command= new Keys(map,console);
			break;
			case "exit":
				command= new Exit();
			break;
			default: 
				return new Error(console);
		}
		if (command.isValid()) return command;
		else return new Error(console);
	}
	
}

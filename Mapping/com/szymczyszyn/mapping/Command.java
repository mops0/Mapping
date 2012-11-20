package com.szymczyszyn.mapping;

import java.util.Map;

public abstract class Command 
{
	static Command newCommand(StringParser parser,Map<String,String> map, TextConsole console)
	{
		switch (parser.getCommandType())
		{
			case "set":
				return new Set(parser.getKey(),parser.getValue(),map,console);
			
			case "get":
				return  new Get(parser.getKey(),map,console);
				
			case "keys":
				return new Keys(map,console);
				
			case "exit":
				return new Exit();
			
			default: 
				return new Error(console);
		}
	}
	abstract String getCommandType();
	public void execute()
	{
		
	}
	
}

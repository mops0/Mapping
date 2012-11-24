package com.szymczyszyn.mapping;

import java.io.IOException;
import java.util.Map;

public class Mapping2 {

	Map<String,String> map;
	TextConsole console;
	Command command;
	StringParser parser;
	public Mapping2(Map<String,String> map,TextConsole console)
	{
		this.map=map;
		this.console=console;
		
	}
	public void init() throws IOException
	{
		parser=StringParser.create();
		do
		{
			console.print(">");
			command=parser.parseString(console.readLine(),map,console);
			
			command.execute();
		}
		while(command.getClass()!=Exit.class);
	}
	
}
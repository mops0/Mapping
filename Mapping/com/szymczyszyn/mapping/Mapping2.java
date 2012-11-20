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
		parser=StringParserFactory.create();
	}
	public void init() throws IOException
	{
		do
		{
			console.print(">");
			parser.parseString(console.readLine());
			command=Command.newCommand(parser, map, console);
			command.execute();
		}
		while(command.getClass()!=Exit.class);
	}
	
}
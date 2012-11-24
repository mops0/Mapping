package com.szymczyszyn.mapping;

import java.util.Map;

public class Get implements Command{

	Map<String,String> map;
	TextConsole console;
	String key;
	
	public Get(String key, Map<String, String> map, TextConsole console) 
	{
		this.map = map;
		this.console = console;
		this.key = key;
	}

	@Override
	public void execute() {
		if (map.containsKey(key)) console.printLine(map.get(key));
		
	}

	@Override
	public String getCommandType() {
		// TODO Auto-generated method stub
		return "get";
	}

	@Override
	public boolean isValid() {
		if (key!=null) return true;
		else
		return false;
	}
	
}

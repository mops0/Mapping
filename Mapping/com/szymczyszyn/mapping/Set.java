package com.szymczyszyn.mapping;

import java.util.Map;

public class Set implements Command{

	Map<String,String> map;
	TextConsole console;
	String key;
	String value;
	
	public Set(String key, String value, Map<String, String> map, TextConsole console) {
		this.map = map;
		this.console = console;
		this.key = key;
		this.value = value;
	}

	public void execute() {
		String value2=map.get(key);
		if (value2!=null) console.printLine(value2);
		map.put(key,value);
		
	}

	@Override
	public String getCommandType() {
		// TODO Auto-generated method stub
		return "set";
	}

	@Override
	public boolean isValid() {
		if (key!=null && value!=null)
			
		return true;
		else
		return false;
	}

}

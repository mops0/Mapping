package com.szymczyszyn.mapping;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Keys implements Command{

	Map<String,String> map;
	TextConsole console;
	
	public Keys(Map<String, String> map, TextConsole console) 
	{
		this.map = map;
		this.console = console;
	}
	public void execute() 
	{
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext())
		{
			console.printLine(iter.next().toString());
		}
		
	}
	@Override
	public String getCommandType() {
		// TODO Auto-generated method stub
		return "keys";
	}
	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return true;
	}

}

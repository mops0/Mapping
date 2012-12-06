package com.szymczyszyn.mapping;

import java.util.Map;

public class Get implements Command{

	Map<String,String> map;
	
	private String key;
	
	public Get(String key, Map<String, String> map) throws Exception
	{
		this.map = map;
		
		this.key = key;
	}

	
	public String execute() {
		if (map.containsKey(key)) return map.get(key)+"\n";
		else	return "";
	}

	
	
	
}

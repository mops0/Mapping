package com.szymczyszyn.mapping;

import java.util.Map;


public class Set implements Command{

	Map<String,String> map;
	
	String key;
	String value;
	
	public Set(String key, String value, Map<String, String> map) {
		this.map = map;
		this.key = key;
		this.value = value;
	}

	public String execute() throws NullPointerException{
		String value2=map.get(key);
		map.put(key,value);
		
		if (value2!=null) return value2+"\n" ;
		else return "";
		
		
	}

	
	/*
	@Override
	public boolean isValid() {
		if (key!=null && value!=null)
			
		return true;
		else
		return false;
	}
	*/

}

package com.szymczyszyn.mapping;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Keys implements Command{

	Map<String,String> map;
	
	
	public Keys(Map<String, String> map) 
	{
		this.map = map;
		
	}
	public String execute() 
	{
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		String string="";
		while(iter.hasNext())
		{
			string=string+iter.next().toString()+"\n";
		}
		return string;
	}
}

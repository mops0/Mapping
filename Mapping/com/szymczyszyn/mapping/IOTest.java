package com.szymczyszyn.mapping;

import java.util.ArrayList;
import java.util.List;

public class IOTest implements IOInterface  {

	
	String stringIn;
	List<String> stringOutList= new ArrayList<String>();
	@Override
	public void out(String stringOut) {
		stringOutList.add(stringOut);
		
	}

	@Override
	public String in() {
		
		return stringIn;
	}

	public String getStringIn() {
		return stringIn;
	}

	public void setStringIn(String stringIn) {
		this.stringIn = stringIn;
	}

	public List<String> getStringOutList() {
		return stringOutList;
	}

	public void setStringOutList(List<String> stringOutList) {
		this.stringOutList = stringOutList;
	}

	
	
	
}

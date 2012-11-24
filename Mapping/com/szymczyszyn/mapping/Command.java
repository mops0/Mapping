package com.szymczyszyn.mapping;


public interface Command 
{
	
	public String getCommandType();
	public void execute();
	public boolean isValid();
	
}

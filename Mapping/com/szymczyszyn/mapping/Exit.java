package com.szymczyszyn.mapping;

public class Exit implements Command{

	public void execute() {
	
		
	}

	@Override
	public String getCommandType() {
		// TODO Auto-generated method stub
		return "exit";
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return true;
	}
	
}

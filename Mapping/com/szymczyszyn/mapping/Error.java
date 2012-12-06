package com.szymczyszyn.mapping;

public class Error implements Command{

	

	@Override
	public String execute() {
		
		return "Błędna metoda\n";
	}

}

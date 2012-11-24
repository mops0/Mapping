package com.szymczyszyn.mapping;

public class Error implements Command
{
	TextConsole console;
	Error(TextConsole console){
		this.console=console;
	}
	public void execute() 
	{
		console.printLine("Wrong credentials! Try again!");
		
	}
	@Override
	public String getCommandType() {
		// TODO Auto-generated method stub
		return "error";
	}
	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}
}

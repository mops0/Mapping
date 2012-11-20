package com.szymczyszyn.mapping;

public class Error extends Command
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
	String getCommandType() {
		// TODO Auto-generated method stub
		return "error";
	}
}

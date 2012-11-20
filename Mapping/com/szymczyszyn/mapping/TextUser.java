package com.szymczyszyn.mapping;

import java.io.IOException;

public class TextUser 
{
	TextConsole console;
	public TextUser(TextConsole console)
	{
		this.console=console;
	}
	public void writeSomething()
	{
		console.printLine("blabla");
	}
	public String readSomething() throws IOException
	{
		return console.readLine();
	}
}

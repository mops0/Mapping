package com.szymczyszyn.mapping;

import java.io.IOException;


public class Mapping2 {

	
	TextConsole console;
	Command command;
	CommandFactories commandFactories;
	
	
	public Mapping2(TextConsole console)
	{
		this.console=console;
	}
	public void init() throws IOException, Exception
	{
		
		commandFactories=CommandFactories.create();
		commandFactories.registerFactory(SetFactory.STRING,new SetFactory());
		commandFactories.registerFactory(GetFactory.STRING,new GetFactory());
		commandFactories.registerFactory(KeysFactory.STRING,new KeysFactory());
		commandFactories.registerFactory(ExitFactory.STRING,new ExitFactory());
		commandFactories.registerFactory(ErrorCommandFactory.STRING,new ErrorCommandFactory());
		do
		{
			console.print(">");	
			try
			{
				command=commandFactories.getCommand(console.readLine());
				
				console.print(command.execute());
			}
			catch(Exception e)
			{
				System.out.println("Błędne parametry! ");
				command=commandFactories.getCommand("error");
				
			}
		}
		while(command.getClass()!=Exit.class);
	}
	
}
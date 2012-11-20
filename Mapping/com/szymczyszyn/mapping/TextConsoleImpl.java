package com.szymczyszyn.mapping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class TextConsoleImpl implements TextConsole {

	BufferedReader br;
	PrintStream out;
	TextConsoleImpl(BufferedReader br,PrintStream out)
	{
		this.br=br;
		this.out=out;
	}
	
	public void printLine(String string) {
		
		out.println(string);
	}
	public void print(String string) {
		
		out.print(string);
	}
	@Override
	public String readLine() throws IOException {
	
		return br.readLine();
	}

}

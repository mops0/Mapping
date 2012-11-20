package com.szymczyszyn.mapping;

import java.io.IOException;

public interface TextConsole {
	public void printLine(String wiersz);
	public void print(String wiersz);
	public String readLine() throws IOException;
}

package com.szymczyszyn.mapping;

import java.io.IOException;

public interface IOInterface {
	public void out(String wiersz);
	public String in() throws IOException;
}

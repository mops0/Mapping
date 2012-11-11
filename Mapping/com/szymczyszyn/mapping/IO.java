package com.szymczyszyn.mapping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class IO implements IOInterface {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	@Override
	public void out(String wiersz) {
		System.out.println(wiersz);
		
	}

	@Override
	public String in() throws IOException  {
		
		
		
			return br.readLine();
		
		
	}

}

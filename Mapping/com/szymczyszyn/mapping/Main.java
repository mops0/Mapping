package com.szymczyszyn.mapping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		Mapping2 mapping = new Mapping2(new HashMap<String,String>(),new TextConsoleImpl(new BufferedReader(new InputStreamReader(System.in)),System.out));
		mapping.init();

	}

}

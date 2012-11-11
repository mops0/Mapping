package com.szymczyszyn.mapping;

import java.io.IOException;
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		Mapping mapping = new Mapping(new IO());
		mapping.init();

	}

}

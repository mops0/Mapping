package com.szymczyszyn.mapping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException, Exception {
		
		Mapping2 mapping = new Mapping2(new TextConsoleImpl(new BufferedReader(new InputStreamReader(System.in)),System.out));
		mapping.init();

	}

}

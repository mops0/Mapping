package com.szymczyszyn.testowe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mapping {

	public void init() throws IOException
	{
		while(true)
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(br.readLine());
		}
	}
	
}

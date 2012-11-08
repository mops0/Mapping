package com.szymczyszyn.testowe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mapping {

	String komenda;
	String klucz;
	String wartosc;
	public void init() throws IOException
	{
		while(true)
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			analizujWiersz(br.readLine());
			System.out.println(komenda+" "+klucz+" "+wartosc);
		}
	}
	public void analizujWiersz(String wiersz)
	{
		StringTokenizer st = new StringTokenizer(wiersz);
		if(st.hasMoreTokens()) komenda=st.nextToken();
		if(st.hasMoreTokens()) klucz=st.nextToken();
		if(st.hasMoreTokens()) wartosc=st.nextToken();
	}
	
	
}

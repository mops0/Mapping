package com.szymczyszyn.testowe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Mapping {

	String komenda="";
	String klucz;
	String wartosc;
	Map<String,String> map = new HashMap<String,String>();
	public void init() throws IOException
	{
		while(!komenda.equals("exit"))
		{
			System.out.print(">");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			analizujWiersz(br.readLine());
			
			wykonajKomende(komenda);
			
		}
	}
	public void analizujWiersz(String wiersz)
	{
		StringTokenizer st = new StringTokenizer(wiersz);
		if(st.hasMoreTokens()) komenda=st.nextToken();
		if(st.hasMoreTokens()) klucz=st.nextToken();
		if(st.hasMoreTokens()) wartosc=st.nextToken();
	}
	public void wykonajKomende(String komenda)
	{
		if(komenda.equals("set"))
		{
			String wartosc2=map.get(klucz);
			if (wartosc2!=null) System.out.println(wartosc2);
			map.put(klucz, wartosc);
		}
		if(komenda.equals("get"))
		{
			if (map.containsKey(klucz)) System.out.println(map.get(klucz));
		}
		if(komenda.equals("keys"))
		{
			Set<String> klucze = map.keySet();
			Iterator<String> iter = klucze.iterator();
			while(iter.hasNext())
			{
				System.out.println(iter.next());
			}
		}
	}
	
}

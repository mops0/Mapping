package com.szymczyszyn.mapping;


import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
public class Mapping {

	private String komenda="";
	private String klucz;
	private String wartosc;
	public IOInterface io;
	private Map<String,String> map = new HashMap<String,String>();
	public Mapping (IOInterface io) {
		this.io=io;
	}
	public void init() throws IOException
	{	
		while(!komenda.equals("exit"))
		{
			System.out.print(">");
			
			analizujWiersz(io.in());
	
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
			if (wartosc2!=null) io.out(wartosc2);
			map.put(klucz, wartosc);
		}
		if(komenda.equals("get"))
		{
			if (map.containsKey(klucz)) io.out(map.get(klucz));
		}
		if(komenda.equals("keys"))
		{
			Set<String> klucze = map.keySet();
			Iterator<String> iter = klucze.iterator();
			while(iter.hasNext())
			{
				io.out(iter.next());
			}
		}
	}
	public String getKomenda() {
		return komenda;
	}
	public void setKomenda(String komenda) {
		this.komenda = komenda;
	}
	public String getKlucz() {
		return klucz;
	}
	public void setKlucz(String klucz) {
		this.klucz = klucz;
	}
	public String getWartosc() {
		return wartosc;
	}
	public void setWartosc(String wartosc) {
		this.wartosc = wartosc;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
	
}

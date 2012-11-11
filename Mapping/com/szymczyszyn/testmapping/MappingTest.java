package com.szymczyszyn.testmapping;

import static org.junit.Assert.*;

import java.util.Map;


import com.szymczyszyn.mapping.*;
import org.junit.Test;

public class MappingTest {

	
	@Test
	public void testAnalizujWiersz() {
		IO io = new IO();
		Mapping mapping = new Mapping(io);
		mapping.analizujWiersz("set polska warszawa");
		assertTrue(mapping.getKomenda().equals("set"));
		assertTrue(mapping.getKlucz().equals("polska"));
		assertTrue(mapping.getWartosc().equals("warszawa"));
	}

	@Test
	public void testWykonajKomende() {
		IOTest io = new IOTest();
		Mapping mapping = new Mapping(io);
		Map<String,String> map =mapping.getMap();
		
		io.setStringIn("set polska warszawa");
		mapping.analizujWiersz(io.in());
		mapping.wykonajKomende("set");
		assertTrue(map.get("polska").equals("warszawa"));
		assertTrue(io.getStringOutList().size()==0);
		
		io.setStringIn("set polska opole");
		mapping.analizujWiersz(io.in());
		mapping.wykonajKomende("set");
		assertTrue(map.get("polska").equals("opole"));
		assertTrue(io.getStringOutList().get(0).equals("warszawa"));
		
		io.setStringIn("set holandia amsterdam");
		mapping.analizujWiersz(io.in());
		mapping.wykonajKomende("set");
		assertTrue(map.get("holandia").equals("amsterdam"));
		
		io.setStringIn("set wegry budapeszt");
		mapping.analizujWiersz(io.in());
		mapping.wykonajKomende("set");
		

		io.setStringIn("keys");
		mapping.analizujWiersz(io.in());
		mapping.wykonajKomende("keys");
		assertTrue(io.getStringOutList().get(1).equals("holandia"));
		assertTrue(io.getStringOutList().get(2).equals("polska"));
		assertTrue(io.getStringOutList().get(3).equals("wegry"));
		
	}

}

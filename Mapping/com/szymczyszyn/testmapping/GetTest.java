package com.szymczyszyn.testmapping;



import static org.junit.Assert.*;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import com.szymczyszyn.mapping.Get;
import com.szymczyszyn.mapping.TextConsole;

public class GetTest {

	Map<String,String> map;
	TextConsole mockConsole;
	@Before
	public void setUp() {
		mockConsole=EasyMock.createMock(TextConsole.class);
		map=new HashMap<String,String>();
	}

	@Test
	public void test() throws IOException {
		
		EasyMock.replay(mockConsole);
		Get get= new Get("polska",map,mockConsole);
		get.execute();
		EasyMock.verify(mockConsole);
		
		EasyMock.reset(mockConsole);
		mockConsole.printLine("warszawa");
		EasyMock.replay(mockConsole);
		
		map.put("polska","warszawa");
		get= new Get("polska",map,mockConsole);
		get.execute();
		EasyMock.verify(mockConsole);
		
		get= new Get(null,map,mockConsole);
		assertFalse(get.isValid());
		
		get= new Get("polska",map,mockConsole);
		assertTrue(get.isValid());
	}
	
}

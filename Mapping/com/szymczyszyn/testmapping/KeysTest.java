package com.szymczyszyn.testmapping;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import com.szymczyszyn.mapping.Keys;
import com.szymczyszyn.mapping.TextConsole;

public class KeysTest {

	Map<String,String> map;
	TextConsole mockConsole;
	@Before
	public void setUp() throws Exception 
	{
		map=new HashMap<String,String>();
		mockConsole=EasyMock.createMock(TextConsole.class);
	}

	@Test
	public void test() {
		
		mockConsole.printLine("holandia");
		mockConsole.printLine("polska");
		EasyMock.replay(mockConsole);
		
		map.put("polska", "warszawa");
		map.put("holandia","amsterdam");
		Keys keys= new Keys(map,mockConsole);
		keys.execute();
		EasyMock.verify(mockConsole);
	}

}

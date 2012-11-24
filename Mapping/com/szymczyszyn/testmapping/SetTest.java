package com.szymczyszyn.testmapping;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import com.szymczyszyn.mapping.Set;
import com.szymczyszyn.mapping.TextConsole;

public class SetTest {

	Map<String,String> map;
	TextConsole mockConsole;
	Set set;
	@Before
	public void setUp() throws Exception {
		map=new HashMap<String,String>();
		mockConsole=EasyMock.createMock(TextConsole.class);
		
		
	}

	@Test
	public void test() {
		EasyMock.replay(mockConsole);
		set=new Set("polska","warszawa",map,mockConsole);
		set.execute();
		EasyMock.verify(mockConsole);
		assertTrue(map.get("polska").equals("warszawa"));
		
		EasyMock.reset(mockConsole);
		mockConsole.printLine("warszawa");
		EasyMock.replay(mockConsole);
		set=new Set("polska","gniezno",map,mockConsole);
		set.execute();
		EasyMock.verify(mockConsole);
		
		set=new Set("polska",null,map,mockConsole);
		assertFalse(set.isValid());
		set=new Set(null,null,map,mockConsole);
		assertFalse(set.isValid());
		set=new Set("polska","gniezno",map,mockConsole);
		assertTrue(set.isValid());
	}

}

package com.szymczyszyn.testmapping;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.szymczyszyn.mapping.Mapping2;
import com.szymczyszyn.mapping.TextConsole;

public class Mapping2Test {

	TextConsole testConsole;
	Map<String,String> map;
	Mapping2 mapping;
	@Before
	public void setUp() throws Exception {
	
		this.testConsole=EasyMock.createMock(TextConsole.class);
		this.map=new HashMap<String,String>();
		this.mapping=new Mapping2(map,testConsole);
		
	}
	
	@Test
	public void test() throws IOException {
		
	
	}

}

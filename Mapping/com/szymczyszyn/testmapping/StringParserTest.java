package com.szymczyszyn.testmapping;

import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import com.szymczyszyn.mapping.StringParser;
import com.szymczyszyn.mapping.StringParserFactory;
import com.szymczyszyn.mapping.TextConsole;

public class StringParserTest {
	
	StringParser parser;
	
	@Test
	public void test() {
		parser=StringParserFactory.create("set polska warszawa");
		assertTrue(parser.getCommandType().equals("set"));
		assertTrue(parser.getKey().equals("polska"));
		assertTrue(parser.getValue().equals("warszawa"));
		
		parser.parseString("set holandia amsterdam");
		assertTrue(parser.getCommandType().equals("set"));
		assertTrue(parser.getKey().equals("holandia"));
		assertTrue(parser.getValue().equals("amsterdam"));
	}

}

package com.szymczyszyn.testmapping;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.easymock.EasyMock;

import org.junit.Test;

import com.szymczyszyn.mapping.Command;
import com.szymczyszyn.mapping.StringParser;

import com.szymczyszyn.mapping.TextConsole;


public class StringParserTest {
	Command command; 
	StringParser parser;
	
	@Test
	public void test() {
		
		TextConsole mockConsole=EasyMock.createMock(TextConsole.class);
		
		parser=StringParser.create();
		command =parser.parseString("set polska warszawa", new HashMap<String,String>(),mockConsole);
		assertTrue(command.getCommandType().equals("set"));
		
		command =parser.parseString("set holandia", new HashMap<String,String>(),mockConsole);
		assertTrue(command.getClass().equals(com.szymczyszyn.mapping.Error.class));
		
		command =parser.parseString("get", new HashMap<String,String>(),mockConsole);
		assertTrue(command.getClass().equals(com.szymczyszyn.mapping.Error.class));
	}

}

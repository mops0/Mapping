package com.szymczyszyn.testmapping;

import static org.junit.Assert.*;

import java.io.IOException;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import com.szymczyszyn.mapping.TextConsole;
import com.szymczyszyn.mapping.TextUser;

public class TextUserTest {

	TextConsole mockConsole;
	TextUser textUser;
	@Before
	public void setUp() throws Exception {
		mockConsole=EasyMock.createMock(TextConsole.class);
		textUser=new TextUser(mockConsole);
		
	}

	@Test
	public void test() throws IOException {
		EasyMock.expect(mockConsole.readLine()).andReturn("costam");
		mockConsole.printLine("blabla");
		
		mockConsole.printLine("blabla");
		EasyMock.replay(mockConsole);
		textUser.writeSomething();
		assertTrue(textUser.readSomething().equals("costam"));
		textUser.writeSomething();
		EasyMock.verify(mockConsole);
	}

}

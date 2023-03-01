// Copyright(c)2023 Excalibur Solutions, Inc. - All Rights Reserved

package com.excalibursolutions.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JTextField;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DisplayTest {

	Display display;
	
	@BeforeEach
	void setUp() throws Exception {
		display = new Display();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNotNull() {
		assertNotNull(display);
	}

	@Test
	void testCreateGuiComponentReturnsJTextField() {
		Object obj = display.createGuiComponent();
		assertNotNull(obj);
		assertTrue(obj instanceof JTextField);
	}
	
	@Test
	void testJTextFieldIsNotEditable() {
		JTextField field = display.createGuiComponent();
		assertFalse(field.isEditable());
	}
	
	@Test
	void testJTextFieldHasCorrectSize() {
		JTextField field = display.createGuiComponent();
		assertEquals(150.0, field.getPreferredSize().width, 0.001);
		assertEquals(50.0, field.getPreferredSize().height, 0.001);
	}
	
	@Test
	void testUpdateSetsTheComponentText() {
		JTextField field = display.createGuiComponent();
		assertEquals("", field.getText());
		display.update("1");
		assertEquals("1", field.getText());
	}
}

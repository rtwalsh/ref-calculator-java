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
}

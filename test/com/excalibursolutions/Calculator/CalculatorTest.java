// Copyright(c)2023 Excalibur Solutions, Inc. - All Rights Reserved

package com.excalibursolutions.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JTextField;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Display display;
	
	@BeforeEach
	void setUp() throws Exception {
		display = new Display();
	}

	@AfterEach
	void tearDown() throws Exception {
		display = null;
	}

	@Test
	void testConstructor() {
		assertNotNull(display);
	}

	@Test
	void testCreateGuiComponentCreatesJTextField() {
		Object obj = display.createGuiComponent();
		assertNotNull(obj);
		assertTrue(obj instanceof JTextField);
	}
}

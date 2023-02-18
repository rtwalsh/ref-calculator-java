// Copyright(c)2023 Excalibur Solutions, Inc. - All Rights Reserved

package com.excalibursolutions.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JButton;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClearButtonTest {

	private ClearButton button;
	private MockCalculator calculator;
	
	@BeforeEach
	void setUp() throws Exception {
		calculator = new MockCalculator();
		button = new ClearButton(calculator);
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
		button = null;
	}

	@Test
	void testConstructor() {
		assertNotNull(button);
	}
	
	@Test
	void testCreateGuiButtonCreatesJButton() {
		Object obj = button.createGuiButton();
		assertNotNull(obj);
		assertTrue(obj instanceof JButton);
		
		JButton btn = (JButton)obj;
		assertEquals("C", btn.getText());
	}

	@Test
	void testClickingTheButtonShouldNotifyTheCalculator() {
		JButton btn = button.createGuiButton();
		btn.doClick();
		assertTrue(calculator.clearWasCalled);
	}
}

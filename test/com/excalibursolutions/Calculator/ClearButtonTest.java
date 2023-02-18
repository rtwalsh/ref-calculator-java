// Copyright(c)2023 Excalibur Solutions, Inc. - All Rights Reserved

package com.excalibursolutions.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JButton;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClearButtonTest {

	private ClearButton button;
	
	@BeforeEach
	void setUp() throws Exception {
		button = new ClearButton();
	}

	@AfterEach
	void tearDown() throws Exception {
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

}

// Copyright(c)2023 Excalibur Solutions, Inc. - All Rights Reserved

package com.excalibursolutions.Calculator;

import javax.swing.JTextField;

public class Display {
	
	private JTextField field;
	
	public JTextField createGuiComponent() {
		field = new JTextField();
		field.setEditable(false);
		return field;
	}

	public void update(String newText) {
		field.setText(newText);
	}
}

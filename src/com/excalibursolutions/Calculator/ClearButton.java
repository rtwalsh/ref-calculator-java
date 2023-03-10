// Copyright(c)2023 Excalibur Solutions, Inc. - All Rights Reserved

package com.excalibursolutions.Calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ClearButton {
	
	private Calculator calculator;
	private JButton button;
	
	public ClearButton(Calculator theCalculator) {
		calculator = theCalculator;
	}
	
	public JButton createGuiButton() {
		button = new JButton("C");
		button.setPreferredSize(new Dimension(50, 50));
		button.setFocusPainted(false);
		/*
		button.setBackground(Color.RED);
		button.setOpaque(true);
		*/
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				calculator.clear();
			}
		});
		
		return button;
	}

	
}

// Copyright(c)2023 Excalibur Solutions, Inc. - All Rights Reserved

package com.excalibursolutions.Calculator;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator extends JFrame {

	public static void main(String[] args) {
		System.out.println("Starting the Calculator");
		
		new Calculator();
	}

	ClearButton clearButton;
	Display display;
	
	public Calculator() {
		super("Calculator");
		
		clearButton = new ClearButton(this);
		display = new Display();
		
		JPanel row1 = new JPanel();
		row1.add(clearButton.createGuiButton());
		row1.add(display.createGuiComponent());
		add(row1);
		
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		setSize(250, 350);
		setPreferredSize(getSize());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void clear() {
		
	}
}

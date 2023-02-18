// Copyright(c)2023 Excalibur Solutions, Inc. - All Rights Reserved

package com.excalibursolutions.Calculator;

public class MockCalculator extends Calculator {

	public boolean clearWasCalled;
	
	public MockCalculator() {
		super();
		clearWasCalled = false;
	}
	
	@Override
	public void clear() {
		clearWasCalled = true;
	}
}

package com.stefanini.dojo.numerosromanos;

public enum NumerosRomanos {

	I(1),
	V(5),
	X(10),
	L(50),
	C(100),
	D(500),
	M(1000);
	
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	NumerosRomanos(int value) {
		this.value = value;
	}
}

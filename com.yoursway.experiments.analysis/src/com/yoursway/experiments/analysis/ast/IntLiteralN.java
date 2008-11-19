package com.yoursway.experiments.analysis.ast;

public class IntLiteralN extends Node {
	
	private final long value;

	public IntLiteralN(long value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "" + value;
	}

}

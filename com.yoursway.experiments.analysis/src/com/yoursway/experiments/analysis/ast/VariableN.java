package com.yoursway.experiments.analysis.ast;

public class VariableN extends Node {
	
	private final String name;

	public VariableN(String name) {
		if (name == null)
			throw new NullPointerException("name is null");
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}

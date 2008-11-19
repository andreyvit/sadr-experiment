package com.yoursway.experiments.analysis.ast;

public class FieldN extends Node {

	private final Node receiver;
	private final String name;

	public FieldN(Node receiver, String name) {
		if (receiver == null)
			throw new NullPointerException("receiver is null");
		if (name == null)
			throw new NullPointerException("name is null");
		this.receiver = receiver;
		this.name = name;
	}

	@Override
	public String toString() {
		return receiver + "." + name;
	}

}

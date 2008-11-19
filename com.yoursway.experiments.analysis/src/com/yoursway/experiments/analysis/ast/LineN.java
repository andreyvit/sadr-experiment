package com.yoursway.experiments.analysis.ast;

public class LineN extends Node {

	private final String label;

	private final Node node;

	public LineN(String label, Node node) {
		if (node == null)
			throw new NullPointerException("node is null");
		this.label = label;
		this.node = node;
	}

	@Override
	public String toString() {
		return (label == null ? "" : label + ":\n") + "  " + node.toString();
	}

}

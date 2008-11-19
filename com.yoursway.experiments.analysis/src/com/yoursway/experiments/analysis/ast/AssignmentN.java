package com.yoursway.experiments.analysis.ast;

public class AssignmentN extends Node {
	
	private final Node lhs;
	private final Node rhs;

	public AssignmentN(Node lhs, Node rhs) {
		if (lhs == null)
			throw new NullPointerException("lhs is null");
		if (rhs == null)
			throw new NullPointerException("rhs is null");
		this.lhs = lhs;
		this.rhs = rhs;
	}

	@Override
	public String toString() {
		return lhs + " = " + rhs;
	}

}

package com.yoursway.experiments.analysis.ast;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

public class BodyN extends Node {

	private final List<LineN> nodes;

	public BodyN(LineN... nodes) {
		this.nodes = new ArrayList<LineN>(asList(nodes));
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Node node : nodes)
			result.append(node).append("\n");
		return result.toString();
	}

}

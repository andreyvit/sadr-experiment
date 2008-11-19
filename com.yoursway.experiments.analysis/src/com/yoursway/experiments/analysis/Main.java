package com.yoursway.experiments.analysis;

import com.yoursway.experiments.analysis.ast.AssignmentN;
import com.yoursway.experiments.analysis.ast.BodyN;
import com.yoursway.experiments.analysis.ast.FieldN;
import com.yoursway.experiments.analysis.ast.IntLiteralN;
import com.yoursway.experiments.analysis.ast.LineN;
import com.yoursway.experiments.analysis.ast.VariableN;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		LineN line1 = new LineN(null, new AssignmentN(new FieldN(new VariableN(
				"x"), "y"), new IntLiteralN(42)));
		LineN line2 = new LineN(null, new AssignmentN(new VariableN("foo"),
				new VariableN("x")));
		BodyN body = new BodyN(line1, line2);
		System.out.println(body);
	}

}

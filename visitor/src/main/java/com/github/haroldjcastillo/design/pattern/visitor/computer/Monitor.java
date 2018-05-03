package com.github.haroldjcastillo.design.pattern.visitor.computer;

public class Monitor implements ComputerPart {

	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}

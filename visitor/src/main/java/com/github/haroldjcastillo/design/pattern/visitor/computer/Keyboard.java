package com.github.haroldjcastillo.design.pattern.visitor.computer;

public class Keyboard implements ComputerPart {

	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}

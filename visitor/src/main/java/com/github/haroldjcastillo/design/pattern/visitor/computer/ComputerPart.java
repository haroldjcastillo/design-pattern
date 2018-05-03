package com.github.haroldjcastillo.design.pattern.visitor.computer;

public interface ComputerPart {
	
	public void accept(ComputerPartVisitor computerPartVisitor);
}

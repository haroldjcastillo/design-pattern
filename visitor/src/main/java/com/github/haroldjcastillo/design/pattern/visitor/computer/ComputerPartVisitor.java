package com.github.haroldjcastillo.design.pattern.visitor.computer;

public interface ComputerPartVisitor {
	
	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);

}

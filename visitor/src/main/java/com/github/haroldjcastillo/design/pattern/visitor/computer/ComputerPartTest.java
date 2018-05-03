package com.github.haroldjcastillo.design.pattern.visitor.computer;

import org.junit.Test;

public class ComputerPartTest {

	@Test
	public void test() {
		final ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}

}

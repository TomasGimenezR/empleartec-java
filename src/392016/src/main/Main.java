package main;

import operaciones.*;

public class Main {

	public static void main(String[] args) {
		Operacion op = new Suma(1,9);
		System.out.println(op.calcular());
		op = new Resta(4,2);
		System.out.println(op.calcular());

	}

}

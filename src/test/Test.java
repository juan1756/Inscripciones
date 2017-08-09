package test;

import controlador.Controlador;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Alumnos:\n");
		for(Object o : Controlador.getInstancia().getAlumnos())
			System.out.println(o.toString());
		
		System.out.println("\nCursos:\n");
		for(Object o : Controlador.getInstancia().getCursos())
			System.out.println(o.toString());
		
		System.out.println("\nMaterias:\n");
		for(Object o : Controlador.getInstancia().getMaterias())
			System.out.println(o.toString());
		
		System.out.println("\nProfesores:\n");
		for(Object o : Controlador.getInstancia().getProfesores())
			System.out.println(o.toString());
	}
}

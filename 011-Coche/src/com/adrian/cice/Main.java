package com.adrian.cice;

public class Main {

	public static void main(String[] args) {


		Coche coche1 = new Coche();
		
		System.out.println("El modelo del coche es: " + coche1.getModelo());
		System.out.println("El color del coche es: " + coche1.getColor());
		System.out.println(coche1.getPinturaMetalizada() + " tiene la pintura metalizada");
	}

}

package com.adrian.cice;

import java.util.Scanner;

/**
 * Dado en cent�metro el ancho y el alto de un rect�ngulo. 
 * �Cu�l ser� el per�metro y el �rea?
 * 
 * @author Adrian Stan
 *
 */

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		double a, b, resultado;
		
		
		System.out.print("Introduce el ancho de un rectangulo en cm: ");
		a = sc.nextDouble();
		System.out.print("Introduce el alto de un rectangulo en cm: ");
		b = sc.nextDouble();
		
		System.out.println("El perimetro del rectangulo es = " + 2 * (a + b) + " cm");
		
		System.out.println("El area del rectangulo es = " + a * b + " cm� ");
	}

}

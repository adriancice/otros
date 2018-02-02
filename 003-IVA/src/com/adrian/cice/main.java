package com.adrian.cice;

/**
 *  Realiza un programa que pida un precio y calcule
 *	a) El IVA a pagar
 *	b) Suponiendo que sea un precio sin IVA, calcular la suma total (precio + IVA)
 *	c) Suponiendo que sea un precio con IVA, calcular el precio sin IVA
 *  @author Adrian Stan
 */

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double precio, iva;
		
		
		System.out.print("Introduce un precio en € : ");
		precio = sc.nextDouble();
		iva = precio * 0.21;
		System.out.println("a)  El IVA a pagar es " + iva + " €");
		System.out.println("b)  Suponiendo que sea un precio sin IVA, la suma del precio + IVA es = " + (precio + iva));
		System.out.println("c)  Suponiendo que sea un precio con IVA, el precio sin IVA es = " + (precio / 1.21));
		
	}
	

}

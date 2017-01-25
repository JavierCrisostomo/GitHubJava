package com.java.orion;
import java.util.*;

public class Test {
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		System.out.println("Ingrese un dato:");
		String dato = reader.nextLine();
		System.out.println("Usted ha ingresado: " + dato);
		System.out.println("Ingrese un Numero:");
		int num1 = reader.nextInt();
		System.out.println("Usted ha ingresado: " + num1);
		reader.close();
	}

}

package com.java.basics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingStreamRader {
	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Por favor ingrese su nombre:");
		String nombre = br.readLine();
		System.out.println("Por favor ingrese su edad:");
		int edad = Integer.parseInt(br.readLine());
		System.out.println("Hola: " + nombre + " y usted tiene " + edad + "años!!");
	}

}

package com.java.orion;

public class ComparingStrings {

	public static void main(String[] args) {
			String myName = "Luis Caballero";
			String yourName = "Luis Meza";
			
			String myFirstName = myName.substring(0,4);
			String yourFirstName = yourName.substring(0, 4);
			
			System.out.println(myFirstName);
			System.out.println(yourFirstName);
			
			//Don't use == to compare two strings
			//if(myFirstName == yourFirstName){
			if(myFirstName.equals(yourFirstName)){
				System.out.println("We have the same name");	
			}
			else{
				System.out.println("Our names are different");
			}
	}
}

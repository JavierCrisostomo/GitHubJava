package com.java.poo.LendingLibrary;

public class Main {

	public static void main(String[] args) {
		NameManager javierManager = new NameManager();
		NameManager joanManager = new NameManager();
		
		javierManager.setName("Javier Crisostomo");
		System.out.println(javierManager.getFirstName());

		joanManager.setName("Joan Smith");
		System.out.println(joanManager.getSurname());
	}
}

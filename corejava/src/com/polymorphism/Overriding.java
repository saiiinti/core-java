package com.polymorphism;

public class Overriding extends Methodoveriding {
	@Override
	void drink()

	{
		System.out.println("oreo");
		
	}
	void display() {
		drink();
		super.drink();
	}
	public static void main(String [] args) {
		Overriding d = new Overriding();
		d.display();
	}
	
}

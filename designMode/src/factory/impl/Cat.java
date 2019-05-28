package factory.impl;

import factory.inter.Animal;

public class Cat implements Animal{

	@Override
	public void shout() {
		System.out.println("This is Animal-- Cat");
		
	}

}

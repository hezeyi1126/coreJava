package factory.test;

import factory.preducer.AnimalFactory;

public class FactoryTest {

	public static void main(String[] args) {
		AnimalFactory.preduce("cat").shout();
	}
}

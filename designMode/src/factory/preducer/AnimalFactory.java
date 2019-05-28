package factory.preducer;

import factory.impl.Cat;
import factory.impl.Dog;
import factory.inter.Animal;

public class AnimalFactory {

	public static Animal preduce(String type) {
		if("cat".equals(type)) {
			return new Cat();
		}else if("dog".equals(type)) {
			return new Dog();
		}
		return null;
	}
	
	
}

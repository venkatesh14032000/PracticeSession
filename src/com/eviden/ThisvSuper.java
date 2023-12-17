package com.eviden;

class Animal{
	public void eat() {
		System.out.println("This is Animal: eat");
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("This is Dog: eat");
	}
	public void eatanyway() {
		this.eat();
	}
}

public class ThisvSuper {

	public static void main(String[] args) {
		Animal a= new Animal();
		a.eat();
		Dog d= new Dog();
		d.eat();
		d.eatanyway();

	}

}

package com.bptn.course._13_abstract_classes;

public abstract class Animal {
	
	public abstract void sound(); 
	
	public void sleep() {
		System.out.println("Animal is sleeping"); 
	}
	

}

class Dog extends Animal{
	@Override
	public void sound() {
		System.out.println("Dog barks"); 
	}
	
	public void play() {
		System.out.println("Dog is playing");
	}
}


class Cat extends Animal{
	@Override
	public void sound() {
		System.out.println("Cat meows"); 
	}
}


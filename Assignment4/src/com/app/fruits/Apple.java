package com.app.fruits;

public class Apple extends Fruit {

	public Apple(String name, double weight, String color) {
		super(name, weight, color);
	}

	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String taste() {
		return "sweet and sour";
	}

}

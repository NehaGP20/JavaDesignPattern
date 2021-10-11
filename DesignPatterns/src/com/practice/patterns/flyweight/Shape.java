package com.practice.patterns.flyweight;

public abstract class Shape {

	//Here we have separated extrinsic fields and passed them as parameter
	void draw(int radius, String fillColor, String lineColor) {

	}

	void draw(int length, int breadth, String fillStyle) {

	}

}

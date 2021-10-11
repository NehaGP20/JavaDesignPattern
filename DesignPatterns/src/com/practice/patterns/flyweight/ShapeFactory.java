package com.practice.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	
	//String - type
	private static Map<String, Shape> maps = new HashMap<>();
	
	public static Shape getShape(String type) {
		Shape shape = null;
		
		//If any similar type of instance in present in hashmap then we would get the same type of instance  
		if(maps.get(type) != null) {
			shape = maps.get(type);
		} else {
			if(type.equals("circle")) {
				shape = new Circle();
			}else if(type.equals("rectangle")){
				shape = new Rectangle();
			}
			maps.put(type, shape);
		}
		
		return shape;
	}
}

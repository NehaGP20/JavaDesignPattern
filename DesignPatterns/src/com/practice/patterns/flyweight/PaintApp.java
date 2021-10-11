package com.practice.patterns.flyweight;

public class PaintApp {
	
	public void render(int noOfShapes) {
		
	Shape shape = null;
	for(int i = 1;i <= noOfShapes;i++) {
		
		if(i%2 == 0) {
			shape = ShapeFactory.getShape("circle");
			shape.draw(i, "red", "white");
		}else {
			shape = ShapeFactory.getShape("rectangle");
			shape.draw(i, i+i, "dotted");
		}
		
		
	}
		
		
//		Shape[] objs = new Shape[noOfShapes+1];
//		for(int i = 1;i <= noOfShapes;i++) {
//			//In even no of indices creating a circle and assigning a value for it 
//			if(i%2 == 0) {
//				objs[i] = new Circle();
//				((Circle) objs[i]).setRaduis(i);
//				((Circle) objs[i]).setFillColor("red");;
//				((Circle) objs[i]).setLineColor("Blue");
//				objs[i].draw(); 
//				//Invoke draw method in circle by achieving Runtime polymorphism
//				
//			}else {
//				objs[i] = new Rectangle();
//				((Rectangle) objs[i]).setLength(i);
//				((Rectangle) objs[i]).setBreadth(i+i);
//				((Rectangle) objs[i]).setFillStyle("dotted");
//				objs[i].draw();
//			}
//		}
		
	}

}

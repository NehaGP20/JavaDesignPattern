package com.practice.patterns.flyweight;

public class Circle extends Shape {

	private String label;
//	private int raduis;
//	private String fillColor;
//	private String lineColor;
	
	public Circle() {
		this.label = "Circle";
	}
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}


	public void draw(int radius, String fillColor, String lineColor) {
		System.out.println("Drawing a " + label + " of raduis " + radius 
				+ " of fillcolor " + fillColor + " and linecolor " + lineColor);
	}
	
//	public int getRaduis() {
//		return raduis;
//	}
//
//	public void setRaduis(int raduis) {
//		this.raduis = raduis;
//	}
//
//	public String getFillColor() {
//		return fillColor;
//	}
//
//	public void setFillColor(String fillColor) {
//		this.fillColor = fillColor;
//	}
//
//	public String getLineColor() {
//		return lineColor;
//	}
//
//	public void setLineColor(String lineColor) {
//		this.lineColor = lineColor;
//	}


}

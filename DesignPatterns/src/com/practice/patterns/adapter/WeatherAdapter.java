package com.practice.patterns.adapter;

public class WeatherAdapter {
	
	public int findTemperature(int zipcode) {
		String city = null;
		
		if(zipcode == 560011) {
			city = "Jayanagar";
		}
		
		WeatherFinder finder = new WeatherFinderImpl();
		int temperature = finder.find(city);
		return temperature;
	}

}

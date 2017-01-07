package com.cihangll.conversion;

public class Converter {

	public double feetToMeter(double feet) {
		double meter = feet / 3.2808;
		return meter;
	}

	public double meterToFeet(double meter) {
		double feet = meter * 3.2808;
		return feet;
	}

	public double kelvinToCelsius(double kelvin) {
		double celsius = kelvin - 273.0;
		return celsius;
	}

	public double celciusToKelvin(double celcius) {
		double kelvin = celcius + 273.0;
		return kelvin;
	}

}

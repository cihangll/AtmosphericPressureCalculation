package com.cihangll.services;

import com.cihangll.conversion.Converter;

public class ConverterServiceImpl implements ConverterService {

	private Converter converter;

	public ConverterServiceImpl() {
		converter = new Converter();
	}
	
	@Override
	public double feetToMeter(double feet) {
		return converter.feetToMeter(feet);
	}

	@Override
	public double meterToFeet(double meter) {
		return converter.meterToFeet(meter);
	}

	@Override
	public double kelvinToCelsius(double kelvin) {
		return converter.kelvinToCelsius(kelvin);
	}

	@Override
	public double celciusToKelvin(double celcius) {
		return converter.celciusToKelvin(celcius);
	}

}

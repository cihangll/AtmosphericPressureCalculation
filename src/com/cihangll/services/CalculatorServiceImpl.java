package com.cihangll.services;

import com.cihangll.calculation.Calculator;

public class CalculatorServiceImpl implements CalculatorService {

	private Calculator calculator;

	public CalculatorServiceImpl(double feet, double inputTemperature, double type) {
		calculator = new Calculator(feet, inputTemperature, type);
	}

	public double temperatureCalculationCelcius() {
		return calculator.temperatureCalculationCelcius();
	}

	public double pressureCalculate() {
		return calculator.pressureCalculate();
	}

	public double densityCalculate() {
		return calculator.densityCalculate();
	}

	public double speedOfSoundCalculate() {
		return calculator.speedOfSoundCalculate();
	}

	public double viscosityCalculate() {
		return calculator.viscosityCalculate();
	}

}

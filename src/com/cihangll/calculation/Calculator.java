package com.cihangll.calculation;

import com.cihangll.conversion.Converter;
import com.cihangll.main.Variables;

public class Calculator {

	private double feet;
	private double inputTemperature;
        private double type;
        
	private Converter converter;

	public Calculator(double feet, double inputTemperature, double type) {
		this.feet = feet;
		this.inputTemperature = inputTemperature;
                this.type = type;
                
                converter = new Converter();
	}

	public double temperatureCalculationCelcius() {
		if (feet <= Variables.getHeightFt()) {
			return (Variables.getT0C() + inputTemperature) - 1.98 * (feet / 1000);
		} else {
			// Traposfer sabit sicakligi geri dondurduk.
			return Variables.gettC();
		}
	}

	public double pressureCalculate() {
		double meter = converter.feetToMeter(feet);
		double step1 = meter / Variables.getT0K();
		double step2 = 1.0 - Variables.getB() * step1;
		double step3 = Math.pow(step2, 5.2561);

		return Variables.getP0() * step3;

	}

	public double densityCalculate() {
		double temperature = temperatureCalculationCelcius();
		double temperature_K = converter.celciusToKelvin(temperature);
		double pressure = pressureCalculate();

		double density = pressure / (Variables.getR() * temperature_K);
		return density;
	}

	public double speedOfSoundCalculate() {
		double R = Variables.getR();

		double temperature = temperatureCalculationCelcius();
		double temperature_K = converter.celciusToKelvin(temperature);

		double step1 = Variables.getY() * R * temperature_K;
		// Hava ses hizi sabiti referans aldik.
		double airSpeedOfSound = Math.pow(step1, Variables.getAirSpeedOfSound());
		return airSpeedOfSound;
	}

	/*
	 * Maddenin akmazligi, viskozite degeri,maddenin molekuler akiskanlik hizida
	 * diyebiliriz.
	 */
	public double viscosityCalculate() {
		double temperature = converter.celciusToKelvin(temperatureCalculationCelcius());

		double viscosityValue = this.type;
		double sutherlandConstantAir = Variables.getSutherlandConstantAir();
		double referenceViscosityAir = Variables.getReferenceViscosityAir();

		double step1 = (viscosityValue + sutherlandConstantAir) / (temperature + sutherlandConstantAir);
		double step2 = Math.pow((temperature / viscosityValue), 1.5);

		double viscosity = referenceViscosityAir * step1 * step2;
		return viscosity;
	}

        public double getFeet() {
            return feet;
        }

        public void setFeet(double feet) {
            this.feet = feet;
        }

        public double getInputTemperature() {
            return inputTemperature;
        }

        public void setInputTemperature(double inputTemperature) {
            this.inputTemperature = inputTemperature;
        }

        public double getType() {
            return type;
        }

        public void setType(double type) {
            this.type = type;
        }

        public Converter getConverter() {
            return converter;
        }

        public void setConverter(Converter converter) {
            this.converter = converter;
        }

}

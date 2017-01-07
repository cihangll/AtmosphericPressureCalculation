package com.cihangll.main;

/*
 * @author cihangullu
 * @version 1.0
 * @since 12.12.2016 
 * 
 * The International Standard Atmosphere (ISA)
 * 
 * #EN
 * The part where the constants will be found.
 * These values are ISA constant.If there are changes, calculations may be wrong.
 * 
 * #TR
 * Sabitlerin bulunacagi kisim burasi.
 * Buradaki degerler ISA sabitidir.Degisiklik yapilmasi sonucunda hesaplamalar degisebilir.
 * 
 * */
public class Variables {

	/* TEMEL SABITLER - BASIC CONSTANTS */

	// Yercekimi - gravity - m/s^2
	// private static final double g = 9.80665;
	// R gas sabiti - reas gas constant - J/kg K - m^2/s^2 K
	private static final double R = 287.05287;
	// ozgul isilar orani - Specific heat ratio
	private static final double y = 1.4;
	// Traposfer sicaklik dusum orani - Troposphere temperature drop rate
	private static final double b = -0.0065;
	// Hava ses hizi sabiti - Sound velocity constant
	private static final double air_speed_of_sound = 0.5;

	/* DENIZ SEVIYESI DEGERLERI - SEA LEVEL VALUES */

	// Basinc - Pressure - Pa
	private static final double p0 = 101325.0;
	// Sicaklik - Temperature - C
	private static final double t0_C = 15.0;
	// Sicaklik - Temperature - K
	private static final double t0_K = 288.15;
	// Yogunluk - Density - kg/m^3
	// private static final double density = 1.225;
	// Ses hizi - speed of sound - m/s
	// private static final double speed_of_sound_ms = 340.29;
	// Ses hizi - speed of sound - knots
	// private static final double speed_of_sound_kn = 661.5;

	/* TRAPOSFER DEGERLERI - TROPOSPHERE VALUES */

	// Yukseklik - Height - meter
	// private static final double height_m = 11000.0;
	// Yukseklik - Height - feet
	private static final double height_ft = 36089.23885;
	// Basinc - Pressure - Pa
	// private static final double pa = 22632.0;
	// Sicaklik - Temperature - C
	private static final double t_C = -56.5;
	// Sicaklik - Temperature - K
	// private static final double t_K = 216.65;

	// Yogunluk - Density - kg/m^3
	// private static final double t_density = 0.3639;
	// Ses hizi - speed of sound - m/s
	// private static final double t_speed_of_sound_ms = 295.07;
	// Ses hizi - speed of sound - knots
	// private static final double t_speed_of_sound_kn = 573.6;

	/* VISKOSITE HESABI DEGERLERI - VISCOSITY CALCULATE VALUES */
	private static final double temperature_air_reference = 291.15;
        private static final double azot_ref = 300.55;
        private static final double oksijen_ref = 292.25;
        private static final double karbonmonoksit_ref = 288.15;
        private static final double karbondioksit_ref = 293.15;
        private static final double hidrojen_ref = 293.85;
        private static final double amonyak_ref = 293.15;
        private static final double kukurtdioksit_ref = 293.65;
	
        private static final double sutherlandConstantAir = 120.0;
	private static final double referenceViscosityAir = 0.00001827;
        

	public static double getHeightFt() {
		return height_ft;
	}

	public static double getT0C() {
		return t0_C;
	}

	public static double gettC() {
		return t_C;
	}

	public static double getT0K() {
		return t0_K;
	}

	public static double getB() {
		return b;
	}

	public static double getP0() {
		return p0;
	}

	public static double getR() {
		return R;
	}

	public static double getY() {
		return y;
	}

	public static double getAirSpeedOfSound() {
		return air_speed_of_sound;
	}

	public static double getTemperatureAirReference() {
		return temperature_air_reference;
	}

	public static double getSutherlandConstantAir() {
		return sutherlandConstantAir;
	}

	public static double getReferenceViscosityAir() {
		return referenceViscosityAir;
	}

        public static double getAir_speed_of_sound() {
            return air_speed_of_sound;
        }

        public static double getT0_C() {
            return t0_C;
        }

        public static double getT0_K() {
            return t0_K;
        }

        public static double getHeight_ft() {
            return height_ft;
        }

        public static double getT_C() {
            return t_C;
        }

        public static double getTemperature_air_reference() {
            return temperature_air_reference;
        }

        public static double getAzot_ref() {
            return azot_ref;
        }

        public static double getKarbondioksit_ref() {
            return karbondioksit_ref;
        }

        public static double getHidrojen_ref() {
            return hidrojen_ref;
        }

        public static double getAmonyak_ref() {
            return amonyak_ref;
        }

        public static double getKukurtdioksit_ref() {
            return kukurtdioksit_ref;
        }

        public static double getOksijen_ref() {
            return oksijen_ref;
        }

        public static double getKarbonmonoksit_ref() {
            return karbonmonoksit_ref;
        }
        

}

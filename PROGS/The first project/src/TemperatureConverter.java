
public class TemperatureConverter {

	public double convertTemp(int temperature, char convertTo) {
	
		double tempTemperature;
		
		if (convertTo == 'F') {
			tempTemperature = (temperature *9/5) + 32;
			return tempTemperature;
	} else {
		tempTemperature = (temperature - 32) / 1.8;
			return tempTemperature;
	}
	}
}

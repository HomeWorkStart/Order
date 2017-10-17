import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fish extends Pet {
	int currentDepth = 0;

	Fish(int currentDepth) {
		int deep = currentDepth;
	};

	Fish() {
		currentDepth = 3;
	}

	public int dive(int howDeep) {
		currentDepth = currentDepth + howDeep;
		if (currentDepth > 100) {
			System.out.println("Я маленькая рыбка " + " и не могу плавать глубже 100 метров");

			currentDepth = currentDepth - howDeep;
		}

		else {
			System.out.println("Погружаюсь ещё на " + howDeep + " метров");
			System.out.println("Я на глубине " + currentDepth + " метров");
		}
		return currentDepth;
	}

	public String say(String something) {
		return "Разве вы не знаете, что рыбы не говорят?";
	}

}

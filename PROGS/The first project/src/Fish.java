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
			System.out.println("� ��������� ����� " + " � �� ���� ������� ������ 100 ������");

			currentDepth = currentDepth - howDeep;
		}

		else {
			System.out.println("���������� ��� �� " + howDeep + " ������");
			System.out.println("� �� ������� " + currentDepth + " ������");
		}
		return currentDepth;
	}

	public String say(String something) {
		return "����� �� �� ������, ��� ���� �� �������?";
	}

}

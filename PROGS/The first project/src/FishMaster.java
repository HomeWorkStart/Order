import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FishMaster {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Fish myFish = new Fish();
		System.out.println("Deep is " + myFish.currentDepth);
		String feetstring = " ";
		int feet;
		// ������� ���������� ������ �������� ������ InputStreamReader,
		// ������� ��������� � System.in � �������� ��� ���������������
		// ����������� ������ BufferedReader
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		// ����������� ��������� ��� ���� ������������ �� ������
		// ������� "Q"

		while (true) {
			System.out.println("Which deep?");
			feetstring = stdin.readLine();
			if (feetstring.equals("Q")) {
				// ����� �� ���������
				System.out.println("����!");
				System.exit(0);
			} else {
				// ����������� feetString � ����� ����� � �����������
				// �� �������, ������� ������������ ���������� feet
				feet = Integer.parseInt(feetstring);
				myFish.dive(feet);

			}
		}
	}
}

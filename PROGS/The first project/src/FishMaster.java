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
		// Создаем обработчик чтения входного потока InputStreamReader,
		// который подключен к System.in и передаем его буферизованному
		// обработчику чтения BufferedReader
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		// Погружаемся несколько раз пока пользователь не нажмет
		// клавишу "Q"

		while (true) {
			System.out.println("Which deep?");
			feetstring = stdin.readLine();
			if (feetstring.equals("Q")) {
				// Выход из программы
				System.out.println("Пока!");
				System.exit(0);
			} else {
				// Преобразуем feetString в целое число и погружаемся
				// на глубину, которая определяется переменной feet
				feet = Integer.parseInt(feetstring);
				myFish.dive(feet);

			}
		}
	}
}

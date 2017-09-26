import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteReader {

	public static void main(String[] args) {
		FileInputStream myFile = null;
		try {
			// Открытие байтового потока, указывающего на файл
			myFile = new FileInputStream("c:\\temp\\abc.gif");

			while (true) {
				int intValueOfByte = myFile.read();
				System.out.print(" " + intValueOfByte);
				if (intValueOfByte == -1) {
					// достигнут конец файла нужно выйти из цикла
					break;
				}
			} // конец цикла while
				// myFile.close(); не помещайте этот вызов здесь
		} catch (IOException e) {
			System.out.println("Impossible to read a file" + e.toString());
		} finally {
			try {
				myFile.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			System.out.println(" File reading is completed ");
		}

		int somedata[] = { 56, 230, 123, 43, 11, 37 };
		FileOutputStream myFile2 = null;
		try {
			// Открывается файл xyz.dat, в который
			// записываются данные из массива
			myFile2 = new FileOutputStream("xyz.dat");
			for (int i = 0; i < somedata.length; i++) {
				myFile2.close();
				System.out.println(" adding data to the xyz.dat file ");
			}
		} catch (IOException e) {
			System.out.println("Impossible to add data to the xyz.dat file " + e.toString());
		} finally {
			try {
				myFile2.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}

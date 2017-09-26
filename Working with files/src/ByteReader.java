import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteReader {

	public static void main(String[] args) {
		FileInputStream myFile = null;
		try {
			// �������� ��������� ������, ������������ �� ����
			myFile = new FileInputStream("c:\\temp\\abc.gif");

			while (true) {
				int intValueOfByte = myFile.read();
				System.out.print(" " + intValueOfByte);
				if (intValueOfByte == -1) {
					// ��������� ����� ����� ����� ����� �� �����
					break;
				}
			} // ����� ����� while
				// myFile.close(); �� ��������� ���� ����� �����
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
			// ����������� ���� xyz.dat, � �������
			// ������������ ������ �� �������
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

import java.io.*;

public class BufferReader {

	public static void main(String[] args) {
		FileInputStream myFile = null;
		BufferedInputStream buff = new BufferedInputStream(myFile, 5000);
		try {
			myFile = new FileInputStream("abc.dat");
			// соединяем потоки FileInputStream и BufferedInputStream
			buff = new BufferedInputStream(myFile);
			while (true) {
				int byteValue = buff.read();
				System.out.print(byteValue + " ");
				if (byteValue == -1)
					break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				buff.close();
				myFile.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}

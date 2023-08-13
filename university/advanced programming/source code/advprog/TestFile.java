package advprog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {

		/////////////////////////////////////////////////////////
		// 						Write Files					   //
		/////////////////////////////////////////////////////////
		FileWriter fw = null;
		try {
			fw = new FileWriter("d:\\AdvProg.txt");

			for (int i = 1; i <= 5; i++) {
				fw.write("HTU " + i + "\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			close(fw);
		}

		/////////////////////////////////////////////////////////
		// 						Read Files					   //
		/////////////////////////////////////////////////////////
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("d:\\AdvProg.txt");
			br = new BufferedReader(fr);

			String s = br.readLine();
			while (s != null) {
				System.out.println(s);
				s = br.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			close(br);
			close(fr);
		}
	}

	private static void close(FileWriter fw) {
		try {
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void close(FileReader fr) {
		try {
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void close(BufferedReader br) {
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

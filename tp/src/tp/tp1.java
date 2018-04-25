package tp;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class tp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\7 Tecnica\\Documents\\textotp.txt");
		Scanner sc;
		
		try {
			// Creo el Scanner para leer el archivo identificado en file
			sc = new Scanner(file);
			//palabras.add(file);

			// hasNextLine() devuelve un valor booleano, indicando si existe o
			// no una siguiente línea a leer
			while (sc.hasNextLine())
				System.out.println(sc.nextLine());
	
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

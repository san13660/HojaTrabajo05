/**
 * TextoLeerEscribir.java
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos Seccion 10
 * Hoja de Trabajo 3
 * Christopher Sandoval 13660
 * Fernanda Estrada 14198
 * Ana Lucia Diaz 151378
 * Alejandro Vasquez
 * @author FER ESTRADA
 * @since 2/12/2017
 */



import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class TextoLeerEscribir {

	// Metodo para crear y escribir un nuevo archivo de texto
	public void escribirTexto (int num) {
		File file;
		file = new File("prueba.txt");
		try {
			FileWriter w = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            
            // Se generan numeros aleatorios y se guardan en el archivo de texto
            Random r = new Random();
            for(int i=0; i<num; i++) {
            	wr.write(r.nextInt(num) + "\n");
            }
        
            wr.close();
            bw.close();   
        } catch(Exception e) {}
	}
	
	// Metodo para leer un archivo de texto
	public List<String> leerLineas() throws IOException{
		List<String> lines = Files.readAllLines(Paths.get("prueba.txt"), Charset.defaultCharset());
		return lines;
	}
}

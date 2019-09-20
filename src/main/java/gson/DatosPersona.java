package gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import gson.Persona;

public class DatosPersona {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Persona p = new Persona();
		
		System.out.println("Introduce un nombre.");
		p.nombre = scanner.nextLine();
		System.out.println("Introduce un apellido.");
		p.apellidos = scanner.nextLine();
		System.out.println("Introduce una edad.");
		p.edad = scanner.nextInt();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);

	}

}

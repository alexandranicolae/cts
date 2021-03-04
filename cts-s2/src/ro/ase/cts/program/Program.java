package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readers.AngajatiReader;

public class Program {
	
//Principiul Dependency .... "ala de nivel inalt nu trebuie sa depinda de fct de nivel jos"
//	implementarile pe care le realizati sa nu depinda direct de clase concrete, ci de tipul abstract
//	nu mai avem List<Angajat> ci List<Aplicant> si e bun si pt student si pt elev si inlocuim dupa doar o linie (AngajatReader)
	
	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			listaAngajati = AngajatiReader.readAngajati("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

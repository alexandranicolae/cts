package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class AplicantiReader {
// Puteam face interfata pt ca nu aveam atribute - initial, dar acum avem
	protected String fileName;
	
	public AplicantiReader(String fileName) {
		super();
		this.fileName = fileName;
	}

	public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;

	public void readAplicant(Scanner scanner, Aplicant aplicant) {
		String nume = scanner.next();
		String prenume = scanner.next();
		int varsta = scanner.nextInt();
		int punctaj = scanner.nextInt();
		int nr_proiecte = scanner.nextInt();
		String[] denumiriProiecte = new String[nr_proiecte];
		for (int i = 0; i < nr_proiecte; i++)
			denumiriProiecte[i] = scanner.next();
		
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setDenumiriProiecte(nr_proiecte, denumiriProiecte);
		
	}
}

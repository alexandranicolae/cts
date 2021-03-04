package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class AplicantiReader {
// Puteam face interfata pt ca nu aveam atribute - initial
	protected String fileName;
	
	
	public AplicantiReader(String fileName) {
		super();
		this.fileName = fileName;
	}


	public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;
}

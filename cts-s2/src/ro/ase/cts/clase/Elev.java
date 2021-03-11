package ro.ase.cts.clase;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static int sumaFinantata=30;
	
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int i) {
		this.clasa = i;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Elev: ");
		builder.append(super.toString());
		builder.append(" ,clasa=");
		builder.append(clasa);
		builder.append(" ,tutore=");
		builder.append(tutore);
		return builder.toString();}
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	
	public static void setSumaFinantata(int sumaFinantata) {
		Elev.sumaFinantata = sumaFinantata;
	}
	
	public static int getSumaFinantata() {
		return sumaFinantata;
	}
	
	@Override
	public int getFinantare() {
		//int s=30;
		//System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+s+" Euro/zi in proiect.");
		return sumaFinantata;
	}
	
	
}

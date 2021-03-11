package ro.ase.cts.clase;

public class Student extends Aplicant {
	protected String facultate;
	protected int an_studii;
	//toti studentii vor avea aceeasi suma finantata
	private static int sumaFinantata=20;
	
	
	public String getFacultate() {
		return facultate;
	}
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public int getAn_studii() {
		return an_studii;
	}
	public void setAn_studii(int an_studii) {
		this.an_studii = an_studii;
	}


	public Student() {
		super();
		
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.facultate = facultate;
		this.an_studii = an_studii;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student: ");
		builder.append(super.toString());
		builder.append(" ,facultate=");
		builder.append(facultate);
		builder.append(" ,an studiu=");
		builder.append(an_studii);
		return builder.toString();}
	
	public static int getSumaFinantata() {
		return sumaFinantata;
	}
	public static void setSumaFinantata(int sumaFinantata) {
		Student.sumaFinantata = sumaFinantata;
	}
	@Override
	public int getFinantare() {
		//int s=20;
		//face prea multe lucruri deodata (si afisare si returnare)
		//System.out.println("Studentul "+getNume()+" "+getPrenume()+" primeste"+s+" Euro/zi in proiect.");
		return sumaFinantata;
	}
	
}

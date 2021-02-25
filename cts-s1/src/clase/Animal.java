package clase;

public abstract class Animal {

	private String name;

	/* 
	 * clasa abstracta in C are o metoda/more virtual pure, in Java doar punem abstract
	 * o clasa abstracta nu poate fi instantiata -> o mostenim (derivam) sau facem pointer la acea clasa (doar in C)
	 * */
	
	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

package program;

import clase.Giraffe;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo z=new Zoo();
		Giraffe g1=new Giraffe("Girafica1");
		Giraffe g2=new Giraffe("Girafica2");
		
		Zebra z1=new Zebra("Zebrica1");
		Zebra z2=new Zebra("Zebrica2");

		z.addAnimal(g1);
		z.addAnimal(g2);
		z.addAnimal(z1);
		z.addAnimal(z2);
		
		z.feedAll();
		System.out.println(z.getIngrijitor().getName()+" este fericit!");
	}

}

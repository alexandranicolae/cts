package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private Zookeeper ingrijitor;
	private List<Animal> animale; //import list din util!!! nu altul
	
	public Zoo(Zookeeper ingrijitor, List<Animal> animale) {
		super();
		this.ingrijitor = ingrijitor;
		this.animale = animale;
	}
	
	public Zoo() {
		super();
		this.ingrijitor = new Zookeeper("Gigel");
		this.animale = new ArrayList<Animal>();
	}

	public Zookeeper getIngrijitor() {
		return ingrijitor;
	}

	public void setIngrijitor(Zookeeper ingrijitor) {
		this.ingrijitor = ingrijitor;
	}

	public List<Animal> getAnimale() {
		return animale;
	}

	public void setAnimale(List<Animal> animale) {
		this.animale = animale;
	}
	
	
	public void addAnimal(Animal a) {
		animale.add(a);
	}
	public void feedAll() {
		for(Animal a : animale)
			ingrijitor.feed(a);
	}
	
}

package ase.cts.clase;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	
	public void setClasa(int clasa) {
		this.clasa = clasa;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	@Override
	public String toString() {
		return "Elev: " + super.toString() + "Clasa=" + clasa + ", Tutore=" + tutore;
	}
	
	public Elev() {
		super();
	}
	
}

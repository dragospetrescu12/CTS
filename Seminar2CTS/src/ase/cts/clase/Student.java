package ase.cts.clase;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {

	return "Student: " + super.toString() + "Facultate=" + facultate + ", An_studii=" + anStudii;
	}
	
}

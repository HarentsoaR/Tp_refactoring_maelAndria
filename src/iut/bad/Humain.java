package iut.bad;

public class Humain implements Consommation {

	protected String nom;
	protected String prenom;
	protected Integer age;
	
	public Humain(String nom, String prenom, Integer age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public void details() {
		System.out.println(nom + " " + prenom + " " + age + " ans");
	}
	
	@Override
	public String toString() {
		return "Humain [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}

	@Override
	public void manger() {
		System.out.println("Je mange.");
		
	}

	@Override
	public void boire() {
		System.out.println("Je bois.");
		
	}
	
	public void ami(Humain autreHumain, int jours) {
	    System.out.println("Amie depuis " + jours + " jours avec " + autreHumain.toString());
	}
}

package iut.bad;

public class Femme extends Humain{
	public Femme(String nom, String prenom, Integer age) {
		super(nom,prenom,age);
	}
	
	public static void main(String[] args) {
		Homme homme = new Homme("Dupont", "Jean", 30);
		Femme femme = new Femme("Durand", "Marie", 28);
		System.out.println(femme.nom + " " + femme.prenom);femme.ami(homme, 100);
	}
}
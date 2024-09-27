package personnages;

public class Gaulois {

	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain ) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup((force/3) * effetPotion);
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public void boirePotion(int potion){
		effetPotion = potion;
		parler("Merci Druide, je sens que ma force est " + potion + " fois décuplée");
	}

	public static void main(String[] args) {
		Gaulois asterix;
		asterix = new Gaulois("Astérix",8);
		Romain neuil;
		neuil = new Romain("Neuil",1);
		asterix.boirePotion(4);
		asterix.parler("Malheureuuuuuuuux");
		asterix.frapper(neuil);
		System.out.println(asterix);
		
		
	}
}

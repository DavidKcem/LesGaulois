package personnages;
import java.util.*;
import personnages.Gaulois;


public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public int preparerPotion() {
		
		Random random;
		random = new Random();
		int a;
		a = random.nextInt(effetPotionMax - effetPotionMin + 1);
		a = a + effetPotionMin;
		if (a>7) {
			parler("J'ai préparé une super potion de force ");
		}
		else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + a);
		}
		return a;
	}
	
	public void booster(Gaulois gaulois) {
		int potion = preparerPotion();
		if(gaulois.getNom().equalsIgnoreCase("Obélix")) {
			parler("Non, Obélix !... Tu n'auras pas de potion magique !");
		}
		else {
			gaulois.boirePotion(potion);
		}
	}
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.preparerPotion();
	}
}

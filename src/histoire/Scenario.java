package histoire;
import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;


public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix = new Gaulois("Astérix",8);
		Romain minus = new Romain("Minus",6);
		Gaulois obelix = new Gaulois("Obélix",25);
		Druide panoramix = new Druide("Panoramix",5,10);
	
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		asterix.boirePotion(6);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
	}

}

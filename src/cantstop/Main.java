package cantstop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

enum couleurs {
	Rouge,
	Bleu,
	Orange
}

class Player {
	int id;
	int nbBronze;
	int couleurId;
	
	Player(int id, int couleurId) {
		this.id = id;
		this.couleurId = couleurId;
	}
}

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		List<Player> players = new ArrayList<Player>();
		
		System.out.println("Liste des couleurs disponibles");
		for (int i = 0; i < couleurs.values().length; i++) {
			System.out.println(i + " : " + couleurs.values()[i]);
		}

		System.out.println("Joueur 1, choississez une couleur :");
		
		int couleurId = scanner.nextInt();
		players.add(new Player(1, couleurId));
		System.out.println(couleurs.values()[couleurId]);
		
		System.out.println("Joueur 2, choississez une couleur :");

		couleurId = scanner.nextInt();
		players.add(new Player(2, couleurId));
		System.out.println(couleurs.values()[couleurId]);;
		
		int playerOneTotal = random.nextInt(11) + 2;
		System.out.println("Joueur 1 tire ses dés : " + playerOneTotal);
		int playerTwoTotal = random.nextInt(11) + 2;
		System.out.println("Joueur 2 tire ses dés : " + playerTwoTotal);
		
		int idPlayerStart = 1;

		if (playerOneTotal - playerTwoTotal > 0) {
			System.out.println("Joueur 1 commence !");
		} else {
			System.out.println("Joueur 2 commence !");
			idPlayerStart = 2;
		}
		
	}

}

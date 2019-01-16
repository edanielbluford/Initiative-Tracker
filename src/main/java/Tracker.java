import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Tracker {

	private ArrayList<Character> characters = new ArrayList<Character>();

	public ArrayList<Character> getCharacters() {
		return characters;
	}

	public void setCharacters(ArrayList<Character> characters) {
		this.characters = characters;
	}

	public Tracker() {

	}

	public ArrayList<Character> newFight(int numFight) {

		for (int i = 0; i < numFight; i++) {
			boolean npcCheck = false;

			Scanner rd = new Scanner(System.in);
			System.out.println("Name?");
			String name = rd.nextLine();
			System.out.println("HP");
			int hP = rd.nextInt();
			System.out.println("Initative Modifier");
			int init = rd.nextInt();
			System.out.println("Is this an NPC? Yes or No.");
			String isNPC = rd.nextLine();

			if (isNPC.toLowerCase().equals("yes")) {
				npcCheck = true;
			}

			Character fighter = new Character(name, hP, "none", init, npcCheck);
			characters.add(fighter);
			rd.close();

		}
		return characters;

	}

	public ArrayList<Character> combatList() {

		characters.sort(Comparator.comparing(Character::getInitMod));
		return characters;

	}

}

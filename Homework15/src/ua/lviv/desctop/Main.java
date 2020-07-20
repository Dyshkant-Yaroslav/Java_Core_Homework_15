package ua.lviv.desctop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Zooclub z = new Zooclub();

		while (true) {
			menu();
			switch (sc.next()) {

			case "1": {
				z.createNewPersonToClub();
			}
				break;
			case "2": {
				z.createAnimalToPerson();
				;
			}
				break;
			case "3": {
				z.removeAnimalFromPerson();
			}
				break;
			case "4": {
				z.removePersonFromClub();
			}
				break;
			case "5": {
				z.removeConcretAnimalFromAllPersons();
			}
				break;
			case "6": {
				z.showZooclub();
			}
				break;
			case "7": {
				z.exit();
				;
			}
				break;
			}
		}

	}

	public static void menu() {
		System.out.println("Press 1 for: add new club person ");
		System.out.println("Press 2 for: add new animal for club person");
		System.out.println("Press 3 for: remove animal from club person");
		System.out.println("Press 4 for: remove person from club");
		System.out.println("Press 5 for: remove concret animal from all person");
		System.out.println("Press 6 for: show zooclub");
		System.out.println("Press 7 for: exit the program");
	}
}

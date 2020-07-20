package ua.lviv.desctop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Zooclub {

	Scanner sc = new Scanner(System.in);
	Map<Person, List<Animal>> map = new HashMap<>();

	public void createNewPersonToClub() {
		System.out.println("Enter person name:");
		String name = sc.next().toLowerCase();
		System.out.println("Enter person age:");
		int age = sc.nextInt();
		map.put(new Person(name, age), new ArrayList<>());
		System.out.println("You addet new person to Club: " + map);
	}

	public void createAnimalToPerson() {
		System.out.println("Enter animal name:");
		String name = sc.next().toLowerCase();
		System.out.println("Enter animal type(dog/cat):");
		String type = sc.next().toLowerCase();
		Animal an = new Animal(name, type);
		System.out.println("Enter person name which you want add pet:");
		String pname = sc.next().toLowerCase();
		System.out.println("Enter person age which you want add pet:");
		int page = sc.nextInt();
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().equals(new Person(pname, page))) {
				List<Animal> value = next.getValue();
				value.add(an);
				next.setValue(value);
				System.out.println("At now your club consist of: " + map);
			}
		}

	}

	public void removeAnimalFromPerson() {
		System.out.println("Enter animal name:");
		String name = sc.next().toLowerCase();
		System.out.println("Enter animal type(dog/cat):");
		String type = sc.next().toLowerCase();
		System.out.println("Enter person name which you want remove pet:");
		String pname = sc.next().toLowerCase();
		System.out.println("Enter person age which you want remove pet:");
		int page = sc.nextInt();
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().equals(new Person(pname, page))) {
				List<Animal> person = next.getValue();
				Iterator<Animal> iterator1 = person.iterator();
				while (iterator1.hasNext()) {
					Animal next1 = iterator1.next();
					if (next1.getName().equalsIgnoreCase(name)) {
						iterator1.remove();
					}
				}
			}
		}
		System.out.println("At now your club consist of: " + map);
	}

	public void removePersonFromClub() {
		System.out.println("Enter person name:");
		String name = sc.next().toLowerCase();
		System.out.println("Enter person age:");
		int age = sc.nextInt();
		map.remove(new Person(name, age));
		System.out.println("At now your club consist of: " + map);

	}

	public void removeConcretAnimalFromAllPersons() {
		System.out.println("Enter animal type(dog/cat):");
		String type = sc.next().toLowerCase();
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			List<Animal> person = next.getValue();
			Iterator<Animal> iterator1 = person.iterator();
			while (iterator1.hasNext()) {
				Animal next1 = iterator1.next();
				if (next1.getType().equalsIgnoreCase(type)) {
					iterator1.remove();
				}
			}
		}

		System.out.println("At now your club consist of: " + map);
	}

	public void showZooclub() {
		Set<Entry<Person, List<Animal>>> entrySet = map.entrySet();
		for (Entry<Person, List<Animal>> entry : entrySet) {
			System.out.println(entry.getKey() + "--->" + entry.getValue());
		}
	}

	public void exit() {
		System.out.println("You exit from program, see you.....");
		System.exit(0);
	}

}

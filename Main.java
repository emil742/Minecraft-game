import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;



public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
        ArrayList<String> characters = new ArrayList<>();
		characters.add("Steve");
		characters.add("Villager");
		characters.add("Zombie");
		characters.add("Creeper");
		characters.add("Skeleton");
		characters.add("Enderman");
		characters.add("Spider");
		characters.add("Zombie Pigman");
		characters.add("Wither Skeleton");
		
		System.out.println("Enter your Minecraft Character");
		System.out.println(characters);
		
		 String choice = scanner.nextLine();         
         System.out.println("You selected: " + choice);
		
		int hp = 100;
		int attack = 12;
		int specialMove = 30;
		
		System.out.println ("Base Stats");
		System.out.println ("HP " + hp);
		System.out.println ("Attack " + attack);
		System.out.println ("Special Move " + specialMove);
	}
}

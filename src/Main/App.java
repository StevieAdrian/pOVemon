package Main;

import java.util.Scanner;
import java.util.Vector;

public class App {
	private Scanner scan = new Scanner(System.in);
	private Player player;
	
	private void shop() {
		System.out.println("--------------------------------");
		System.out.println("        Povemon Shop");
		System.out.println("--------------------------------");
		System.out.println("Available Storage    | Price");
		System.out.println("--------------------------------");
		System.out.println("CharbolT [Fire]      | 200");
		System.out.println("--------------------------------");
		System.out.println("AquaslaSh [Water]    | 200");
		System.out.println("--------------------------------");
		System.out.println("Treething [Grass]    | 200");
		System.out.println("--------------------------------");
		System.out.println("RUmbleu [Fire]       | 750");
		System.out.println("--------------------------------");
		System.out.println("ACranix [Water]      | 500");
		System.out.println("--------------------------------");
		System.out.println("VerMarok [Grass]     | 1000");
		System.out.println("--------------------------------");
		System.out.println("MirMage [Fire]       | 350");
		System.out.println("--------------------------------");
		System.out.println("FOscorra [Grass]     | 400");
		System.out.println("--------------------------------");
		System.out.println("Name: " + player.getName() + " Money: " + player.getMoney());
	}
	
	private void menu() {
		int choice = 0;
		
		do {
            System.out.println(",-.----.       ,----..                                   ____      ,----..            ,--. ");
            System.out.println("\\    /  \\     /   /   \\                  ,---,.        ,'  , `.   /   /   \\         ,--.'| ");
            System.out.println("|   :    \\   /   .     :        ,---.  ,'  .' |     ,-+-,.' _ |  /   .     :    ,--,:  : | ");
            System.out.println("|   |  .\\ : .   /   ;.  \\      /__./|,---.'   |  ,-+-. ;   , || .   /   ;.  \\,`--.'`|  ' : ");
            System.out.println(".   :  |: |.   ;   /  ` ; ,---.;  ; ||   |   .' ,--.'|'   |  ;|.   ;   /  ` ;|   :  :  | | ");
            System.out.println("|   |   \\ :;   |  ; \\ ; |/___/ \\  | |:   :  |-,|   |  ,', |  ':;   |  ; \\ ; |:   |   \\ | : ");
            System.out.println("|   : .   /|   :  | ; | '\\   ;  \\ ' |:   |  ;/||   | /  | |  |||   :  | ; | '|   : '  '; | ");
            System.out.println(";   | |`-' .   |  ' ' ' : \\   \\  \\: ||   :   .''   | :  | :  |,.   |  ' ' ' :'   ' ;.    ; ");
            System.out.println("|   | ;    '   ;  \\; /  |  ;   \\  ' .|   |  |-,;   . |  ; |--' '   ;  \\; /  ||   | | \\   | ");
            System.out.println(":   ' |     \\   \\  ',  /    \\   \\   ''   :  ;/||   : |  | ,     \\   \\  ',  / '   : |  ; .' ");
            System.out.println(":   : :      ;   :    /      \\   `  ;|   |    \\|   : '  |/       ;   :    /  |   | '`--'   ");
            System.out.println("|   | :       \\   \\ .'        :   \\ ||   :   .';   | |`-'         \\   \\ .'   '   : |   ");
            System.out.println("`---'.|        `---`           '---\" |   | ,'  |   ;/              `---`     ;   |.'  ");
            System.out.println("`---`                              `----'    '---'                         '---' ");
            System.out.println("----------------------------------------------------------------------------------------------");
            System.out.println("Welcome, OV! Let's start your adventure...\n");
            System.out.println("1. Enter Battle");
            System.out.println("2. Enter Shop");
            System.out.println("3. Modify Povemon");
            System.out.println("4. Exit");
            System.out.printf(">> ");
            choice = scan.nextInt();
            
            if (choice == 1) {
            	
            } else if (choice == 2) {
            	shop();
            } else if (choice == 3) {
            	
            } else if (choice == 4) {
            	return;
            }
		} while (choice < 1 || choice > 4);
	}
	
	private void choosePovemon() {
		System.out.println("-----------------------------");
		System.out.println("  Choose Your Starter!");
		System.out.println("-----------------------------");
		System.out.println("1. CharbolT - The Fire Povemon");
		System.out.println("   -> A Brave and fiery Povemon, always ready for a challenge.");
		System.out.println("2. AqualaSh - The Water Povemon");
		System.out.println("   -> A cool-headed Povemon that flows like water in battle.");
		System.out.println("3. TreethIng - The Grass Povemon");
		System.out.println("   -> A calm and nurturing Povemon, in tune with nature.");
		System.out.println();
		System.out.printf("Which Povemon will you choose?[1,2,3]: ");
		String pokemon = scan.nextLine();
		System.out.println(""); 
		System.out.println("You chose " + pokemon + " as your starter!");
		System.out.println("Take good care of it, and embark on your adventure!");
		System.out.println();
		System.out.println("Press ENTER to continue...");
	}

	public App() {
		
		System.out.println("-----------------------------");
		System.out.println("| Welcome to Povemon World! |");
		System.out.println("-----------------------------");
		System.out.println();
		String name;
		String verif;
		do {
			System.out.printf("Please enter your name: ");
			name = scan.nextLine();
			
			System.out.println("Is your name " + name + "?");
			System.out.printf("[Y/N]: ");
			verif = scan.nextLine();
			
			if (verif.equalsIgnoreCase("Y")) {
				player = new Player(name, 100);
			}
		} while(!verif.equalsIgnoreCase("Y"));

		choosePovemon();
		menu();
	}

}

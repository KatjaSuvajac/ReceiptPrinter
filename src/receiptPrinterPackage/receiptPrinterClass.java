package receiptPrinterPackage;

import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.Console;
import java.util.Scanner;

import receiptPrinterPackage.animals.Acorn;
import receiptPrinterPackage.animals.Apple;
import receiptPrinterPackage.animals.Butterfly;
import receiptPrinterPackage.animals.Camel;
import receiptPrinterPackage.animals.Cat;
import receiptPrinterPackage.animals.Chesnut;
import receiptPrinterPackage.animals.Chicken;
import receiptPrinterPackage.animals.Crab;
import receiptPrinterPackage.animals.Flower;
import receiptPrinterPackage.animals.Frog;
import receiptPrinterPackage.animals.Hedgehog;
import receiptPrinterPackage.animals.Horse;
import receiptPrinterPackage.animals.Leaf;
import receiptPrinterPackage.animals.Mushroom;
import receiptPrinterPackage.animals.Pumpkin;
import receiptPrinterPackage.animals.Seahorse;
import receiptPrinterPackage.animals.Squirel;
import receiptPrinterPackage.animals.Star;

public class receiptPrinterClass {
	
	public static String animalToPrint;

	public static void main(String[] args) {
		PrinterJob job = PrinterJob.getPrinterJob();
		Console console = System.console();
		if (console != null) {
			job.setPrintable(new receiptPrinterPackage.animalPrinter());
			console.writer().println(wolfey);
			System.out.println();
			System.out.println("---------------------------------------------------");
			Scanner scanner = new Scanner(console.reader());
			String input = scanner.nextLine();
			while (!input.toString().equals("close")) {
				System.out.println();
				System.out.println("---------------------------------------------------");
				System.out.println();
				if (input.toString().toLowerCase().equals("marija") 
						|| input.toString().toLowerCase().equals("petra")) {
					System.out.println(Flower.toConsole);
					animalToPrint = Flower.toPrint;
					
				} else {
					printAppropriateAnimalAndSetVariable(input);
				}
				System.out.println();
				
				try {
					System.out.println("Printing......");
					job.print();
					System.out.println("Printing done.");
				} catch (PrinterException ex) {
					System.out.println("Printing fail.");
					System.out.println(ex);
				}				
				input = scanner.nextLine();
			}
		} else {
			System.out.println(wolfey2);
		}

	}

	private static void printAppropriateAnimalAndSetVariable(String input) {
		int integer;
		try {
			integer = Integer.parseInt(input.replace("SXT065", ""));
		} catch (Exception ex) {
			Double rand = Math.random()*10;
			integer = rand.intValue();
		}
		switch(integer%10) {
			case 1:
				System.out.println(Pumpkin.toConsole);
				animalToPrint = Pumpkin.toPrint;
				break;
			case 2:
				System.out.println(Cat.toConsole);
				animalToPrint = Cat.toPrint;
				break;
			case 3:
				System.out.println(Mushroom.toConsole);
				animalToPrint = Mushroom.toPrint;
				break;
			case 4:
				System.out.println(Hedgehog.toConsole);
				animalToPrint = Hedgehog.toPrint;
				break;
			case 5:
				System.out.println(Chesnut.toConsole);
				animalToPrint = Chesnut.toPrint;
				break;
			case 6:
				System.out.println(Leaf.toConsole);
				animalToPrint = Leaf.toPrint;
				break;
			case 7:
				System.out.println(Acorn.toConsole);
				animalToPrint = Acorn.toPrint;
				break;
			case 8:
				System.out.println(Squirel.toConsole);
				animalToPrint = Squirel.toPrint;
				break;
			case 9:
				System.out.println(Star.toConsole);
				animalToPrint = Star.toPrint;
				break;
			default:
				System.out.println(Apple.toConsole);
				animalToPrint = Apple.toPrint;
				break;
		}
		
	}

	private static String wolfey = "\r\n"
			+ "                              __\r\n"
			+ "                            .d$$b\r\n"
			+ "                          .' TO$;\\\r\n"
			+ "                         /  : TP._;\r\n"
			+ "                        / _.;  :Tb|\r\n"
			+ "                       /   /   ;j$j\r\n"
			+ "                   _.-\"       d$$$$\r\n"
			+ "                 .' ..       d$$$$;\r\n"
			+ "                /  /P'      d$$$$P. |\\\r\n"
			+ "               /   \"      .d$$$P' |\\^\"l\r\n"
			+ "             .'           `T$P^\"\"\"\"\"  :\r\n"
			+ "         ._.'      _.'                ;\r\n"
			+ "      `-.-\".-'-' ._.       _.-\"    .-\"\r\n"
			+ "    `.-\" _____  ._              .-\"\r\n"
			+ "   -(.g$$$$$$$b.              .'\r\n"
			+ "     \"\"^^T$$$P^)            .(:\r\n"
			+ "       _/  -\"  /.'         /:/;\r\n"
			+ "    ._.'-'`-'  \")/         /;/;\r\n"
			+ " `-.-\"..--\"\"   \" /         /  ;\r\n"
			+ ".-\" ..--\"\"        -'          :\r\n"
			+ "..--\"\"--.-\"         (\\      .-(\\\r\n"
			+ "  ..--\"\"              `-\\(\\/;`\r\n"
			+ "    _.                      :\r\n"
			+ "                            ;`-\r\n"
			+ "                           :\\\r\n"
			+ "                           ;\\r\n\"";
	
	private static String wolfey2 = "\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣷⣶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣶⣿⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⣿⣿⣿⣿⣷⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣶⣿⣿⣿⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⢿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠏⢹⣿⡿⠁⠈⠛⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⠟⠁⠀⢻⣿⣿⠉⢇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠇⠀⠀⠀⠈⢿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⠋⠀⠀⠀⠀⢻⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⢀⡾⠀⠀⠀⢿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⠃⠀⠀⠸⣄⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⠀⣼⡇⠀⠀⠀⠈⣿⣿⣷⡄⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣶⣿⢿⠏⠀⠀⠀⠀⣿⡄⢸⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣧⣿⡇⠀⠀⠀⠀⠙⠈⠻⣿⣾⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⡿⠋⠘⠀⠀⠀⠀⢀⣿⣷⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⠟⠉⣿⡄⠀⠀⠀⠀⠀⠀⠙⢿⡿⣿⣶⣤⣤⣀⣀⣀⣀⣤⣴⣿⡿⣿⠏⠀⠀⠀⠀⠀⠀⠀⣼⡏⠙⢿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠠⠟⢹⣿⣿⠃⠀⠀⠈⠿⣆⡀⠀⠀⠀⠀⠀⠀⠙⠀⠈⠉⠉⠉⠉⠉⠉⠉⠉⠀⠐⠁⠀⠀⠀⠀⠀⠀⢀⡾⠋⠀⠀⠈⢻⣿⡏⠙⠳⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠇⠀⠀⠀⠀⠀⠀⠙⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠁⠀⠀⠀⠀⠀⠈⢿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠖⠀⠀⠀⣀⣤⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡄⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢦⣄⡀⠀⠀⠀⢾⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣧⡖⠀⣠⣾⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣦⡀⠳⣼⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣤⣾⣿⠟⠀⠀⠀⠀⠀⠀⢀⣠⠀⠀⠀⠀⠀⠀⠀⢠⣿⣷⠀⠀⠀⠀⠀⠀⠀⢀⣀⠀⠀⠀⠀⠀⠀⠘⢿⣿⣦⣼⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⣠⣶⣿⣭⣤⣤⣴⣾⣆⣤⠀⠀⣾⣿⣿⡄⠀⢠⠀⣿⣷⣤⣬⣬⣽⣷⣤⡀⠀⠀⠀⠈⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⡏⠀⠀⠀⢀⣾⣿⠟⠁⠈⠉⠛⠋⠹⣿⠚⣷⣼⣿⣿⣿⣿⣤⡿⣸⡟⠉⠛⠋⠉⠈⠙⢿⣿⣆⠀⠀⠀⠘⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⣟⣿⡿⠿⣿⠿⢷⡶⣄⠀⢻⡆⣿⣿⣿⣿⣿⣿⣿⡇⣿⠁⢀⣴⣶⠿⣿⠿⠿⣿⣾⡆⠀⠀⠀⠸⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⢀⣼⣿⡿⠛⢱⣿⠃⠀⠀⠀⠀⢸⣿⣤⠀⠻⢷⣌⣉⣸⣧⣀⣧⣿⣿⣿⣿⣿⣿⣿⣧⣇⣠⣿⣈⣹⣶⠿⠃⣤⣽⣿⠻⠀⠀⠀⠀⢻⣧⠙⢿⣿⣿⣆⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⢠⣾⣿⠋⠀⣰⣿⡇⠀⢀⣤⣾⠃⠈⠉⣽⣷⣤⠀⠈⠉⠉⣻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣉⠉⠉⠁⠤⣶⣿⡉⠉⠀⢻⣦⣀⠀⠈⣿⣧⡀⠘⢿⣿⣆⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⢠⣿⡿⠁⢀⣼⣿⣿⣠⣶⣿⣿⡇⠀⠐⠾⠿⠿⢶⣶⣾⠿⣶⣶⣿⡿⢿⣿⣿⣿⣿⣿⣿⠟⣿⣶⣤⠾⢿⣶⣶⠾⠿⠿⠖⠀⠈⣿⣿⣷⣦⣸⣿⣷⡄⠀⠹⣿⣧⠀⠀⠀\r\n"
			+ "⠀⠀⢀⣾⡟⠁⢀⣾⣿⣿⠿⠋⢠⣿⣿⢀⡀⠀⠀⠀⠒⠋⠉⠁⠀⠘⣿⠟⠀⠀⢿⣿⣿⣿⣿⠃⠀⠙⣿⣿⠀⠀⠉⠙⠓⠂⠀⠀⠀⡀⢸⣿⣇⠉⠻⢿⣿⣿⣆⠀⠹⣿⡆⠀⠀\r\n"
			+ "⠀⠀⢸⡟⠁⢀⣾⡿⠋⠁⠀⠀⢸⣿⣿⡟⠁⠀⢀⣀⠀⠀⠀⠀⠀⢸⡿⠀⠀⠀⠈⢿⣿⣿⠁⠀⠀⠀⠙⣿⠀⠀⠀⠀⠀⠀⣀⠀⠀⠹⣾⣿⣿⠀⠀⠀⠉⠻⢿⡆⠀⠹⣷⡀⠀\r\n"
			+ "⠀⠀⡿⠁⠀⡸⠋⠀⠀⠀⠀⠀⢸⣿⣿⢃⣤⣶⣿⠁⠀⠀⠀⠀⠀⢸⠃⠀⠀⠀⠀⠀⢿⠃⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠹⣿⣦⡀⢹⣿⣿⠃⠀⠀⠀⠀⠈⢻⡄⠀⢹⡇⠀\r\n"
			+ "⠀⢸⡇⠀⢀⣡⣤⣶⣶⣶⡇⠀⢸⣿⣿⡿⢿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠇⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀⠀⠀⠀⠀⣿⣿⢿⣿⣿⡿⠀⠀⢷⣶⣶⣦⣄⡁⠀⠈⣇⠀\r\n"
			+ "⠀⣸⠁⣰⣾⠟⠹⣿⣿⣿⠁⠀⠈⣿⡿⠁⠘⣿⣇⠀⠀⠀⠀⡀⠀⠀⠀⠀⣤⣶⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀⠀⡀⠀⠀⠀⢀⣿⡟⠀⢹⣿⡇⠀⠀⢸⣿⣿⡟⠙⠿⣶⡀⢸⡀\r\n"
			+ "⢀⣿⣾⠏⠀⠀⠀⢻⣿⣿⡄⠀⠀⢸⡇⠀⠀⠘⣿⣄⠀⠀⣸⡃⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⣿⠀⠀⢀⣾⡟⠀⠀⠀⡿⠁⠀⠀⣸⣿⣿⠇⠀⠀⠈⠳⣾⡇\r\n"
			+ "⣸⠟⠁⠀⠀⠀⠀⠘⣿⣿⡇⠀⠀⠀⠁⠀⠀⠀⠈⢿⣦⡀⢹⣧⠀⠀⠀⠘⠛⠛⠛⣿⣿⣿⡟⠛⠛⠟⠀⠀⠀⢀⣿⠀⣠⣿⠏⠀⠀⠀⠀⠁⠀⠀⠀⣿⣿⡏⠀⠀⠀⠀⠀⠙⢷\r\n"
			+ "⠋⠀⠀⠀⠀⠀⠀⠀⠸⣿⣷⠀⠀⠀⣀⡀⠀⠀⠀⠀⠙⢿⣦⣿⣄⠀⠀⠀⠀⠸⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⢀⣾⣯⣾⠟⠁⠀⠀⠀⠀⢀⡀⠀⠀⢸⣿⡟⠁⠀⠀⠀⠀⠀⠀⠈\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣇⠀⢰⣿⠻⢦⣄⠀⠀⠀⠀⠙⣿⣿⣦⣀⠀⠀⠀⢈⣿⣿⣿⡋⠀⠀⠀⢀⣠⣾⣿⡟⠁⠀⠀⠀⢀⣴⡾⢻⡇⠀⢠⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣇⢸⣿⠀⠀⠙⢷⣄⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⠛⠛⠉⠙⠛⢻⣿⣿⣿⣿⣿⠋⠀⠀⠀⢀⡴⠛⠁⠀⢸⡇⢠⣿⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⠀⠀⠀⠀⠘⢷⡀⠀⠀⠘⣿⣿⣿⣿⣿⣷⣦⣤⣤⣶⣿⣿⣿⣿⣿⡏⠀⠀⢀⣴⠋⠀⠀⠀⠀⢸⣷⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⡇⠀⠀⠀⠀⠀⠻⣦⠀⠀⠹⡟⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠙⡿⠀⠀⢠⡾⠁⠀⠀⠀⠀⢀⣾⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠹⣧⡀⠀⠁⡄⢻⣿⣿⣿⣿⣿⣿⣿⣿⠁⣄⠁⠀⣰⡿⠀⠀⠀⠀⠀⠀⠈⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣷⡀⣼⣧⠀⢿⠟⣿⣿⣿⡿⣿⠃⢀⣿⠀⣰⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⠀⠈⣇⢻⣿⣿⠀⡟⠀⢸⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⠟⣿⡄⠀⠹⠘⣿⡿⠘⠀⠀⣿⡟⢿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⢿⣷⠀⠀⠀⣿⡇⠀⠀⢠⣿⠁⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡟⠀⠈⣿⡄⠀⠀⢿⠀⠀⠀⣾⡏⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠃⠀⠀⠹⣷⠀⠀⠀⠀⠀⣰⡿⠀⠀⠀⢿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣧⢀⡄⣄⢀⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⠀⣿⣾⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣆⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢈⣿⡟⠀\r\n"
			+ "\r\n"
			+ "";

}

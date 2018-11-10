import java.util.*;
public class CaesarVerschluesselung1 {

	public static void main(String[] args) {
		int auswahl = 0;
		String text = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Bitte geben Sie zuerst den Text ein, der ver- oder entschluesselt werden soll!");
		text = input.next();
		System.out.println("Möchten Sie:");
		System.out.println("(1) den eingegebenen Text verschluesseln oder");
		System.out.println("(2) den eingegebenen Text entschluesseln?");
		System.out.println("Bitte geben Sie die entsprechende Zahl ein!");
		
		auswahl = input.nextInt();
		switch (auswahl) {
		case 1:
			verschluesseln(text);
			break;
		case 2: 
			entschluesseln(text);
			break;
		}
		
	}

	public static void verschluesseln(String text) {
		System.out.println("Um wieviele Stellen soll das Alphabet verschoben werden? z.B. um 3 Stellen --> A wird zu D");
		int verschiebung = eingabeSchluessel();
		
	}

	public static void entschluesseln(String text) {
		System.out.println("Um wieviele Stellen wurde das Alphabet bei der Verschlüsselung verschoben?");
		int verschiebung = eingabeSchluessel();
	}
	
	public static int eingabeSchluessel() {
		int verschiebung;
		Scanner in = new Scanner(System.in);
		verschiebung = in.nextInt();
		in.close();
		return verschiebung;
	}
}

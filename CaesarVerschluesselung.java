import java.util.*;
public class CaesarVerschluesselung {

	public static void main(String[] args) {
		int auswahl = 0;
		String text = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Bitte geben Sie zuerst den Text ein, der ver- oder entschluesselt werden soll! (nur Buchstaben von A-Z, keine Umlaute)");
		text = input.next();
		text.toUpperCase();
		System.out.println("M�chten Sie:");
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
		String Textverschluesselt = "";
		System.out.println("Bitte geben Sie den Schl�ssel als Zahl ein (Um wieviele Stellen soll das Alphabet verschoben werden? z.B. um 3 Stellen --> A wird zu D)");
		int verschiebung = eingabeSchluessel();
		
		for (int i = 0; i < text.length(); i++) {
			int a = text.charAt(i);
			int b = a + verschiebung;
			if (b > 90) {			//das Unicode-Zeichen als Dezimalzahl f�r den letzten Gro�buchstaben im Alphabet (Z) ist 90; wenn die Zahl dar�ber liegt, muss man also wieder zum Anfang des Alphabets zur�ckspringen (Z um 1 nach rechts verschoben ist A)
				b = b - 26;
			}
			char zeichen = (char) b;
			Textverschluesselt = Textverschluesselt + zeichen;
		}
		
	}

	public static void entschluesseln(String text) {
		System.out.println("Bitte geben Sie den Schl�ssel ein (Um wieviele Stellen wurde das Alphabet bei der Verschl�sselung verschoben?)");
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

import java.util.*;
public class CaesarVerschluesselung1 {

	public static void main(String[] args) {
		int auswahl = 0;
		String text = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Bitte geben Sie zuerst den Text ein, der ver- oder entschluesselt werden soll! (nur Buchstaben von A-Z, keine Umlaute)");
		text = input.next();
		text = text.toUpperCase();
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
		String Textverschluesselt = "";
		System.out.println("Bitte geben Sie den Schlüssel als Zahl ein (Um wieviele Stellen soll das Alphabet verschoben werden? z.B. um 3 Stellen --> A wird zu D)");
		int verschiebung = eingabeSchluessel();
		
		
		for (int i = 0; i < text.length(); i++) {
			int a = text.charAt(i);
			int b = a + verschiebung;
			if (b > 90) {			//der Unicode als Dezimalzahl für den letzten Großbuchstaben im Alphabet (Z) ist 90; wenn die Zahl darüber liegt, muss man also wieder zum Anfang des Alphabets zurückspringen (Z um 1 nach rechts verschoben ist A) https://unicode-table.com/de/#control-character

				b = b - 26;
			}
			char zeichen = (char) b;
			Textverschluesselt = Textverschluesselt + zeichen;
		}
		System.out.println("Entschlüsselter Text: " + Textverschluesselt);
		
	}

	public static void entschluesseln(String text) {
		String Textentschluesselt = "";
		System.out.println("Bitte geben Sie den Schlüssel ein (Um wieviele Stellen wurde das Alphabet bei der Verschlüsselung verschoben?)");
		int verschiebung = eingabeSchluessel();
		
		for (int i = 0; i < text.length(); i++) {
			int a = text.charAt(i);
			int b = a - verschiebung;
			if (b < 65) {   //der Unicodewert als Zahl für den ersten Großbuchstaben im Alphabet (A) ist 65; wenn die Zahl durch die Verschiebung darunter liegt, muss man ans Ende des Alphabets zurückspringen (A um 1 nach links verschoben ist Z)  https://unicode-table.com/de/#control-character
			b = b + 26;   
			}
			char zeichen = (char) b;
			Textentschluesselt = Textentschluesselt + zeichen;
	}
		System.out.println("Entschlüsselter Text: " + Textentschluesselt);
	}
	
	public static int eingabeSchluessel() {
		int verschiebung;
		Scanner in = new Scanner(System.in);
		verschiebung = in.nextInt();
		in.close();
		return verschiebung;
	}
}

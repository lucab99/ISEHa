import java.util.*;
public class CaesarVerschluesselung1testbar {

	 public static void main(String[] args) {
		 verschluesseln();
		 entschluesseln();
	 }
		

		public static String verschluesseln() {
			String Textverschluesselt = "";
			String text = "Hallo Welt! ?.";
			text = text.toUpperCase();
			int verschiebung = 1;
			char zeichen = ' ';
			
			for (int i = 0; i < 
				text.length(); i++) {
				int a = text.charAt(i);
				if (a >= 65 && a <= 90) { //Wenn das Zeichen kein Buchstabe, sondern z.B. ein Ausrufezeichen oder Leerzeichen ist, soll es nicht verschl�sselt werden, sondern weiterhin im Klartext erscheinen
				int b = a + verschiebung;
				if (b > 90) {			//der Unicode als Dezimalzahl f�r den letzten Gro�buchstaben im Alphabet (Z) ist 90; wenn die Zahl dar�ber liegt, muss man also wieder zum Anfang des Alphabets zur�ckspringen (Z um 1 nach rechts verschoben ist A) https://unicode-table.com/de/#control-character
					b = b - 26;
				}
				zeichen = (char) b; } else {
					zeichen = text.charAt(i);
				}
				Textverschluesselt = Textverschluesselt + zeichen;
			}
			return Textverschluesselt;
			
		}

		public static String entschluesseln() {
			String Textentschluesselt = "";
			char zeichen = ' ';
			
			String text = "KEJ DKP 19 LCJTG CNV! WONCWV �";
			text = text.toUpperCase();
			int verschiebung = 2;
	
			for (int i = 0; i < text.length(); i++) { 
				int a = text.charAt(i);
				if (a >= 65 && a <= 90) { //da Sonderzeichen bei der Verschl�sselung nicht verschoben werden, d�rfen diese auch bei der Entschl�sselung nicht zur�ckverschoben werden
				int b = a - verschiebung;
				if (b < 65) {   //der Unicodewert als Zahl f�r den ersten Gro�buchstaben im Alphabet (A) ist 65; wenn die Zahl durch die Verschiebung darunter liegt, muss man ans Ende des Alphabets zur�ckspringen (A um 1 nach links verschoben ist Z)  https://unicode-table.com/de/#control-character
				b = b + 26;   
				}
				zeichen = (char) b; } else {
					zeichen = text.charAt(i);
				}
				Textentschluesselt = Textentschluesselt + zeichen;
		}
			return Textentschluesselt;
		}
		
		public static String entschluesseln2() {
			String Textentschluesselt = "";
			char zeichen = ' ';
			
			String text = "JDI CJO FJO WFSTDIM�TTFMUFS UFYU";
			String Schl�ssel = "B";			//Schl�ssel wird nicht als Zahl, sondern als Buchstabe angegeben (wenn Schl�ssel = B, wird das Alphabet um eine Stelle verschoben (A wird zu B)
			int verschiebung = Schl�ssel.charAt(0) - 65; //minus 65, da die Buchstaben im Unicode bei 65 beginnen, aber die Verschiebung innerhalb des Alphabets stattfinden soll
			
			for (int i = 0; i < text.length(); i++) { 
				int a = text.charAt(i);
				if (a >= 65 && a <= 90) { //da Sonderzeichen bei der Verschl�sselung nicht verschoben werden, d�rfen diese auch bei der Entschl�sselung nicht zur�ckverschoben werden
				int b = a - verschiebung;
				if (b < 65) {   //der Unicodewert als Zahl f�r den ersten Gro�buchstaben im Alphabet (A) ist 65; wenn die Zahl durch die Verschiebung darunter liegt, muss man ans Ende des Alphabets zur�ckspringen (A um 1 nach links verschoben ist Z)  https://unicode-table.com/de/#control-character
				b = b + 26;   
				}
				zeichen = (char) b; } else {
					zeichen = text.charAt(i);
				}
				Textentschluesselt = Textentschluesselt + zeichen;
		}
			return Textentschluesselt;
			
			
		}
}



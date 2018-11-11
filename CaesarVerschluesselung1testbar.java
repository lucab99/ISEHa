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
				if (a >= 65 && a <= 90) { //Wenn das Zeichen kein Buchstabe, sondern z.B. ein Ausrufezeichen oder Leerzeichen ist, soll es nicht verschlüsselt werden, sondern weiterhin im Klartext erscheinen
				int b = a + verschiebung;
				if (b > 90) {			//der Unicode als Dezimalzahl für den letzten Großbuchstaben im Alphabet (Z) ist 90; wenn die Zahl darüber liegt, muss man also wieder zum Anfang des Alphabets zurückspringen (Z um 1 nach rechts verschoben ist A) https://unicode-table.com/de/#control-character
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
			
			String text = "KEJ DKP 19 LCJTG CNV! WONCWV Ö";
			text = text.toUpperCase();
			int verschiebung = 2;
	
			for (int i = 0; i < text.length(); i++) { 
				int a = text.charAt(i);
				if (a >= 65 && a <= 90) { //da Sonderzeichen bei der Verschlüsselung nicht verschoben werden, dürfen diese auch bei der Entschlüsselung nicht zurückverschoben werden
				int b = a - verschiebung;
				if (b < 65) {   //der Unicodewert als Zahl für den ersten Großbuchstaben im Alphabet (A) ist 65; wenn die Zahl durch die Verschiebung darunter liegt, muss man ans Ende des Alphabets zurückspringen (A um 1 nach links verschoben ist Z)  https://unicode-table.com/de/#control-character
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
			
			String text = "JDI CJO FJO WFSTDIMÜTTFMUFS UFYU";
			String Schlüssel = "B";			//Schlüssel wird nicht als Zahl, sondern als Buchstabe angegeben (wenn Schlüssel = B, wird das Alphabet um eine Stelle verschoben (A wird zu B)
			int verschiebung = Schlüssel.charAt(0) - 65; //minus 65, da die Buchstaben im Unicode bei 65 beginnen, aber die Verschiebung innerhalb des Alphabets stattfinden soll
			
			for (int i = 0; i < text.length(); i++) { 
				int a = text.charAt(i);
				if (a >= 65 && a <= 90) { //da Sonderzeichen bei der Verschlüsselung nicht verschoben werden, dürfen diese auch bei der Entschlüsselung nicht zurückverschoben werden
				int b = a - verschiebung;
				if (b < 65) {   //der Unicodewert als Zahl für den ersten Großbuchstaben im Alphabet (A) ist 65; wenn die Zahl durch die Verschiebung darunter liegt, muss man ans Ende des Alphabets zurückspringen (A um 1 nach links verschoben ist Z)  https://unicode-table.com/de/#control-character
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



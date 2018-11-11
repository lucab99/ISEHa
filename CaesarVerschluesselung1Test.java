import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import org.junit.jupiter.api.Test;
import java.util.*;

class CaesarVerschluesselung1Test {

	public CaesarVerschluesselung1 caesar;
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void verschluesselnTest() {
	caesar = new CaesarVerschluesselung1();
	PrintWriter senden = new PrintWriter(new BufferedWriter(new OutputStreamWriter()),true);
	caesar.eingabeSchluessel(senden(1));
	String text = caesar.verschluesseln("Hallo");
	assertEquals("IBMMP", text);
	}

}

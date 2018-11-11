import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import org.junit.jupiter.api.Test;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.*;
import java.util.*
;class CaesarVerschluesselung1Test {

	public CaesarVerschluesselung1testbar caesar;
	
	
	@Test
	void verschluesselnTest() {
	caesar = new CaesarVerschluesselung1testbar();
	
	String text = caesar.verschluesseln();
	assertEquals("IBMMP XFMU! ?.", text);
	}

	@Test
	void entschluesselnTest() {
		caesar = new CaesarVerschluesselung1testbar();
		
		String text = caesar.entschluesseln();
		assertEquals("ICH BIN 19 JAHRE ALT! UMLAUT Ö", text);
	}
	
	@Test
	void entschluesseln2Test() {
		caesar = new CaesarVerschluesselung1testbar();
		
		String text = caesar.entschluesseln2();
		assertEquals("ICH BIN EIN VERSCHLÜSSELTER TEXT", text);
	}
	
}

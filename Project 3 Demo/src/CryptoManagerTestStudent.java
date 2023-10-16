import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIsStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("ACADIA"));
		assertTrue(CryptoManager.isStringInBounds("&AMPERSAND@ HELLOWRLD!"));
		assertFalse(CryptoManager.isStringInBounds("purAqua"));
		assertFalse(CryptoManager.isStringInBounds("{array represent}"));
		assertFalse(CryptoManager.isStringInBounds("THE NEW PORSCHE DAKAR is {quite} NICE"));
	}

	@Test
	void testEncryptCaesar() {
		assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("silencioBruono", 3));
		assertEquals("\"]']\"O-^ OR]", CryptoManager.caesarEncryption("TOYOTA_PRADO", 14));
		assertEquals("QMRXW", CryptoManager.caesarEncryption("MINTS", 4));
		assertEquals("293O82", CryptoManager.caesarEncryption("BIC_HB", 112));
		assertEquals("N-O-P-Q-R", CryptoManager.caesarEncryption("A B C D E", 13));
		assertEquals("[QW\"UJQWNF\"YCVEJ\"VJG\"DKI\"UJQTV", CryptoManager.caesarEncryption("YOU SHOULD WATCH THE BIG SHORT", 2));
	}
	
	@Test
	void testDecryptCaesar() {
		assertEquals("RED_VELVET", CryptoManager.caesarDecryption("\\ON) OV O^", 10));
		assertEquals("POLISHING STRING", CryptoManager.caesarDecryption("'&# *_ %^7*+) %^", 983));
		assertEquals(" ABC DEF ", CryptoManager.caesarDecryption("T567T89:T", 500));
		assertEquals("WORTH_ASKING", CryptoManager.caesarDecryption("\"Z]_S*L^VTYR", 11));
	}

	@Test
	void testEncryptBellaso() {
		assertEquals("^N!!W(S)!J+!", CryptoManager.bellasoEncryption("RIMAC NIVERA", "LET THE KEY BE LONGER FOR ONCE"));
		assertEquals("VJ[T%\\!UY&", CryptoManager.bellasoEncryption("SIMPLY GUM", "CANDY"));
		assertEquals("TGXJUJ2EOTUX)FXZ", CryptoManager.bellasoEncryption("AFRICA_DISCOVERY", "SAFARI"));
	}

	@Test
	void testDecryptBellaso() {
		assertEquals("SAMSUNG", CryptoManager.bellasoDecryption("- S_^^!", "Z_FLIP"));
		assertEquals("BATH AND BODY", CryptoManager.bellasoDecryption("FF#L2B\\X$G^H+", "DEODRANT"));
		assertEquals("THIS IS HOW A ROLLS_ROYCE LAUNCHES FROM 0", CryptoManager.bellasoDecryption("WWJ&4L\"![#Z/B3&R[M&3U^ZVY#[B(\"FWF&4I!P 43", "COAST"));
	}

}

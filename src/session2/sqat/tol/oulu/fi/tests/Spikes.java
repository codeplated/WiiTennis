package session2.sqat.tol.oulu.fi.tests;
import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;


public class Spikes {
	/*
	 *  A spike test is a kind of unit-test used to check how dependecies (aka something external to your system) work.
	 *  In this case I wasn't completely sure how HashMap works, so I wrote a small test to check that it works as expected.
	 *  That's a good alternative to read the Java doc, mostly when you cannot access it 
	 */
	@Test
	public void hashMapSpike() {
		HashMap<Integer, String> scoreMapping = new HashMap<Integer, String>();
		scoreMapping.put(0, "Love");
		scoreMapping.put(1, "Fifteen");
		scoreMapping.put(2, "Thirty");
		scoreMapping.put(3, "Forty");
		
		assertEquals("Love", scoreMapping.get(0));
		assertEquals("Fifteen", scoreMapping.get(1));
		assertEquals("Thirty", scoreMapping.get(2));
		assertEquals("Forty", scoreMapping.get(3));
	}

}

/**
 * 
 */
package test.java.search;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.*;
import main.java.search.HorizSearcher;
import main.java.search.Searcher;

/**
 * @author jaredgorton
 *
 */
class TestHorizSearcher {
	
	Searcher searcher;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
//		searcher = new HorizSearcher();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
//		searcher = new HorizSearcher();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void findNull() {
		Searcher searcher = new HorizSearcher();
		Coord c = searcher.findWord(null);
		assert(c == null);
	}
	
	@Test
	void test3() {
		Searcher searcher = new HorizSearcher();
		Coord c = searcher.findWord(null);
		assertEquals(c, null);
	}

}

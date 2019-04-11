package movies;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class MovieTest {
	
	Movie testMovie = new Movie("The Matrix", 2001, "Director", "Writer");

	@Test
	void testConstructor() {
		assertEquals("The Matrix", testMovie.name);
		assertEquals(2001, testMovie.year);
		assertEquals("Director", testMovie.director);
		assertEquals("Writer", testMovie.writer);
	}
/*
	@Test
	void testGetName() {
		fail("Not yet implemented");
	}

	@Test
	void testGetYear() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDirector() {
		fail("Not yet implemented");
	}

	@Test
	void testGetWriter() {
		fail("Not yet implemented");
	}

	@Test
	void testCompareToGreater() {
		fail("Not yet implemented");
	}

	@Test
	void testCompareToSmaller() {
		fail("Not yet implemented");
	}

	@Test
	void testEqualsTrue() {
		fail("Not yet implemented");
	}

	@Test
	void testEqualsFalse() {
		fail("Not yet implemented");
	}

	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

*/
}

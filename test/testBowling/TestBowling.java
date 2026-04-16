package testBowling;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bowling.Bowling;

class TestBowling {
	
	Bowling bowling;

	@BeforeEach
	void initialisationBowling() {
		bowling = new Bowling();
	}
	
	@Test
	void testBowling1() {
		assertEquals(0, bowling.score());
	}

	@Test
	void testBowling2() {
		for(int i = 0; i<20; i++)
			bowling.roll(0);
		assertEquals(0, bowling.score());
		
	}
	
	@Test
	void testBowling3() {
		for(int i = 0; i<20; i++)
			bowling.roll(1);
		assertEquals(20, bowling.score());
		
	}
}

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
	void test() {
		assertEquals(0, bowling.calculerScore());
	}


}

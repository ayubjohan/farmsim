package org.farmsim;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import org.farmsim.GameEnv;

class GameEnvTests {

	// @Test
	// void test() {
	// 	fail("Not yet implemented");
    // }

    private final GameEnv testGameEnv;

    @BeforeEach
    public void init () {
        this.testGameEnv = new GameEnv("Johan", 7);
    }
    
    @Test
    public void nameTest() {
        assertEquals(this.testGameEnv.getName(), "Johan");
    }

    @Test
    public void nextDayTest() {
        this.testGameEnv.nextDay();
        assertEquals(this.testGameEnv.getDay(), 2);
    }

    @Test
    public void maxDayTest() {
        for(int i = 0; i < 7; i++) {
            assertDoesNotThrow(this.testGameEnv.nextDay());
        }

    }

}

package Kata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingGameTest {
    private BowlingGame game;

    @Before
    public void setUp(){
        game = new BowlingGame();
    }

    @Test
    public void GutterGame() {
        for (int i=0; i<20; i++) {
            game.roll(0);
        }
        assertEquals(0, game.score());
    }

    @Test
    public void AllOnes() {
        for (int i=0; i<20; i++) {
            game.roll(1);
        }
        assertEquals(20, game.score());
    }

    @Test
    public void OneSpare() {
        game.roll(5);
        game.roll(5);
        game.roll(3);
        assertEquals(16, game.score());
    }

    @Test
    public void OneStrike() {
        game.roll(10);
        game.roll(3);
        game.roll(4);
        assertEquals(24, game.score());
    }

    @Test
    public void PerfectGame() {
        for (int i=0; i<12; i++) {
            game.roll(10);
        }
        assertEquals(300, game.score());
    }
}
package Kata;

public class BowlingGame {
    public int[] rolls;
    public int currentRolls;

    public void roll(int pins) {
        rolls[currentRolls] = pins;
        currentRolls += 1;
    }

    public int score() {
        int score = 0;
        int frameIndex = 0;
        for (int frame=0; frame<10; frame++) {
            if (rolls[frameIndex] == 10) {
                score += 10 + rolls[frameIndex + 1] + rolls[frameIndex + 2];
                frameIndex += 1;
            } else if (rolls[frameIndex] + rolls[frameIndex+1] == 10) {
                score += 10 + rolls[frameIndex + 2];
                frameIndex += 2;
            } else {
                score += rolls[frameIndex] + rolls[frameIndex + 1];
                frameIndex += 2;
            }
        }
        return score;
    }

    public BowlingGame() {
        this.rolls = new int[21];
        this.currentRolls = 0;
    }

    public static void main(String[] args) {

    }
}

import java.util.Arrays;
public class SimpleDotCom {
    private int[] locationCells;
    private int[] rightGuessCell;
    int numOfHits = 0;
    public void setLocationCells(int[] locs) {
        locationCells = locs;
        rightGuessCell = new int[3];
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Past";
        for(int cell : locationCells) {
            if (guess == cell) {
                System.out.println(rightGuessCell);
                for(int guessCell : rightGuessCell) {
                    if(guess == guessCell) {
                        result = "Duplicate!";
                        break;
                    }
                }
                rightGuessCell = Arrays.copyOf(rightGuessCell, rightGuessCell.length + 1);
                rightGuessCell[rightGuessCell.length - 1] = guess;
                result = "Hit";
                numOfHits++;
                break;
            }
            if (numOfHits == locationCells.length) {
                result = "Sank";
            }
        }
        System.out.println(result);
        return result;
    }

}
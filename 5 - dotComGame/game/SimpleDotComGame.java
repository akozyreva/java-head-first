public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuess = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom1 theDotCom = new SimpleDotCom1();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum +2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while(isAlive == true) {
            String guess = helper.getUserInput("Input number");
            String result = theDotCom.checkYourself(guess);
            numOfGuess++;
            if(result.equals("Sank")) {
                isAlive = false;
                System.out.println("You won with " + numOfGuess + " tries");
            }
        }


    }
}
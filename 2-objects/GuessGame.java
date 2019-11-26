public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player ();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I make a number from 0 to 9");

        while (true) {
            System.out.println("Number, which was made..." + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Assumption of the 1 player is" + guessp1);

            guessp2 = p2.number;
            System.out.println("Assumption of the 2 player is" + guessp2);

            guessp3 = p3.number;
            System.out.println("Assumption of the 3 player is" + guessp3);

            if(guessp1 == targetNumber) {
                p1isRight = true;
            }
            if(guessp2 == targetNumber) {
                p2isRight = true;
            }
            if(guessp3 == targetNumber) {
                p3isRight = true;
            }

            if(p1isRight || p2isRight || p3isRight) {
                System.out.println("We have winner!");
                System.out.println("Is it 1 player?" + p1isRight);
                System.out.println("Is it 2 player?" + p2isRight);
                System.out.println("Is it 3 player?" + p3isRight);
                break;
            } else {
                System.out.println("Players must try one more time");
            }
        }
    }
}
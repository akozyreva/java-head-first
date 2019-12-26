import java.util.*;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;
    private String [] sitesName = {"Pets.com","eToys.com","Go2.com"};
    private int numOfActiveSites; 

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName(sitesName[0]);
        DotCom two = new DotCom();
        two.setName(sitesName[1]);
        DotCom three = new DotCom();
        three.setName(sitesName[2]);     
        dotComList.add(one);  
        dotComList.add(two);  
        dotComList.add(three);  
        numOfActiveSites = dotComList.size();
        /* for testing
         System.out.println(dotComList.get(0).getName());
         System.out.println(one.getName());*/
        
        System.out.println("Your aim - sink all 3 sites");
        System.out.println(sitesName[0] + " " + sitesName[1] + " " + sitesName[2] );
        System.out.println("Try to sink them with the minimal count of steps");
        System.err.println("Type -1 for exit");

        for(DotCom set : dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            set.setLocationCells(newLocation);
        }

    }
    private void startPlaying() {
        while(!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Make step");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        if(userGuess.equals("-1")) {
            System.out.println("Your tries: " + numOfGuesses);
            showAlivedSites();
            System.exit(0);
        }
        numOfGuesses++;
        String result = "Past";
        for(DotCom set : dotComList) {
            result = set.checkYourself(userGuess);
            if(result.equals("Hit")) break;
            if(result.equals("Sank")) {
                dotComList.remove(set);
                numOfActiveSites--;
                break;
            }
        }
        System.out.println(result);
        showAlivedSites();
        

    }

    private void showAlivedSites() {
        if(dotComList.size() != 0) {
            System.out.println("You still don't hit these sites: ");
            for( DotCom set : dotComList) {
                System.out.print(set.getName() + " ");
            }
            System.out.println("\n");
        }
    }

    private void finishGame() {
        System.out.println("You won!");
        System.out.println("Number of tries = " + numOfGuesses);
    }
    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
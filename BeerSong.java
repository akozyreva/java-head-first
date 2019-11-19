public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while(beerNum > 0) {
            if(beerNum == 1) {
                word = "bottle";
            }
            System.out.println(beerNum + " " +  word + " on the wall");
            System.out.println(beerNum + " " + word + " beer");
            System.out.println("Take one");
            System.out.println("Put on the circle");
            beerNum = beerNum - 1;
            if(beerNum == 0) System.out.println("No bottles on the wall");
        }
        
    }
}
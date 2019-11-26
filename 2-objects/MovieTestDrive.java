public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "How to burn out on stocks";
        one.genre = "Tragedy";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Lost in the Office";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();
        Movie three = new Movie();
        three.title = "Byte-club";
        three.genre = "Tragedy, but funny";
        three.rating = 127;
    }
}
import java.util.ArrayList;;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public void setName(String n) {
        name = n;
    }

    // my getter for testing!
    public String getName() {
        return name;
    }

    public String checkYourself(String userInput) {
        String result = "Past";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if(locationCells.isEmpty()) {
                result = "Sank";
                System.out.println("OOps. You sank " + name);
            } else {
                result = "Hit";
            }
        }
        // System.out.println(result);
        return result;
    }

}
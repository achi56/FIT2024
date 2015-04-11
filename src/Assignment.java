/**
 * Created by Aaron on 30/03/2015.
 */
public class Assignment extends Assessment {
    private String title;
    private int weight;


    private void setValues(String newTitle, int newWeight){
        title = newTitle;
        weight = newWeight;

    }
    public String description() {
        return ("Assignment: "  + title + " weight " + weight + "%");
    }
}

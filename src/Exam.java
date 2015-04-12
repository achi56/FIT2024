/**
 * Created by Aaron on 30/03/2015.
 */
public class Exam extends Assessment {
    private int weight;
    private int duration;

    public Exam(int newWeight, int newDuration) {
        weight = newWeight;
        duration = newDuration;
    }



    public String description() {
        return ("Exam duration: " + duration + " minutes, weight " + weight + "%");
    }
}

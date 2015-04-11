/**
 * Created by Aaron on 30/03/2015.
 */
public abstract class Assessment {
    private int weight;

    public String description() {
        return ("" + weight);
    }

    public void setValues(int newWeight) {
        weight = newWeight;
    }

    public void get() {

    }
}

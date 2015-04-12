/**
 * Created by Aaron on 30/03/2015.
 */
public abstract class Assessment {
    private int weight;

    public abstract String description();

    public void setWeight(int newWeight) {
        weight = newWeight;
    }

    public int getWeight() {
        return weight;
    }
}

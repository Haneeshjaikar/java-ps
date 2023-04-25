package Week5.Behavioral.Strategy;

public class Mall implements Strategy {

    @Override
    public String build(String location) {
        return "Building a mall in the " + location + " area.";
    }
}
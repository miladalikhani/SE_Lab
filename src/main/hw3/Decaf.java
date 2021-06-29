package main.hw3;

public class Decaf extends DarkRoast{
    @Override
    public String getDescription() {
        return "Delicious Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}

package main.hw3;

public class Espresso extends DarkRoast{
    @Override
    public String getDescription() {
        return "Delicious Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

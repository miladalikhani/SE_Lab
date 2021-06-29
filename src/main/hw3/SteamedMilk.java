package main.hw3;

public class SteamedMilk extends CondimentDecorator{
    SteamedMilk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with milk";
    }

    @Override
    public double cost() {
        return (super.cost() + 0.1);
    }
}


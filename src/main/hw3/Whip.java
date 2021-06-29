package main.hw3;

public class Whip extends CondimentDecorator{
    Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with whip";
    }

    @Override
    public double cost() {
        return  (super.cost() + 0.1);
    }
}

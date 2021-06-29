package main;

public class Mocha extends CondimentDecorator{
    Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with mocha";
    }

    @Override
    public double cost() {
        return (super.cost() + 0.2);
    }
}

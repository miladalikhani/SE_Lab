package main.hw3;

public abstract class CondimentDecorator implements Beverage{
    private Beverage beverage;

    CondimentDecorator (Beverage beverage) {
        this.beverage = beverage;
    }

    private Beverage getBeverage()
    {
        return this.beverage;
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription();
    }

    @Override
    public double cost() {
        return getBeverage().cost();
    }
}


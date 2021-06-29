package main.hw3;

public class Multiplier implements AbstractMultiplier{
    private MultiplierImplementation multiplierImplementation;

    Multiplier(MultiplierImplementation multiplierImplementation)
    {
        this.multiplierImplementation = multiplierImplementation;
    }

    @Override
    public void setMultiplierImplementation(MultiplierImplementation multiplierImplementation) {
        this.multiplierImplementation = multiplierImplementation;
    }

    @Override
    public int compute(int a, int b) {
        return this.multiplierImplementation.compute(a,b);
    }


}

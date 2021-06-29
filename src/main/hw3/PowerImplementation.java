package main.hw3;

public abstract class PowerImplementation {

    private AbstractMultiplier multiplier;

    public PowerImplementation(AbstractMultiplier abstractMultiplier) {
        this.multiplier = abstractMultiplier;
    }

    public AbstractMultiplier getMultiplier()
    {
        return multiplier;
    }

    public abstract int compute(int a, int b);
}



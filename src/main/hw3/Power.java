package main.hw3;

public class Power implements AbstractPower{

    private PowerImplementation powerImplementation;

    Power (PowerImplementation powerImplementation)
    {
        this.powerImplementation = powerImplementation;
    }

    @Override
    public void setPowerImplementation(PowerImplementation powerImplementation) {
        this.powerImplementation = powerImplementation;
    }

    @Override
    public int compute(int a, int b) {
        return this.powerImplementation.compute(a, b);
    }
}



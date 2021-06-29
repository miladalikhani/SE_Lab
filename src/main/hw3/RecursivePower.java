package main.hw3;

public class RecursivePower extends PowerImplementation{


    RecursivePower (AbstractMultiplier abstractMultiplier)
    {
        super(abstractMultiplier);
    }

    @Override
    public int compute(int a, int b) {
        if (b == 0)
            return 1;
        else if (a == 0)
            return 0;
        else if (b == 1)
            return a;
        else
            return super.getMultiplier().compute(a, this.compute(a,b-1));
    }
}


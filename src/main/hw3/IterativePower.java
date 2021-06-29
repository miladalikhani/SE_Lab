package main.hw3;

public class IterativePower extends PowerImplementation{

    IterativePower (AbstractMultiplier abstractMultiplier) { super(abstractMultiplier); }

    @Override
    public int compute(int a, int b) {
        if (b == 0)
            return 1;
        else if (a == 0 )
            return 0;
        else
        {
            int temp = 1;
            for (int i = 0; i < b; i++)
                temp = super.getMultiplier().compute(temp, a);
            return temp;
        }
    }
}



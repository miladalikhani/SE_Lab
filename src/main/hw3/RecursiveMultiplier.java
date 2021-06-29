package main.hw3;

public class RecursiveMultiplier implements MultiplierImplementation{
    @Override
    public int compute(int a, int b) {
        if (a == 0)
            return 0;
        else if (a == 1)
            return b;
        else
            return this.compute(a-1,b) + b;
    }
}



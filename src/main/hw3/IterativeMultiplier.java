package main.hw3;

public class IterativeMultiplier implements MultiplierImplementation{
    @Override
    public int compute(int a, int b) {
        if (a == 0)
            return 0;
        else {
            int temp = 0;
            for (int i = 0; i < a; i++)
                temp += b;
            return temp;
        }
    }
}

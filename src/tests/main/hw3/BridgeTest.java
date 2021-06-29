package main.hw3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BridgeTest {

    @Test
    void multiplierTest()
    {
        IterativeMultiplier iterativeMultiplier = new IterativeMultiplier();
        AbstractMultiplier multiplier = new Multiplier(iterativeMultiplier);
        Assertions.assertEquals(6, multiplier.compute(2,3));
        Assertions.assertEquals(0, multiplier.compute(0,3));
        Assertions.assertEquals(0, multiplier.compute(3,0));
        Assertions.assertEquals(3, multiplier.compute(3,1));
        Assertions.assertEquals(3, multiplier.compute(1,3));
        RecursiveMultiplier recursiveMultiplier = new RecursiveMultiplier();
        multiplier.setMultiplierImplementation(recursiveMultiplier);
        Assertions.assertEquals(6, multiplier.compute(2,3));
        Assertions.assertEquals(0, multiplier.compute(0,3));
        Assertions.assertEquals(0, multiplier.compute(3,0));
        Assertions.assertEquals(3, multiplier.compute(3,1));
        Assertions.assertEquals(3, multiplier.compute(1,3));
    }

    @Test
    void powerTest()
    {
        MultiplierImplementation iterativeMultiplier = new IterativeMultiplier();
        MultiplierImplementation recursiveMultiplier = new RecursiveMultiplier();
        AbstractMultiplier multiplier = new Multiplier(iterativeMultiplier);

        PowerImplementation iterativePower = new IterativePower(multiplier);
        PowerImplementation recursivePower = new RecursivePower(multiplier);
        AbstractPower power = new Power(iterativePower);

        Assertions.assertEquals(0, power.compute(0,3));
        Assertions.assertEquals(1, power.compute(3,0));
        Assertions.assertEquals(3, power.compute(3,1));
        Assertions.assertEquals(1, power.compute(1,3));
        Assertions.assertEquals(8, power.compute(2,3));

        multiplier.setMultiplierImplementation(recursiveMultiplier);
        Assertions.assertEquals(0, power.compute(0,3));
        Assertions.assertEquals(1, power.compute(3,0));
        Assertions.assertEquals(3, power.compute(3,1));
        Assertions.assertEquals(1, power.compute(1,3));
        Assertions.assertEquals(8, power.compute(2,3));


        multiplier.setMultiplierImplementation(iterativeMultiplier);
        power.setPowerImplementation(recursivePower);
        Assertions.assertEquals(0, power.compute(0,3));
        Assertions.assertEquals(1, power.compute(3,0));
        Assertions.assertEquals(3, power.compute(3,1));
        Assertions.assertEquals(1, power.compute(1,3));
        Assertions.assertEquals(8, power.compute(2,3));

        multiplier.setMultiplierImplementation(recursiveMultiplier);
        Assertions.assertEquals(0, power.compute(0,3));
        Assertions.assertEquals(1, power.compute(3,0));
        Assertions.assertEquals(3, power.compute(3,1));
        Assertions.assertEquals(1, power.compute(1,3));
        Assertions.assertEquals(8, power.compute(2,3));

        
    }

}

package main;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void computeAreaTest(){
        Rectangle rectangle = new Rectangle(10, 20);
        Assert.assertEquals(200, rectangle.computeArea());
    }

}
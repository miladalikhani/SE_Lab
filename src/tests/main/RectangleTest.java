package main;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void computeAreaTest(){
        Rectangle rectangle = new Rectangle(10, 20);
        Assert.assertEquals(200, rectangle.computeArea());
        rectangle.setHeight(20);
        rectangle.setWidth(30);
        Assert.assertEquals(600, rectangle.computeArea());
    }

    @Test
    void changeWidthandHeightTest()
    {
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.setHeight(20);
        rectangle.setWidth(30);
        Assert.assertEquals(20, rectangle.getHeight());
        Assert.assertEquals(30, rectangle.getWidth());
    }

}
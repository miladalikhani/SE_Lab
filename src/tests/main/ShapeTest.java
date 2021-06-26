package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShapeTest {

    @Test
    void rectangleComputeAreaTest(){
        Rectangle rectangle = new Rectangle(10, 20);
        Assertions.assertEquals(200, rectangle.computeArea());
        rectangle.setHeight(20);
        rectangle.setWidth(30);
        Assertions.assertEquals(600, rectangle.computeArea());
    }

    @Test
    void rectangleChangeWidthandHeightTest()
    {
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.setHeight(20);
        rectangle.setWidth(30);
        Assertions.assertEquals(20, rectangle.getHeight());
        Assertions.assertEquals(30, rectangle.getWidth());
    }

    @Test
    void squareComputeAreaTest()
    {
        Square square = new Square(10);
        Assertions.assertEquals(100, square.computeArea());
        square.setEdge(20);
        Assertions.assertEquals(400, square.computeArea());
    }

    @Test
    void squareChangeEdge()
    {
        Square square = new Square(10);
        Assertions.assertEquals(10,square.getEdge());
        square.setEdge(20);
        Assertions.assertEquals(20, square.getEdge());
    }

}
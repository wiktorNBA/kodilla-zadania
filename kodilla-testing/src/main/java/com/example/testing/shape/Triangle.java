package com.example.testing.shape;

public class Triangle implements Shape{
    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public int getField() {
        return 50;
    }
}

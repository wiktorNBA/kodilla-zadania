package com.example.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    /*
    public ShapeCollector(Shape shape){
        this.shape=shape;
    }

     */
    public Shape shape;
    private ArrayList<Shape> shapeCollection = new ArrayList<Shape>();

    public void addFigure (Shape shape){
        shapeCollection.add(shape);
    }

    public void removeFigure(Shape shape){
        shapeCollection.remove(shape);
    }

    public String getFigure(int n){
        String shapeName = shapeCollection.get(n).getShapeName();
        return shapeName;
    }

    public String showFigures(){

        int size=shapeCollection.size();
        String tmp = "";

        for(int i=0; i<size; i++){
            tmp=tmp + shapeCollection.get(i).getShapeName() + " ";
        }
        return tmp;
    }

    public int size(){
        return shapeCollection.size();
    }
}

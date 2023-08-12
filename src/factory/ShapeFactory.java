package factory;

import baseClass.Shape;
import childClass.Circle;
import childClass.Rectangle;
import childClass.Hexagon;


public class ShapeFactory {

    public Shape getShape(Integer sides){
        if(sides == 0){
            return new Circle();
        } else if(sides == 4){
            return new Rectangle();
        } else if (sides == 6){
            return new Hexagon();
        } else{
            return null;
        }
    }

}

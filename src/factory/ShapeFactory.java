package factory;

import baseClass.Shape;
import childClass.Circle;
import childClass.Rectangle;
import childClass.Square;

import java.util.Objects;

public class ShapeFactory {
    public Shape getShape(String shape){
        if(Objects.equals(shape, "Circle")){
            return new Circle();
        } else if (Objects.equals(shape, "Rectangle")){
            return new Rectangle();
        } else if (Objects.equals(shape, "Square")){
            return new Square();
        } else{
            return null;
        }
    }

}

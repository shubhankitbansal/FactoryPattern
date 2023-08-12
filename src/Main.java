import baseClass.Shape;
import factory.ShapeFactory;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("Circle");
        if(Objects.nonNull(circle)){
            circle.getShape();
        } else{
            System.out.println("Not exist");
        }

        Shape rectangle = shapeFactory.getShape("Rectangle");
        if(Objects.nonNull(rectangle)){
            rectangle.getShape();
        } else{
            System.out.println("Not exist");
        }

        Shape square = shapeFactory.getShape("Square");
        if(Objects.nonNull(square)){
            square.getShape();
        } else{
            System.out.println("Not exist");
        }

        Shape other = shapeFactory.getShape("Other");
        if(Objects.nonNull(other)){
            other.getShape();
        } else{
            System.out.println("Not exist");
        }

    }
}
import baseClass.Shape;
import factory.ShapeFactory;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape(0);
        if(Objects.nonNull(circle)){
            circle.getShape();
        } else{
            System.out.println("Not exist");
        }

        Shape rectangle = shapeFactory.getShape(4);
        if(Objects.nonNull(rectangle)){
            rectangle.getShape();
        } else{
            System.out.println("Not exist");
        }

        Shape square = shapeFactory.getShape(6);
        if(Objects.nonNull(square)){
            square.getShape();
        } else{
            System.out.println("Not exist");
        }

        Shape other = shapeFactory.getShape(1);
        if(Objects.nonNull(other)){
            other.getShape();
        } else{
            System.out.println("Not exist");
        }

    }
}
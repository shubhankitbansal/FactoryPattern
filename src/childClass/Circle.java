package childClass;

import baseClass.Shape;

public class Circle implements Shape {

    @Override
    public void getShape(){
        System.out.println("This is a circle");
    }
}

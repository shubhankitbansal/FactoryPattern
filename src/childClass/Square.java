package childClass;

import baseClass.Shape;

public class Square implements Shape {
    @Override
    public void getShape(){
        System.out.println("This is a Square");
    }
}

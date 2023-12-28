package ch4;

public class AnyClass {

    // 결합도가 높고 응집도가 낮다.
    void anyMethod(Rectangle rectangle,int multiple){
        rectangle.setLeft(rectangle.getLeft() * multiple);
        rectangle.setBottom(rectangle.getBottom() * multiple);
        rectangle.setRight(rectangle.getRight() * multiple);
        rectangle.setTop(rectangle.getTop() * multiple);
    }

}

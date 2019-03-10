package week1.shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Rectangle(3,3);
        System.out.println( "矩形的面积为： "+shape.getArea());
        Shape shape1 = new Circle(3,0);
        System.out.println("所求圆形的面积为： "+shape1.getArea());
    }
}

package week1.shape;

/**
 * 定义抽象类
 * @auther xupeng
 * 2019.3.10
 */
public abstract class Shape {
    public double x;
    public double y;
    public Shape() {
    }

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void show(){
        System.out.println("面积");
    }
    public abstract double  getArea();
}

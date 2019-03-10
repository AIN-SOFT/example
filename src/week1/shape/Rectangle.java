package week1.shape;

/**
 * 定义子类，继承Shape抽象类
 */
public class Rectangle extends Shape{

    public Rectangle(){
        super();
    }
    public Rectangle(double x,double y){
        super(x,y);
    }

    @Override
    public double getArea() {
        return this.x *this.y ;
    }
}

package week1.shape;


public class Circle extends  Shape{

    public Circle(){
        super();
    }
    public Circle(double x,double y){
        super(x,y);
    }
    @Override
    public double getArea() {
        return this.x *this.x *3.14*0.5;
    }
}

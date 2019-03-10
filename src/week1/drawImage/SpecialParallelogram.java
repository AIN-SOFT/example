package week1.drawImage;

/**
 * 接口的声名以及实现
 * @auther xupeng
 * 2019.3.10
 */

//定义接口
interface DrawImage{
    //定义抽象方法
    public void draw();
}

//矩形类实现drawTest接口
class Rectangle implements DrawImage{
    //矩形类中实现draw()方法
    public void draw(){
        System.out.println("画矩形");
    }
}
class Square implements DrawImage{
    public void draw(){
        System.out.println("画正方形");
    }
}
class Diamond implements DrawImage{
    public void draw(){
        System.out.println("画菱形");
    }
}

//定义特殊的平行四边形类
public class SpecialParallelogram {
    public static void main(String[] args) {
        //接口也可以实现向上转型操作
        DrawImage[] images = {new Rectangle(),new Square(),new Diamond()};
        //遍历画图形接口类型的数组
        for (int i=0;i<images.length;i++){
            //调用draw()方法
            images[i].draw();
        }
    }
}

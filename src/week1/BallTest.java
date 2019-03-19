package week1;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

public class BallTest {
    public static void main(String[] args) {
        //创建List对象，存入Student对象
        List<Ball> list = new ArrayList<>();
        list.add(new Ball("篮球", 60));
        list.add(new Ball("排球", 100));
        list.add(new Ball("羽毛球", 4));
        //调用Collections的sort方法，会自动调用之前写的compareTo方法进行排
        Collections.sort(list);
        //用foreach循环遍历list

        for (Ball ball : list) {
            System.out.println("类型: " + ball.getType() + ",价格：" +
                    ball.getPrice());

        }

    }

}
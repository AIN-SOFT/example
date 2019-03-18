package week1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.lang.String;

/**
 * 计算两个Date的差值
 * @author xupeng
 * 2019.3.17
 */
public class DateDifferentExample {
    public static void main(String[] args) {
        //分别定义起止时间
        String s1,s2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入打卡的时间");
        s1 = scanner.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = format.format(new Date());
        s2 = date;
        Date d1;
        Date d2;
        long diff = 0;
        //通过SimpleDateFormat的对象来把String类型的时间对象转化成Date类型的对象
        try {
            d1 = format.parse(s1);
            d2 = format.parse(s2);
            //毫秒ms的差值
            diff = d2.getTime() - d1.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //将毫秒分别换算成秒
        long diffSeconds = diff / 1000;

        if (Math.abs(diffSeconds)< 120){
            System.out.println("2分钟前");
        }
        else if(Math.abs(diffSeconds)> 300 && Math.abs(diffSeconds)< 3500){
            System.out.println("5分钟前");
        }
        else if (Math.abs(diffSeconds)> 3500 && Math.abs(diffSeconds)< 7200){
            System.out.println("1小时前");
        }
        else if(Math.abs(diffSeconds)> 7200 && Math.abs(diffSeconds)< 10800){
            System.out.println("2小时前");
        }
        else if(Math.abs(diffSeconds)> 86400 && Math.abs(diffSeconds)< 172800){
            System.out.println("1天前");
        }
        else if(Math.abs(diffSeconds)>172800 ){
            System.out.println("2天前");
        }
        System.out.println("距离现在的时间:  "+Math.abs(diffSeconds)+" 秒");
    }
}

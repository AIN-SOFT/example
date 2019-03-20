package week1.spirit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Booktest {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1,"花花世界",12.0));
        bookList.add(new Book(2,"青春之歌",11.0));
        bookList.add(new Book(3,"面朝大海",10.0));
        //用迭代器输出结果
        Iterator<Book> iterator = bookList.iterator();
        System.out.println("ID    NAME    PRICE");
        System.out.println("----------原数据----------");
        while (iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book.getId()+"   "+book.getName()+"   "+book.getPrice());

        }
        //插入一个数据
        System.out.println("----------插入数据--------");
        bookList.add(2,new Book(1,"高等数学",0.1));
        bookList.forEach(book -> System.out.println(book.getId()+"  "+book.getName()+"   "+book.getPrice()));
        //移除数据
        System.out.println("---------移除后---------");
        bookList.remove(2);
        bookList.forEach(book -> System.out.println(book.getId()+"  "+book.getName()+"   "+book.getPrice()));
        //修改数据
        System.out.println("--------修改后------------");
        bookList.set(2,new Book(2,"舞蹈",11.0));
        bookList.forEach(book -> System.out.println(book.getId()+"  "+book.getName()+"   "+book.getPrice()));
//        System.out.println(list);
        System.out.println(bookList.indexOf("花花世界"));
        System.out.println(bookList.lastIndexOf("花花世界"));
    }
}

package week1.market;

/**
 * 定义抽象类
 * @auther xupeng
 * 2019.3.10
 */
public abstract class Market {
    //商场名称
    public String name;
    //商品名称
    public String goods;
    //抽象对象用来传输信息
    public abstract void shop();
}

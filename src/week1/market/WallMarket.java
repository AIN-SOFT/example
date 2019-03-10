package week1.market;

/**
 * 定义子类，继承抽象类
 * @auther xupeng
 * 2019.3.10
 */
public class WallMarket extends Market {
    public void shop() {
        System.out.println(name + "实体店购买" + goods);
    }
}

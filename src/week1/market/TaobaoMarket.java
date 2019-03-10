package week1.market;

/**
 * 定义子类，继承抽象类
 * @auther xupeng
 * 2019.3.10
 */
public class TaobaoMarket extends Market {
    @Override
    public void shop() {
        System.out.println(name + "网购" + goods);
    }
}

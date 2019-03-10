package week1.market;

/**
 * 使用子类创建抽象类对象
 * @auther xupeng
 * 2019.3.10
 */
public class GoShopping {
    public static void main(String[] args) {
        Market market = new WallMarket();
        market.name = "沃尔玛";
        market.goods = "七匹狼内裤";
        market.shop();
        market = new TaobaoMarket();
        market.name = "淘宝";
        market.goods = "花裙";
        market.shop();
    }
}

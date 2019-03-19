package week1;

public class Ball implements Comparable<Ball>{
    private String type;
    private int price;

    public Ball(String type, int price) {
        this.type = type;
        this.price = price;
    }
    public Ball(){

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Ball ball) {
        return this.getPrice() - ball.getPrice();
    }
}

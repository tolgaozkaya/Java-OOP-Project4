package Entity;

public class Game {
    private int id;
    private String name;
    private String detail;
    private int price;

    public Game() {
    }

    public Game(int id, String name, String detail, int price) {
        this.setId(id);
        this.setName(name);
        this.setDetail(detail);
        this.setPrice(price);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

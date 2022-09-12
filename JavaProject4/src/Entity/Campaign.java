package Entity;

public class Campaign {
    private int id;
    private String name;
    private String detail;

    public Campaign() {
    }

    public Campaign(int id, String name, String detail) {
        this.setId(id);
        this.setName(name);
        this.setDetail(detail);
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
}

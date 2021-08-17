package Models;

import org.springframework.web.bind.annotation.ModelAttribute;

public class Product {
    private int id;
    private String name;
    private String theloai;
    private String path;

    public Product() {
    }

    public Product(int id, String name, String theloai,String path) {
        this.id = id;
        this.name = name;
        this.theloai = theloai;
        this.path = path;
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

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}

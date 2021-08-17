package Services;

import Models.Product;

import java.util.ArrayList;

public class ProductService {
    public ArrayList<Product> ListProduct=new ArrayList<>();
    public ProductService(){
        ListProduct.add(new Product(1,"A","A", "A"));
    }
}

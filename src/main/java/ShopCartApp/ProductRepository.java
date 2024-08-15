package ShopCartApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> products;

    @PostConstruct
    public void initRepository() {
        products = new ArrayList<Product>(Arrays.asList(
                new Product(1, "milk", 12),
                new Product(2, "bread", 10),
                new Product(3, "apple", 6),
                new Product(4, "orange", 7),
                new Product(5, "meat", 25)
        ));
    }

    public void showAllProducts() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }
//    public void showProductById(int id) {
//        for (Product product : products) {
//            if (product.getId() == id) {
//                System.out.println(product.toString());
//            }
//        }
//    }

    public Product findProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

}

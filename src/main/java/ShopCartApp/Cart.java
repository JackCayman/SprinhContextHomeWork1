package ShopCartApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

@Component
public class Cart {


    private List<Product> cart = new ArrayList<>();
    private ProductRepository productRepository;

    @Autowired
    public void  setProductRepositoru(ProductRepository productRepository){
        this.productRepository = productRepository;
    }



    public void addToCart (int id){
        cart.add(productRepository.findProductById(id));
    }
    public void removeFromCart (int id){
        cart.remove(productRepository.findProductById(id));
    }
    public void showCartContent(){
        System.out.println("Содржимое корзины");
        for (Product product : cart) {
            System.out.println(product.toString());
        }
    }


}

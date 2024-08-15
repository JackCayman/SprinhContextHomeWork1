package ShopCartApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ShopCartApp");

        ProductRepository productRepository = context.getBean(ProductRepository.class);
        productRepository.showAllProducts();
        System.out.println();
        System.out.println(productRepository.findProductById(4));

        Cart cart = context.getBean(Cart.class);
        cart.addToCart(1);
        cart.addToCart(5);
        System.out.println();

        cart.removeFromCart(5);
        cart.showCartContent();

        context.close();


    }


}

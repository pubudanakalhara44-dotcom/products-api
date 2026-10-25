package uk.ac.westminster.products_api.service;

import org.springframework.stereotype.Service;
import uk.ac.westminster.products_api.product.DigitalProduct;
import uk.ac.westminster.products_api.product.PhysicalProduct;
import uk.ac.westminster.products_api.product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public List<Product> getAllProducts(){
        return products;
    }

    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    public ProductService() {
        Product digitalProduct = new DigitalProduct(nextId, "app0", 200, "sdjhfbs", 200);

        Product PhysicalProduct = new PhysicalProduct(nextId, "app", 200, 500, "200*10*100");

        products.add(digitalProduct);
        products.add(PhysicalProduct);
    }
    public Optional<Product> getProductById(long id){
        return products.stream()
                    .filter(p -> p.getId().equals(id)) //it filter the one by one
                    .findFirst();
    }
    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList();
    }

}

package uk.ac.westminster.products_api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class productController {
    @GetMapping("/{id}")
    public product getbyID(@PathVariable long id){
        return new product (id,"laptop",2000.20);
    }

}

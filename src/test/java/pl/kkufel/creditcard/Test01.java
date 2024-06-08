package pl.kkufel.creditcard;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.kumorek.ecommerce.catalog.ArrayListProductStorage;
import pl.kumorek.ecommerce.catalog.ProductCatalog;

//http://localhost:8080/

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        System.out.println("Here we go!!!");
        SpringApplication.run(App.class, args);
    }

    @Bean
    ProductCatalog createMyProductCatalog() {
        var catalog = new ProductCatalog(new ArrayListProductStorage());
        catalog.addProduct("Lego set 8084", "niece one");
        return catalog;
    }
}
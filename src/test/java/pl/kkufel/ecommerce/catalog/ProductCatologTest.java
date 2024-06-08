package pl.kkufel.ecommerce.catalog;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ProductCatologTest {

    @Test
    void itAllowsToListAvailableProducts() {
        ProductCatalog catalog = thereIsProductCatalog();

        List<Product> products = catalog.allProducts();

        assertThat(products).hasSize(0);


    }

    private ProductCatalog thereIsProductCatalog() {
        return new ProductCatalog();
    }
}

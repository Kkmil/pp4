package pl.kkufel.creditcard;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CreditCardTest {

    @Test
    void itAllowsToAssignCreditLimit() {

        CreditCard card = new CreditCard("123-3211");

        card.assignCreditLimit(BigDecimal.valueOf(1000));

        assert  BigDecimal.valueOf(1000).equals(card.getBalance());

    }
}

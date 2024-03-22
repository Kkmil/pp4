package pl.kkufel.creditcard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

public class CreditCardTest {

    @Test
    void itAllowsToAssignCreditLimit() {

        CreditCard card = thereIsExampleCreditCard();

        card.assignCreditLimit(BigDecimal.valueOf(1000));

        assert  BigDecimal.valueOf(1000).equals(card.getBalance());

    }

    @Test
    void itAllowsToAssignCreditLimitv2() {

        CreditCard card = thereIsExampleCreditCard();

        card.assignCreditLimit(BigDecimal.valueOf(2000));
        assertEquals(BigDecimal.valueOf(2000), card.getBalance(), "Card balance does not match expected value");

    }

    @Test
    void itDenyToChangeAlreadyAssignedCredit() {
        CreditCard card = thereIsExampleCreditCard();
        card.assignCreditLimit(BigDecimal.valueOf(1000));

        try {
            card.assignCreditLimit(BigDecimal.valueOf(2000));
            fail("Exception should be thrown");
        } catch (CreditCantBeModifiedException e) {
            assertTrue(true);
        }
    }
    @Test
    void itDenyToChangeAlreadyAssignedCreditv2() {
        CreditCard card = thereIsExampleCreditCard();
        card.assignCreditLimit(BigDecimal.valueOf(1000));

        //lambda
        //java // (x) -> x * 2
        assertThrows(
                CreditCantBeModifiedException.class,
                () -> card.assignCreditLimit(BigDecimal.valueOf(2000)));
    }


    @Test
    void itAllowsToPayBill() {
        CreditCard card = thereIsExampleCreditCard();
        card.assignCreditLimit(BigDecimal.valueOf(1000));

        card.withdraw(BigDecimal.valueOf(500));

        assertEquals(
                BigDecimal.valueOf(500),
                card.getBalance());
    }

    @Test
    void denyWithdrawBelowCurrentBalance() {
        CreditCard card = thereIsExampleCreditCard();
        card.assignCreditLimit(BigDecimal.valueOf(1000));

        card.withdraw(BigDecimal.valueOf(900));

        assertThrows(
                NotEnoughFoundsException.class,
                () -> card.withdraw(BigDecimal.valueOf(200)));
    }

    private static CreditCard thereIsExampleCreditCard() {
        CreditCard card = new CreditCard("123-3211");
        return card;
    }
}

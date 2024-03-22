package pl.kkufel.creditcard;

import java.math.BigDecimal;

public class CreditCard {
    private BigDecimal credit;

    public CreditCard(String cardNumber) {
    }

    public void assignCreditLimit(BigDecimal credit) {
        if (this.credit != null) {throw new CreditCantBeModifiedException();}
        this.credit = credit;
    }

    public BigDecimal getBalance() {

        return credit;
    }

    public void withdraw(BigDecimal money) {



    }
}

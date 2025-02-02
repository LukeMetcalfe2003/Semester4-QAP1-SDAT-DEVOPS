import org.example.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAccount {
    Account account1 = new Account("customer", 150.00);

    @Test
    public void testAccount() {
        Assertions.assertEquals("customer", account1.customerName);
        Assertions.assertEquals(150.00, account1.accountBal);
    }

    @Test
    public void testDeposit() {
        account1.deposit(100.00);
        Assertions.assertEquals(250.00, account1.accountBal);
    }

    @Test
    public void testWithdraw() {
        account1.withdraw(90.00);
        Assertions.assertEquals(60.00, account1.accountBal);

        account1.withdraw(60.00);
        Assertions.assertEquals(0.00, account1.accountBal);
    }
}

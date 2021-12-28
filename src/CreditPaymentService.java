public class CreditPaymentService {
    public int calculate(int amount, int term)
        {
        int interest = 9_99;
        int pyment = (amount * interest / 100 / 100 * term + amount) / (12 * term);
        return pyment;
    }
}



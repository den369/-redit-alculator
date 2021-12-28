public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int pyment = service.calculate(1_000_000, 1);

        System.out.println(pyment);
    }
}

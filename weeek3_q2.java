// Interface class create pandren
interface PaymentMethod {
    void processPayment(double amount);
}

// Credit Card class la interface class implement pandren
class CreditCardPayment implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card");
    }
}

// PayPal class la interface class implement pandren
class PayPalPayment implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Paid Rs." + amount + " using PayPal");
    }
}

// UPI class la interface class implement pandren
class UPIPayment implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI");
    }
}

// Processor (DIP implement pandren)
class PaymentProcessor {
    private PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay(double amount) {
        paymentMethod.processPayment(amount);
    }
}

// Main calss create pandren
public class PaymentSystem {
    public static void main(String[] args) {
        //objects create pandren

        PaymentMethod cc = new CreditCardPayment();
        PaymentProcessor processor1 = new PaymentProcessor(cc);
        processor1.pay(5000);

        PaymentMethod upi = new UPIPayment();
        PaymentProcessor processor2 = new PaymentProcessor(upi);
        processor2.pay(1500);
    }
}

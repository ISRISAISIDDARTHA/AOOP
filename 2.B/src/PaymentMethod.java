abstract class Paymenttype {
    public abstract void pay();
}
class Card extends Paymenttype {
    @Override
    public void pay() {
        System.out.println("Paying with debit card!");
    }
}
abstract class Payment {
    public abstract Paymenttype createPaymentMethod();
}
class CardFactory extends Payment {
    @Override
    public Paymenttype createPaymentMethod() {
        return new Card();
    }
}

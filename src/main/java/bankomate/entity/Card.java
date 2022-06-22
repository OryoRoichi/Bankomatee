package bankomate.entity;
public class Card {
    private long cardNumber;
    private int pin;
    private String currency;
    private int cashAmount;

    private Bank bank;
    public Card(long cardNumber, int pin, String currency,int cashAmount,Bank bank) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.currency = currency;
        this.cashAmount = cashAmount;
        this.bank=bank;
    }

    public Bank getBank() {
        return bank;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public String getCurrency() {
        return currency;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(int cashAmount) {
        this.cashAmount = cashAmount;
    }
}

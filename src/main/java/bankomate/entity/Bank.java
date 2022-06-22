package bankomate.entity;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<Card> bank;

    public Bank() {
        this.bank = new ArrayList<Card>();
    }

    public Card getCard(Long cardNumber) {
        for (int i = 0; i < bank.size(); i++) {
            if (bank.get(i).getCardNumber() == cardNumber) {
                return bank.get(i);
            }
        }
        return null;
    }

    public Card createCard(long cardNumber, int pin, String currency, int cashAmount, Bank bank) {
        Card card = new Card(cardNumber, pin, currency, cashAmount, bank);
        setCard(card);
        return card;
    }

    private void setCard(Card card) {
        this.bank.add(card);
    }
}

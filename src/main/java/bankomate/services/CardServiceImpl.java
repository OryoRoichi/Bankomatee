package bankomate.services;

import bankomate.entity.Card;
import bankomate.exceptions.NoEnoughMoneyException;
import bankomate.exceptions.WrongPinException;

public class CardServiceImpl implements CardService {

    private AuthorizationService authorizationService;
    private Card card;

    public CardServiceImpl(AuthorizationService authorizationService, Card card) {
        this.authorizationService = authorizationService;
        this.card = card;
    }

    public void cashIssue(int amount) throws NoEnoughMoneyException {
        if (card.getCashAmount() < amount) {
            throw new NoEnoughMoneyException();
        }
        card.setCashAmount(card.getCashAmount() - amount);

    }

    public String viewCashAmount() {
        return String.valueOf(card.getCashAmount());
    }

    public String pinChange(int oldPin, int newPin) throws WrongPinException {
        authorizationService.logIn(card, oldPin);
        card.setPin(newPin);
        return "Пин-код успешно изменен";
    }

    public String addCash(int amount) {
        this.card.setCashAmount(this.card.getCashAmount() + amount);
        return "Средства успешно зачислены на Ваш счет";
    }
    public void addFromCardToCard(Card otherCard, int amount) throws NoEnoughMoneyException {
        if (this.card.getCashAmount() < amount) {
            throw new NoEnoughMoneyException();
        }
        this.card.setCashAmount(this.card.getCashAmount() - amount);
        otherCard.setCashAmount(otherCard.getCashAmount() + amount);
    }
}

import bankomate.entity.Bank;
import bankomate.entity.Bankomate;
import bankomate.entity.Card;

public class Main {

    public static void main(String[] args) {
        Bank bankName = new Bank();
        bankName.createCard(4132, 7777, "BYN", 100,bankName);
        bankName.createCard(1234, 7878, "BYN", 100,bankName);
        Bankomate bankomate = new Bankomate(bankName.getCard(4132L));
        bankomate.run();
    }
}

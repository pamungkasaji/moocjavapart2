
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> cardsInHand;

    public Hand() {
        this.cardsInHand = new ArrayList<>();
    }

    public void add(Card card) {
        cardsInHand.add(card);
    }

    public void print() {
        cardsInHand.forEach(System.out::println);
    }

    public void sort() {
        Collections.sort(cardsInHand);
    }

    public int handValue(){
        return cardsInHand.stream().mapToInt(value -> value.getValue()).sum();
    }

    @Override
    public int compareTo(Hand o) {
        return this.handValue() - o.handValue();
    }

//    public void sortBySuit() {
//        BySuitInValueOrder sort = new BySuitInValueOrder();
//        Collections.sort(cardsInHand, sort);
//    }
//
//    public int getHandValue() {
//        return cardsInHand.stream().mapToInt(Card::getValue).sum();
//    }
//
//    @Override
//    public int compareTo(Hand otherHand) {
//        return this.getHandValue() - otherHand.getHandValue();
//    }
}

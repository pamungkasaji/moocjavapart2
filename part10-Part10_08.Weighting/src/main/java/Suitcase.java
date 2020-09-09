
import java.util.ArrayList;
import java.util.Comparator;

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> items;

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item Item) {
        if (this.totalWeight() + Item.getWeight() > this.maximumWeight) {
            return;
        }

        this.items.add(Item);
    }

    public int totalWeight() {
        return items.stream()
                .mapToInt(item -> item.getWeight())
                .sum();
    }

    public void printItems() {
        items.stream()
                .forEach(item -> System.out.println(item));
//        items.stream().forEach(System.out::println);
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        return items.stream()
                .max(Comparator.comparingInt(Item::getWeight)).get();

        //return this.items.stream().max((t1, t2) -> t1.getWeight() - t2.getWeight()).get();
    }

    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }

        return items.size() + " items (" + this.totalWeight() + " kg)";
    }
}

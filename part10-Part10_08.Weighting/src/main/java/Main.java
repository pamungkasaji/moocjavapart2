

public class Main {

    public static void main(String[] args) {
        Item t = new Item("book",1);
        Item s = new Item("idk",3);
        Item u = new Item("yes",5);
        Suitcase m = new Suitcase(5);
        m.addItem(t);
        m.addItem(s);
        m.addItem(u);
        System.out.println(m);
        m.printItems();
    }

}

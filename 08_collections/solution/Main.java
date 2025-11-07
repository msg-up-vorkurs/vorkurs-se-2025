package solution;

public class Main {
    static void main() {
        ArrayStringList arrayList = new ArrayStringList();
        arrayList.add("Bread");
        arrayList.add("Butter");
        arrayList.add("Marmelade");
        arrayList.add("Chips");

        IO.println(arrayList.contains("Marmelade"));
        arrayList.print();

        IO.println("----");

        LinkedStringList linkedList = new LinkedStringList("Bread");
        linkedList.add("Butter");
        linkedList.add("Marmelade");
        linkedList.add("Chips");
        linkedList.print();
    }
}

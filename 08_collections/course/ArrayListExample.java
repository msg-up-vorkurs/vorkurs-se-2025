import java.util.ArrayList;


void main() {
    // init people list
    ArrayList people = new ArrayList();

    // Add Values
    people.add("steve");
    people.add("josch");
    people.add("isabelle");
    people.add(new String("bob"));

    // Index of
    IO.println("Index of josch: " + people.indexOf("josch"));

    // Element at position 1
    IO.println("Person at spot 1: " + people.get(1));

    // Element contains bob?
    IO.println("Contains bob: " + people.contains(new String("bob")));

    // Remove Bob

    // Check if bob still exists

    // Re-add bob
}

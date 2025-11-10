import java.util.ArrayList;


void main() {
    // init people list
    LinkedList<String> queue = new LinkedList<String>();

    // Add Values
    queue.add("bob");
    queue.add("michi");
    queue.add(1, "thomas");

    IO.println(queue.toString());

    // Index of
    IO.println("Index of michi: " + queue.indexOf("michi"));

    // Element at position 0
    IO.println("Element at 0: " + queue.get(0));


    // Element contains bob?
    IO.println("Contains thomas?: " + queue.contains("thomas"));

    // Remove Bob
    queue.remove("bob");

    // Check if bob still existsqueue
    IO.println("Contains bob?: " + queue.contains("bob"));
    IO.println(queue.toString());

    // For-each list
    for (String person : queue) {
        IO.println(person);
    }

    // Re-add bob
    queue.add("bob");
}

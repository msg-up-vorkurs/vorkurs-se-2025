void main() {
    String[] queue = new String[2];
    // define & init array + fill with values
    queue[0] = "bob";
    queue[1] = "michi";

    // call add to array method
    queue = addToArray(queue, "jonas");
    queue = addToArray(queue, "jonas");
    queue = addToArray(queue, "jonas");
    queue = addToArray(queue, "jonas");
    queue = addToArray(queue, "jonas");
    queue = addToArray(queue, "jonas");
    queue = addToArray(queue, "jonas");
    queue = addToArray(queue, "jonas");
    queue = addToArray(queue, "jonas");

    IO.println(Arrays.toString(queue));

    // print out items

}

// Method to add Element to Array
public static String[] addToArray(String[] array, String newElement) {
    String[] newArray = new String[array.length + 1];
    for(int i = 0; i < array.length; i = i+1) {
        newArray[i] = array[i];
    }

    newArray[array.length] = newElement;
    return newArray;
}

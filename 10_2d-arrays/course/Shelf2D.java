package course;

public class Shelf2D {

    int length;
    int height;

    String[][] drawers;

    public Shelf2D(int length, int height) {
        this.length = length;
        this.height = height;
        this.drawers = new String[length][height];
    }

    public Shelf2D(String[][] initialContent) {
        this.length = initialContent.length;
        this.height = initialContent[0].length;
        this.drawers = initialContent;
    }

    // method: get from drawer x y


    // method: put into drawer x y str
    public void putIntoDrawer(int positionX, int positionY, String newContent) {

    }

    public void printDrawersWithPositions() {
        for (int indexHeight = 0; indexHeight < this.height; indexHeight++) {
            for (int indexLength = 0; indexLength < this.length; indexLength++) {

                IO.println("Position (" + indexLength + "," + indexHeight + ") beinhaltet: "
                        + this.drawers[indexLength][indexHeight]);
            }

        }
    }

    public void printDrawersVisually() {
        for (int indexHeight = 0; indexHeight < this.height; indexHeight++) {
            for (int indexLength = 0; indexLength < this.length; indexLength++) {

                if (this.drawers[indexLength][indexHeight] == null) {
                    IO.print("[empty], ");
                } else {
                    IO.print(this.drawers[indexLength][indexHeight] + ", ");
                }
            }

            IO.println();
        }
    }
}

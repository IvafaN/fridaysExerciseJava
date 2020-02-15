package Week1.Classes;

public class Rectangle {

    // fields
    private int width;
    private int height;
    private String color;

    // constructor
    Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // methods
    private int getWidth() {
        return width;
    }

    private int getHeight() {
        return height;
    }

    private String getColor() {
        return color;
    }

    private int setWidth() {
        return width = 1;
    }

    private int setHeight() {
        return height = 1;
    }

    private String setColor() {
        return color = "Blue";
    }

    void draw() {

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.printf(color.substring(0,1));
            }
            System.out.println();
        }
    }
}

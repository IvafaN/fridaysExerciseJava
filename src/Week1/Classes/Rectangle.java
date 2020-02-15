package Week1.Classes;

public class Rectangle {

    // fields
    private int width = 1;
    private int height = 1;
    private String color = "Blue";

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

    void draw() {

    }
}

package oops;

class Box {
    double width;
    double height;
    double depth;
}

public class ObjectCreation {
    public static void main(String[] args) {
        Box box = new Box();

        box.width = 10;
        box.depth = 20;
        box.height = 30;

        double volume = box.width * box.height * box.depth;

        System.out.println(volume);

    }
}

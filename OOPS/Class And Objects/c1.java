class Box {
    double width, height, depth;
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double volume() {
        return width * height * depth;
    }
}

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box(5.0, 4.0, 3.0);
        System.out.println("Width = " + b1.width);
        System.out.println("Height = " + b1.height);
        System.out.println("Depth = " + b1.depth);
        System.out.println("Volume of the box = " + b1.volume());
    }
}

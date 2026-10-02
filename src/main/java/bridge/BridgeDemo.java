package bridge;

public final class BridgeDemo {
    public static void main(String[] args) {
        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();

        Shape circle = new Circle(vector, 3);
        Shape square = new Square(vector, 5);

        System.out.println("Circle with vector renderer:");
        System.out.println(circle.draw());
        System.out.println("Square with vector renderer:");
        System.out.println(square.draw());

        circle.setRenderer(raster);
        square.setRenderer(raster);

        System.out.println("Circle with raster renderer:");
        System.out.println(circle.draw());
        System.out.println("Square with raster renderer:");
        System.out.println(square.draw());
    }
}

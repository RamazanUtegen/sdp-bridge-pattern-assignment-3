package bridge;

public final class BridgeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(new VectorRenderer(), 2);
        check(circle.draw().equals("<circle cx=\"0\" cy=\"0\" r=\"2\" />"));

        circle.setRenderer(new RasterRenderer());
        check(circle.draw().contains("*****"));

        Shape square = new Square(new VectorRenderer(), 3);
        check(square.draw().contains("width=\"3\""));
        square.setRenderer(new RasterRenderer());
        check(square.draw().equals("***" + System.lineSeparator()
                + "***" + System.lineSeparator() + "***"));

        try {
            new Circle(new VectorRenderer(), 0);
            throw new AssertionError("invalid radius was accepted");
        } catch (IllegalArgumentException expected) {
            check(expected.getMessage().contains("radius"));
        }

        try {
            square.setRenderer(null);
            throw new AssertionError("null renderer was accepted");
        } catch (NullPointerException expected) {
            check(expected.getMessage().contains("renderer"));
        }

        System.out.println("Bridge tests passed");
    }

    private static void check(boolean condition) {
        if (!condition) {
            throw new AssertionError("Bridge test failed");
        }
    }
}

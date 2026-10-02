package bridge;

public final class Circle extends Shape {
    private final int radius;

    public Circle(Renderer renderer, int radius) {
        super(renderer);
        if (radius < 1) {
            throw new IllegalArgumentException("radius must be positive");
        }
        this.radius = radius;
    }

    @Override
    public String draw() {
        return renderer().renderCircle(radius);
    }
}

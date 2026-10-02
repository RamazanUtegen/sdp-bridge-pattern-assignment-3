package bridge;

public final class Square extends Shape {
    private final int side;

    public Square(Renderer renderer, int side) {
        super(renderer);
        if (side < 1) {
            throw new IllegalArgumentException("side must be positive");
        }
        this.side = side;
    }

    @Override
    public String draw() {
        return renderer().renderSquare(side);
    }
}

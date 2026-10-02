package bridge;

public final class VectorRenderer implements Renderer {
    @Override
    public String renderCircle(int radius) {
        return "<circle cx=\"0\" cy=\"0\" r=\"" + radius + "\" />";
    }

    @Override
    public String renderSquare(int side) {
        return "<rect x=\"0\" y=\"0\" width=\"" + side
                + "\" height=\"" + side + "\" />";
    }
}

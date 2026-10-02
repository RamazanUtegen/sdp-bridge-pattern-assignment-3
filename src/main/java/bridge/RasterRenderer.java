package bridge;

public final class RasterRenderer implements Renderer {
    @Override
    public String renderCircle(int radius) {
        StringBuilder image = new StringBuilder();
        for (int y = -radius; y <= radius; y++) {
            for (int x = -radius; x <= radius; x++) {
                image.append(x * x + y * y <= radius * radius ? '*' : ' ');
            }
            if (y < radius) {
                image.append(System.lineSeparator());
            }
        }
        return image.toString();
    }

    @Override
    public String renderSquare(int side) {
        StringBuilder image = new StringBuilder();
        for (int y = 0; y < side; y++) {
            for (int x = 0; x < side; x++) {
                image.append('*');
            }
            if (y < side - 1) {
                image.append(System.lineSeparator());
            }
        }
        return image.toString();
    }
}

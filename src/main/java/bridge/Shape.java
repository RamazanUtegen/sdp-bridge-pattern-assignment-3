package bridge;

import java.util.Objects;

public abstract class Shape {
    private Renderer renderer;

    protected Shape(Renderer renderer) {
        setRenderer(renderer);
    }

    protected Renderer renderer() {
        return renderer;
    }

    public void setRenderer(Renderer renderer) {
        this.renderer = Objects.requireNonNull(renderer, "renderer");
    }

    public abstract String draw();
}

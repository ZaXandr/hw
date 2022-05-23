package interfaces.task2;

public final class Circle implements MutableShape {
    private float centerX;
    private float centerY;
    private float radius;

    public Circle(float centerX, float centerY, float radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public float getCenterX() {
        return centerX;
    }

    public float getCenterY() {
        return centerY;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public void move(float dx, float dy) {
        this.centerX += dx;
        this.centerY += dy;
    }

    @Override
    public void scale(float factor) {
        this.radius = this.radius * factor;
    }
}

package uebung3;

public class Punkt {
    private float x;
    private float y;

    public Punkt(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void verschiebe(float vx, float vy) {
        this.x += vx;
        this.y += vy;
    }
}
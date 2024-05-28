public class Triangle extends Form {
    private float height;
    private float base;

    public Triangle() {
        height = 45;
    }

    public Triangle(float h, String color) {
        super(color);
        height = h;
    }

    @Override
    public float getArea() {
        return height * base;
    }

    public String toString() {
        return "Triangle | color=" + super.getColor() + "| base=" + base + "height=" + height;
    }

    public boolean equals(Object o) {
        if (o instanceof Triangle) {
            Triangle t = (Triangle) o;
            boolean colorEqual = false;
            if (t.getColor() == null && this.getColor() == null) {
                colorEqual = true;
            } else if (t.getColor() != null && this.getColor() != null && this.getColor().equals(t.getColor())) {
                colorEqual = true;
            }
            if (t.base == this.base && t.height == this.height && colorEqual) {
                return true;
            }
        }
        return false;
    }
}

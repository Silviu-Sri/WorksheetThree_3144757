package griffith;

class RightAngledTriangle extends Shape {
    private double base, height, hypotenuse;

    public RightAngledTriangle(String name, double base, double height, double hypotenuse) {
        super(name);
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }

    @Override
    public double perimeter() {
        return base + height + hypotenuse;
    }

    @Override
    public String toString() {
        return super.toString() + ", Base: " + base + ", Height: " + height + ", Hypotenuse: " + hypotenuse;
    }
}
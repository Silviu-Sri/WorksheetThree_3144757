package griffith;

class Rhombus extends Shape {
    private double diagonal1, diagonal2, side;

    public Rhombus(String name, double diagonal1, double diagonal2, double side) {
        super(name);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.side = side;
    }

    @Override
    public double area() {
        return (diagonal1 * diagonal2) / 2;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return super.toString() + ", Diagonals: " + diagonal1 + " & " + diagonal2 + ", Side: " + side;
    }
}
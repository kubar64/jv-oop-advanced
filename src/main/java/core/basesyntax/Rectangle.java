package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    @Override
    public void draw() {
        double area = sideA * sideB;
        System.out.println("Figure: Rectangle, area: "
                + area
                + " sq. units, sideA: "
                + sideA
                + " units, sideB: "
                + sideB
                + " color: "
                + getColor());
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
}

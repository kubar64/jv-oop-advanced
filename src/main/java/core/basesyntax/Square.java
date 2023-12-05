package core.basesyntax;

public class Square extends Figure {
    private int side;

    @Override
    public void draw() {
        double area = Math.sqrt(side);
        System.out.println("Figure: Square, area: "
                + area
                + " sq. units, side: "
                + side
                + " units, color: "
                + getColor());
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}

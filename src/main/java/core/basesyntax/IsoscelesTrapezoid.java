package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseA;
    private int baseB;
    private int height;

    @Override
    public void draw() {
        double area = 0.5 * height * (baseA + baseB);
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                + area
                + " sq. units, baseA: "
                + baseA
                + " units, baseB: "
                + baseB
                + " units, height: "
                + height
                + " units,color: "
                + getColor());
    }

    public int getBaseA() {
        return baseA;
    }

    public int getBaseB() {
        return baseB;
    }

    public int getHeight() {
        return height;
    }

    public void setBaseA(int baseA) {
        this.baseA = baseA;
    }

    public void setBaseB(int baseB) {
        this.baseB = baseB;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

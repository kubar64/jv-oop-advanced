package core.basesyntax;

public class RightTriangle extends Figure {
    int firstLeg;
    int secondLeg;
    @Override
    public void draw() {
        double area = 0.5*firstLeg*secondLeg;
        System.out.println("Figure: IsoscelesTrapezoid, area: "+ area+" sq. units, firstLeg: "+firstLeg+" units, secondLeg: "+secondLeg+" units,color: "+color);
    }
}

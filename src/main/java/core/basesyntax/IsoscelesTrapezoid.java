package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    int baseA;
    int baseB;
    int height;
    @Override
    public void draw() {
        double area = 0.5*height*(baseA+baseB);
        System.out.println("Figure: IsoscelesTrapezoid, area: "+ area+" sq. units, baseA: "+baseA+" units, baseB: "+baseB+" units, height: "+height+" units,color: "+color);
    }
}

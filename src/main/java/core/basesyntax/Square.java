package core.basesyntax;

public class Square extends Figure {
    int side;
    @Override
    public void draw() {
        double area = Math.sqrt(side);
        System.out.println("Figure: Square, area: "+ area+" sq. units, side: "+side+" units, color: "+color);
    }
}

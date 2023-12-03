package core.basesyntax;

public class Circle extends Figure {
    int radius;
    @Override
    public void draw() {
        double area = Math.PI*Math.sqrt(radius);
        System.out.println("Figure: Circle, area: "+ area+" sq. units, radius: "+radius+" units, color: "+color);
    }
}

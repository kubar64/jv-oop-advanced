package core.basesyntax;

public class Rectangle extends Figure {
    int sideA;
    int sideB;
    @Override
    public void draw() {
        double area = sideA * sideB;
        System.out.println("Figure: Rectangle, area: "+ area+" sq. units, sideA: "+sideA+" units, sideB: "+sideB+" color: "+color);
    }
}

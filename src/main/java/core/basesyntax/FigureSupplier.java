package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static Figure getRandomFigure() {
        Random random = new Random();
        int figureGenerator = random.nextInt(5);
        switch (figureGenerator) {
            case 0 -> {
                Circle circle = new Circle();
                circle.setColor(ColorSupplier.getRandomColor());
                circle.setRadius(random.nextInt(101));
                return circle;
            }
            case 1 -> {
                IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid();
                trapezoid.setColor(ColorSupplier.getRandomColor());
                trapezoid.setBaseA(random.nextInt(100));
                trapezoid.setBaseB(random.nextInt(100));
                trapezoid.setHeight(random.nextInt(100));
                return trapezoid;
            }
            case 2 -> {
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(ColorSupplier.getRandomColor());
                rectangle.setSideA(random.nextInt(100));
                rectangle.setSideB(random.nextInt(100));
                return rectangle;
            }
            case 3 -> {
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(ColorSupplier.getRandomColor());
                rightTriangle.setFirstLeg(random.nextInt(100));
                rightTriangle.setSecondLeg(random.nextInt(100));
                return rightTriangle;
            }
            case 4 -> {
                Square square = new Square();
                square.setColor(ColorSupplier.getRandomColor());
                square.setSide(random.nextInt(100));
                return square;
            }
            default -> {
                return null;
            }
        }
    }

    public static Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor("WHITE");
        circle.setRadius(10);
        return circle;
    }
}

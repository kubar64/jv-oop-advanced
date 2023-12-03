package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static Figure getRandomFigure(){
        Random random = new Random();
        int figureGenerator = random.nextInt(5);
        switch (figureGenerator) {
            case 0 -> {
                Circle circle = new Circle();
                circle.color = ColorSupplier.getRandomColor();
                circle.radius = random.nextInt(101);
                return circle;
            }
            case 1 -> {
                IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid();
                trapezoid.color = ColorSupplier.getRandomColor();
                trapezoid.baseA = random.nextInt(100);
                trapezoid.baseB = random.nextInt(100);
                trapezoid.height = random.nextInt(100);
                return trapezoid;
            }
            case 2 -> {
                Rectangle rectangle = new Rectangle();
                rectangle.color = ColorSupplier.getRandomColor();
                rectangle.sideA = random.nextInt(100);
                rectangle.sideB = random.nextInt(100);
                return rectangle;
            }
            case 3 -> {
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.color = ColorSupplier.getRandomColor();
                rightTriangle.firstLeg = random.nextInt(100);
                rightTriangle.secondLeg = random.nextInt(100);
                return rightTriangle;
            }
            case 4 -> {
                Square square = new Square();
                square.color = ColorSupplier.getRandomColor();
                square.side = random.nextInt(100);
                return square;
            }
        }
        return null;
    }

    public static Figure getDefaultFigure(){
        Circle circle = new Circle();
        circle.color = "WHITE";
        circle.radius = 10;
        return circle;
    }
}

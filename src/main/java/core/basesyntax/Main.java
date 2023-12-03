package core.basesyntax;

public class Main {
    public static void main(String[] arg){
        Figure[] figures = new Figure[6];
        for (int i = 0 ; i < figures.length ; i ++){
            if (i < figures.length/2){
                figures[i] = FigureSupplier.getRandomFigure();
            } else {
                figures[i] = FigureSupplier.getDefaultFigure();
            }
        }
        for (Figure i : figures){
            i.draw();
        }
    }
}

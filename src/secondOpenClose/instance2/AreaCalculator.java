package secondOpenClose.instance2;


public class AreaCalculator {

    public static void main(String[] args) {

        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(7, 8);
        AreaCalculator areaCalculator = new AreaCalculator();

        System.out.println(areaCalculator.calculationArea(circle,rectangle));

    }

    public double calculationArea(AreaFormula... areaFormulas) {//передаем в арг.массив со всеми обектами
                                                                 // К.которые наследуются от AreaFormula
        double totalArea = 0;

        for (AreaFormula var : areaFormulas) {
            totalArea += var.calculationArea();

        }
        return totalArea;
    }
}

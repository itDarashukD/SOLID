package secondOpenClose.instance2;

public class Circle extends AreaFormula{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculationArea() {
        return Math.pow(this.radius,2)*Math.PI;
    }

}

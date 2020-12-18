package secondOpenClose.instance2;

public class Rectangle extends AreaFormula{
    private double hight;
    private double lenght;

    public Rectangle(double hight, double lenght) {
        this.hight = hight;
        this.lenght = lenght;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double calculationArea() {
        return this.hight*this.lenght;
    }
}

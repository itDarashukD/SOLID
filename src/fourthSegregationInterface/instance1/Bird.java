package fourthSegregationInterface.instance1;
/**
Это построение приложения нарушает 4й принцип - Interface Segregation,
 К. придется имплементить все методы, а некоторые будут излишними для них
 */
public interface Bird {
    public void run();
    void fly();
    void swim();
}

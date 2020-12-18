package first.singleReponsibility.instance1;

public class ConnectionManager implements IconnectionManager {

    @Override
    public void calling(int number) {
        System.out.println("i call");

    }

    @Override
    public void diconnecting() {
        System.out.println("call was disconnect");

    }
}

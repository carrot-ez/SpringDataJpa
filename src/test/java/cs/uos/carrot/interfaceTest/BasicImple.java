package cs.uos.carrot.interfaceTest;

public class BasicImple implements BasicInterface {
    @Override
    public void printName() {
        System.out.println("Baisc impl");
    }

    public void printNumber() {
        System.out.println("1234");
    }
}

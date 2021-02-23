package cs.uos.carrot.interfaceTest;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BasicInterfaceTest {

    @Test
    @DisplayName("인터페이스에 포함되어 있지 않은 메소드 테스트")
    public void notIncludeInInterfaceMethodTest() {
        BasicInterface bi = new BasicImple();

        bi.printName();
//        bi.printNumber(); // 인터페이스에 선언되어 있지 않은 구현클래스의 메소드는 사용할 수 없다.

        BasicImple bi2 = new BasicImple();
        bi2.printName();
        bi2.printNumber();
    }
}

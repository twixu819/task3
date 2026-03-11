package ex02;

public class MainTest {
    public static void main(String[] args) {
        ViewResult v = new ViewResult();
        v.viewInit();
        System.out.println("Testing initialization");
        v.viewShow();
        System.out.println("Test finished");
    }
}

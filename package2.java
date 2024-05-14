import mypack.two;

public class package2 {
    public static void main(String[] args) {
        System.out.println("Main Method");
        two obj = new two();
        obj.one();
        obj.oneonemethod();
        two.staticMethod();
        two.staticMethod2();
    }
}

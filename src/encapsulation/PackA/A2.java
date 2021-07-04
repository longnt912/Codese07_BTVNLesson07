package encapsulation.PackA;

public class A2 extends A {
    int x2;

    public A2() {
        System.out.println("Constructor 1 A2");
    }

    public A2(int x) {
        super();
        System.out.println("Constructor 1 A2");
    }

    public A2(int x1, int x2) {
        super(x1);
        System.out.println("Constructor 2 A2");
    }

    public void phuongThucPublic() {
        System.out.println("phuongThucPublic A2");
    }

}

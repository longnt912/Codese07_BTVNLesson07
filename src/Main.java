import encapsulation.PackA.A;
import encapsulation.PackA.A2;
import encapsulation.PackA.A3;

public class Main {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student(123);
        Student s4 = new Student("Nguyen Chi Thanh");

        s1.MSSV = 10;
        s2.MSSV = 20;

        s1.setMSSV(-123);
        s2.setMSSV(20);
        s2.setMSSV("20");

        float x = 10;
        char c = 65;

        s1.setMatKhau("123");
        System.out.println(s1.getMSSV());

        System.out.println("Create A");

        A a = new A();
        a.phuongThucPublic();
        int temp = a.thuocTinhPublic;

        System.out.println("Create A2");
        A2 a2 = new A2();
        a2.phuongThucPublic();
        temp = a.thuocTinhPublic;

        System.out.println("Create A2 with int ");
        A2 a3 = new A2(2);
        A3 aa3 = new A3();

        System.out.println("Ep kieu");
        A aaa = new A2();

    }
}

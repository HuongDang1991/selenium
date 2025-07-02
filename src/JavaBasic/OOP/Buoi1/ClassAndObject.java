package JavaBasic.OOP.Buoi1 ;
import JavaBasic.CoBan.HamvaBien;

class TestClass {
    public int number1 = 10;
    public int number2 = 20;

    public int Cong(int a, int b)
    {
        return a + b;
    }

    public void Print(int a, int b)
    {
        System.out.println(Cong(a, b));
    }
}

class Student
{
    int age = 25;
    String name = "Huongdtq";
    public void getInformation ()
    {
        System.out.println("Tên là: " + name);
        System.out.println("Tuổi là: " + age);
    }
}


public class ClassAndObject {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        //Khởi tạo 1 object thuộc 1 class
        TestClass obClass = new TestClass();
        TestClass  ob = new TestClass();

        Student baitap = new Student();
        baitap.getInformation();

        HamvaBien baitap2 = new HamvaBien();
        baitap2.Print("Tester",10);

        //Cách gọi ra các thành phần trong 1 class thông qua object
        obClass.Print(a, b);


//     HamvaBien abcBien = new HamvaBien();
//     abcBien.getInfo();
    }

}

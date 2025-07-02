package OOP_1.Buoi2;

public class TinhNapChong {
    static int add (int a, int b)
    {
        return a+b;
    }
    static int add (int a, int b, int c)
    {
        return a+b+c;
    }
    static String add (String a, String b, String c)
    {
        return a+b+c;
    }
    public static void main(String [] args)
    {
        TinhNapChong Adder = new TinhNapChong();
        System.out.println(Adder.add(2,3));
        System.out.println(Adder.add(2,3,4));
        System.out.println(Adder.add("22","33","Done"));
    }

}

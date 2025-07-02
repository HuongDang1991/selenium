package JavaBasic.CoBan;

public class ToanTu {

    public static void main(String[] args) {
        int var = 20;
        int num1;
        num1 = var;
        int num2 = 18;
        int num3 = 30;
        int a = 5;
        int b = 10;
        float number = 5.5f;
        Boolean sex1 = true;
        Boolean sex2 = false;
        String Firstname = "Huong";
        String Lastname = "Dang";

        String s = (a % b == 0) ? "a chia hết cho b" : "a không chia hết cho b";
        System.out.println(s);
        System.out.println(a + number);
        System.out.println(Firstname + " " + Lastname);
        System.out.println(sex1 || sex2);

        num3++;
        num1 -= num2;
        num2--;

        System.out.println(num3);
        System.out.println(num1);
        System.out.println(num2);

    }
}

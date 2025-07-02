package OOP_1.Buoi2;

class Bike{
    void run() {
        System.out.println("Chạy bộ");
    }

}
public class TinhDaHinh extends Bike {
     void run()
    {
        System.out.println("Chạy 40km/h");
    }
    void stop()
    {
        System.out.println("Không chạy");
    }
    public static void main (String[] args)
    {
        Bike chay = new TinhDaHinh(); //Vì TinhDaHinh kế thừa từ cha Bike nên sẽ gọi đc tât cả hàm trong cha, nếu trùng tên hàm thì ưu tiên hàm con
        Bike chay3 = new Bike();
        chay3.run();

        TinhDaHinh chay2 = new TinhDaHinh();
        chay2.run();
        chay2.stop();

    }
}

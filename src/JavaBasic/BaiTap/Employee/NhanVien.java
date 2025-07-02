package JavaBasic.BaiTap.Employee;

public class NhanVien {

    //Nhiều class nhưng chung 1 package, nếu ngoài phải kế thừa "extends"
    protected void profile()
    {
        String name = "Huong Dang";
        int age = 35;
        String birthday = "16/12/1991";
        String sex = "Nữ";

        System.out.println("Tên nhân viên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Ngày sinh: " + birthday);
        System.out.println("Giới tính: " + sex);
    }

    public int Cong2So(int a, int b)
    {

        return a+b;
    }
    public int Nhan2So(int a, int b)
    {
        return a*b;
    }
    public void Print(int a, int b)
    {
        System.out.println("Cộng tổng là: " + Cong2So(a,b));
        System.out.println("Tích là: " + Nhan2So(a,b));
    }

//    public static void main(String[] args)
//        {
//            NhanVien info = new NhanVien();
//            //info.Profile();
//            //System.out.println("Cộng tổng là: " + info.Cong2So(5,6));
//            //System.out.println("Tích là: " + info.Nhan2So(5,6));
//        }


}
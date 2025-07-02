package JavaBasic.CoBan;

public class HamvaBien {
     static String title = "Hello Automation Team"; // Biến/phương thức static là biến toàn cục
    int exp; // biến instance
     String job;

    public void getInfo() {
        int age = 25;
        String Lastname = "Huong";
        String Firstname = "Dang";
        float weight = 55.5f;
        Boolean sex = false;

        System.out.print("Họ và Tên: " + Firstname);
        System.out.println(" " + Lastname);
        System.out.println("Tuổi: " + age);
        System.out.println("Cân nặng: " + weight);
        System.out.println("Giới tính : " + sex);
    }

     public void Print(String job, int exp) {
        System.out.println("Công viêc :" + job);
        System.out.println("Số năm kinh nghiệm :" + exp);

    }

    public static void main(String[] args) {
        System.out.println("Tiêu đề :" + title);
        HamvaBien info = new HamvaBien();
        info.getInfo();
        info.Print("QC",1);

    }
}



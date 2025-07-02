package JavaBasic.CoBan;

public class VongLapFOR {
    public static void main(String[] args) {

        // int i = 1 để khởi tạo biến chạy (chạy từ 1 tới điều kiện cài đặt)
        // i <= 10 để giới hạn khi i chạy từ 1 đến 10 dừng
        // i ++ để tăng lên 1 mỗi lần chạy tới khi thỏa điều kiện
        int temp = 2;
        String s = "Good";
        for (int i = 1; i <= 10; i++) {
            if (i == temp) {
                //               System.out.println("Lần " + i + " Đã bằng tìm thấy và Dừng");
//                System.out.println("Số thứ tự: " + i);
//                System.out.println("Tên: " + name);
                System.out.println(s);
                break;
            }
            System.out.println("Lần " + i + " Chưa tìm thấy");
        }
    }

}

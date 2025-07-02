package JavaBasic.CoBan;

import OOP_1.Buoi1.PhamViTruyCap;

public class Array extends PhamViTruyCap {

    public void NacDanh() {
        int array[] = {1, 2, 3, 4}; // cách 1: khai báo mảng và gán giá trị trực tiếp
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        String a = "text1";
        String b = "text2";
        String array3[] = {a, b};
        for (String i : array3) {
            System.out.println(" " + i);
            //System.out.println(a + b); // Nối chuỗi
        }
    }

    public void KhaibaoMang() {
        //int array2[] = new int[]{5, 10, 15, 20}; // cách 2: khai báo và khởi tạo mảng

        String arrayName[] = new String[]{"John", "Brain", "Smith", "Dory"};
        String searchName = "Dory";
        boolean found = true;

        for (String x : arrayName) {
            if (x == searchName) {
                //found = true;
                System.out.print(found);
                break;
            }
            {
                System.out.println("No found");
            }
        }
    }

    public void BaiTap() {
        int arr[] = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 25;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("thứ tự" + " " + (i + 1) + " " + "là" + " " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Array info = new Array();
        // info.NacDanh();
         info.KhaibaoMang();
         info.msg(); // kế thừa từ class PhamViTruyCap
        //info.BaiTap();

    }
}

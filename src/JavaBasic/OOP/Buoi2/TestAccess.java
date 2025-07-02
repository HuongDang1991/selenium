package OOP_1.Buoi2;

import OOP_1.Buoi1.*;

//protected sử dụng trong cùng 1 package thì khởi tạo biến và gọi hàm bình thường. Còn muốn sử dụng khác package thì dùng kế thừa extends
public class TestAccess extends PhamViTruyCap {

    public static void main(String[] args) {
        TestAccess pro = new TestAccess();
        pro.msg();

    }
}

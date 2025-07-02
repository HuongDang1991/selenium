package OOP_1.Buoi1;

//Chỉ trong phạm vi 1 class duy nhất
class A_Private {
    private int data = 40;

    private void msg() {
        System.out.println(data);
    }
}

public class PhamViTruyCap {
    protected void msg() //Trong cùng package thì khởi tạo biến và gọi hàm bình thường. Nếu gọi khác package thì phải sử dụng extents kế thừa
    {
        System.out.println("Create sucessfull !!!");
    }

    public int cong2so(int a, int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        A_Private obj = new A_Private();
        PhamViTruyCap pViTruyCap = new PhamViTruyCap();
        pViTruyCap.msg();
        //obj.msg();

    }

}

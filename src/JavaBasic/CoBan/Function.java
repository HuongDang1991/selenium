package JavaBasic.CoBan;

public class Function {
// Cách khởi tạo biến trong hàm
    static void InputData(int arr[], int number_value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number_value;
        }
    }

    static void PrintData(int arr[], int number) {
        for (int i = 0; i < arr.length; i++) {
            // Cộng thêm 1 giá trị number = 5 vào từng phần tử của mảng in ra
            System.out.println("Thứ tự " + (i + 1) + " " + "là: " + (arr[i] + number));
        }
    }
// ----------------******--------------------------

// Cách 1: Kiểu phương thức KHÔNG TRẢ VỀ với từ khóa "void" trước tên hàm chỉ xử lý trong hàm và in giá trị ra và ko dùng giá trị này để gán vào biến mới
    static void min() {
        int arr[] = {5, 10, 2, 15};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (min > arr[i]) {
                min = arr[i];
            }
        System.out.println("Số nhỏ nhất trong mảng là: " + min);
    }

// Cách 2: Kiểu phương thức TRẢ VỀ (int/float/String)
    static int min2(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (min > arr[i]) {
                min = arr[i];
            }
        //System.out.println(min);
        return min; // Là sự trả về 1 hàm nào đó và dùng để gán vào biến mới, tái sử dụng
    }

    public static void main(String[] args) {
        //int mang[] = {5, 10, 3, 15};
        int mang2[] = {5, 10, 3, 15};

// Cách 1: run hàm KHÔNG TRẢ VỀ
        //InputData(mang, 5);
        PrintData(mang2, 2);
        min();

   //-------------******--------------

// Cách 2: run hàm TRẢ VỀ
        int a[] = {5, 1 , 1, 15};
        int b[] = {3, 10, 2, 15};
       // int bien2 = min2(a); // cách 1: gọi thông qua biến
        System.out.println("Cách run hàm TRẢ VỀ: Có giá trị nhỏ nhất trong mảng a là: " + min2(a));
        System.out.println("Cách run hàm TRẢ VỀ: Có giá trị nhỏ nhất trong mảng b là: " + min2(b));// cách 2: gọi trực tiếp hàm và truyền vào data mảng b hoặc a

    }

}

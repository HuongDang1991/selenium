package OOP_1.Buoi2;

public class TinhDongGoi {
    private String name;
    public String getName() // Lấy ra/Truy xuất giá trị của 1 phần tử tại vị trí đó.
    {
        return name;
    }
    public void setName(String name) // Truyền vào/Cập nhật 1 phần tử tại vị trí nào đó
    {
        this.name = name;
    }
    public static void main (String [] args)
    {
          TinhDongGoi tinh_DongGoi = new TinhDongGoi();
          tinh_DongGoi.getName();
          tinh_DongGoi.setName("Auto");
          System.out.println(tinh_DongGoi.getName());
          tinh_DongGoi.setName("Auto Testing");
          System.out.println(tinh_DongGoi.getName());


    }
}

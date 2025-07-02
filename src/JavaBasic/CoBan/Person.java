package JavaBasic.CoBan;

class Person {
    String name;
    int age;
    int birthYear;
    boolean isMale;

    // Constructor để gán giá trị khi tạo object
    public Person(String name, int age, int birthYear, boolean isMale) {
        this.name = name;
        this.age = age;
        this.birthYear = birthYear;
        this.isMale = isMale;
    }

    // Phương thức in thông tin
    public void printInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Năm sinh: " + birthYear);
        System.out.println("Giới tính: " + (isMale ? "Nam" : "Nữ"));
    }
    public static void main(String[] args)
    {
        Person p = new Person("An", 25, 2000, true);
        p.printInfo();
    }
}

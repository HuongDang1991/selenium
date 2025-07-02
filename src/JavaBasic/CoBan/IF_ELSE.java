package JavaBasic.CoBan;

public class IF_ELSE {
    int age = 20;
    String s = "Young";

    private void IF_ELSE() {

        if (age <= 20 && s == "Young") {
            System.out.println("Tuyển dụng được");
        } else {
            System.out.println("Edler. Không tuyển");
        }
    }

    public static void main(String[] args) {
        IF_ELSE condition = new IF_ELSE();
        condition.IF_ELSE();
    }
}


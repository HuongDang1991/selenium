package JavaBasic.CoBan;

public class TimChanLe {

    public void Input(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                System.out.println("Chẵn là: " + arr[i]);
            }
            else
            {
                System.out.println("Lẻ là: " + arr[i]);
            }
        }
    }

    public static void main (String[] args)
    {
        int abc[] = {1,5,10,15,20};
        int k[] = {1,2,3,3,3,3,3,3};
        TimChanLe info = new TimChanLe();
        info.Input(abc);
        info.Input(k);
    }
}

package JavaBasic.CoBan;

public class TimSoLonNhat {
    static int SearchMax(int arr[])
    {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (max < arr[i]) {
                max = arr[i];

            }
        }
        return max;
    }
    static int SearchMin(int arr[])
    {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (min > arr[i]) {
                min = arr[i];

            }
        }
        return min;
    }
    public static void main (String[] args)
    {
        int SN[] = {1,41,9,4,5};
        int SN1[] = {1,4,9,4,5,0};
        System.out.println(SearchMax(SN));
        System.out.println(SearchMin(SN1));
    }
}

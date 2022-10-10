import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        {
            int[] arr = {5, -2, 23, 7, 87, -42, 509};
            int[] arr1 = {5, -2, 23, 7, 87, -42, 509};
            int[] add = new int[8];
            //Arrays.sort(arr);
            System.out.println("The sorted array is: ");
            for (int i = 0;i<arr.length;i++) {
                add[i] = arr[i] + arr1[i];
                System.out.print(add[i] + " ");
            }
        }

    }
}
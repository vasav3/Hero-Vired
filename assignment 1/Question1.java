import java.util.*;

class Question1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int total = arr.length;
        int max = arr[tot - 1];
        int[] tot_array = new int[max];

        for (int i = 0; i < total; i++) {
            tot_array[arr[i] - 1] = 1;
        }

        for (int j = 0; j < max; j++) {
            if (tot_array[j] == 0) {
                System.out.print((j + 1) + " ");
            }
        }
    }
}
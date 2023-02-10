import java.util.*;

class Question2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < N; i++) {
            hm.put(arr[i], i);
        }
        for (Map.Entry m : hm.entrySet()) {
            System.out.print(m.getKey() + " ");
        }
    }
}
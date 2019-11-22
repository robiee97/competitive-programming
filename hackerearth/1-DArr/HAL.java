import java.io.BufferedReader;
import java.io.InputStreamReader;

class HAL {
    public static void main(String args[]) throws Exception {
        /*
         * 6 
         * 16 17 4 3 5 2
         * 17 5 2
         */
        halProb();
    }

    public static void halProb() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] sa = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sa[i]);
        }
        for (int i = 0; i < n - 1; i++) {
            int c = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] >= arr[j]) {
                    c++;
                } else {
                    break;
                }
            }
            if (c == (n - i - 1)) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(arr[n - 1]);

    }

}

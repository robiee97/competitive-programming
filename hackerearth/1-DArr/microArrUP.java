import java.io.BufferedReader;
import java.io.InputStreamReader;

class microArrUP {
    public static void main(String args[]) throws Exception {
        /*
         * 2
         * 3 4
         * 1 2 5 
         * 3 2 
         * 2 5 5
         */
        microProb();
    }

    public static void microProb() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            String[] sar = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(sar[i]);
            }
            int minValue = Integer.MAX_VALUE;
            for (int val : arr) {
                if (val < minValue) {
                    minValue = val;
                }
            }
            if (minValue >= k) {
                System.out.println("0");
            } else {
                System.out.println(k - minValue);
            }
        }
    }
}

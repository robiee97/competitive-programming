import java.io.BufferedReader;
import java.io.InputStreamReader;

class monknWel {
    public static void main(String args[]) throws Exception {
        // input :5
        // 1 2 3 4 5
        // 4 5 3 2 10
        monknWelProb();
    }

    public static void monknWelProb() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];
        int[] out = new int[n];
        String[] is1 = br.readLine().split(" ");
        for (int i = 0; i < is1.length; i++) {
            a[i] = Integer.parseInt(is1[i]);
        }
        String[] is2 = br.readLine().split(" ");
        for (int i = 0; i < is2.length; i++) {
            b[i] = Integer.parseInt(is2[i]);
        }
        for (int i = 0; i < out.length; i++) {
            out[i] = a[i] + b[i];
        }
        for (int val : out) {
            System.out.print(val + " ");
        }
    }
}

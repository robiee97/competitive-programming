import java.io.BufferedReader;
import java.io.InputStreamReader;

class binaryQueries {
    public static void main(String args[]) throws Exception {
        /*
         * 5 2 
         * 1 0 1 1 0 
         * 1 2 
         * 0 1 4
         */
        bQprob();
    }

    public static void bQprob() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int q = Integer.parseInt(s[1]);
        String[] bs = br.readLine().split(" ");
        String cbs = "";
        for (String val : bs) {
            cbs += val;
        }
        int bno = Integer.parseInt(cbs, 2);
        String obs = "";
        while (q-- > 0) {
            String[] query = br.readLine().split(" ");
            if (query[0].equals("1")) {
                // 1X
                int flipIndex = Integer.parseInt(query[1]);
                if (flipIndex >= 1 && flipIndex <= n) {
                    flipIndex = n - flipIndex;
                    int mask = 1 << flipIndex;
                    bno = mask ^ bno;
                    obs = Integer.toBinaryString(bno);
                }
            } else if (query[0].equals("0")) {
                // 0LR
                int leftIndex = Integer.parseInt(query[1]);
                int rightIndex = Integer.parseInt(query[2]);
                String nbs = obs.substring(leftIndex - 1, rightIndex - 1);
                int obiNo = Integer.parseInt(nbs, 2);
                System.out.println(obiNo % 2 == 0 ? "EVEN" : "ODD");
            }
        }
    }
}

import java.io.*;
import java.util.*;

public class CandidateCode {
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            long[] TG = new long[n];
            long[] TA = new long[n];
            for (int i = 0; i < n; i++) {
                TG[i] = s.nextLong();
            }
            for (int i = 0; i < n; i++) {
                TA[i] = s.nextLong();
            }
            long c = 0;
            int a = 0;
            while (a < n) {
                if (a + 1 == n) {
                    if (TG[a] > TA[a]) {
                        c++;
                        break;
                    } else {
                        break;
                    }
                }

                long TAEle = TA[a];
                int ngeI = nextGrtrEle(TG, TAEle, a);
                if (ngeI != -1) {
                    long temp = TG[ngeI];
                    TG[ngeI] = TG[a];
                    TG[a] = temp;
                    c++;
                    a++;
                } else {
                    if (TG[a] > TA[a]) {
                        c++;
                        a++;
                    } else {
                        a++;
                    }
                }
            }
            System.out.println(c);
        }
    }

    public static class pp implements Comparable<pp> {
        long v;
        int in;

        public pp(long v, int in) {
            this.v = v;
            this.in = in;
        }

        @Override
        public int compareTo(pp o) {
            return (int) (this.v - o.v);
        }
    }

    public static int nextGrtrEle(long[] TG, long TAele, int a) {
        PriorityQueue<pp> pq = new PriorityQueue<>();
        for (int i = a + 1; i < TG.length; i++) {
            if (TG[i] > TAele) {
                pq.add(new pp(TG[i], i));
            }
        }
        if (pq.size() != 0) {
            return pq.peek().in;
        }
        return -1;
    }
}

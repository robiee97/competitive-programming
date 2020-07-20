import java.util.*;
public class divProb {

    public static void main(String[] args) throws Exception {
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int a=s.nextInt();
            int b=s.nextInt();
            int ans=a%b==0?0:b-(a%b);
            System.out.println(ans);
        }
        s.close();
    }
}

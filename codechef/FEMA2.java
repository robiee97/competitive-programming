import java.util.*;
public class FEMA2{
    public static void main(String[] args) {
      
        Scanner s= new Scanner(System.in);
        int T=s.nextInt();
        while(T-->0){
            int N=s.nextInt();
            int K=s.nextInt();
            String str=s.next();
            int Magcount=0;
            boolean[] vis= new boolean[N];
            ArrayList<Integer> magLoc= new ArrayList<>();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='M'){
                    magLoc.add(i);
                }
            }
            for(int i:magLoc){
                
            }
            System.out.println(Magcount);
        }
    }
}
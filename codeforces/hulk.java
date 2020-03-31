import java.util.*;

public class hulk {

    public static void main(String[] args) throws Exception {

        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        String one="I hate it";
        String two="I love it";
        if(t==1){
            System.out.println(one);
        }else if(t==2){
            one=one.substring(0,one.length()-3)+" that "+two;
            System.out.println(one);
        }else{
            String str=one.substring(0,one.length()-3)+" that "+two;
            for(int i=3;i<=t;i++){
                if(i%2==0){
                    str=str.substring(0,str.length()-3)+" that "+two;
                }else{
                    str=str.substring(0,str.length()-3)+" that "+one;
                }
            }
            System.out.println(str);
        }
        s.close();
    }
}
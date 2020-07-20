import java.util.*;
public class kfib{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        if(n<k){
            for(int i=0;i<n;i++){
                System.out.print(1+" ");
            }
        }else{
            int[] arr = new int[n];
            for(int i=0;i<k;i++){
                arr[i]=1;
            }
            for(int i=k;i<n;i++){
                for(int j=i;j>=i-k;j--){
                    arr[i]+=arr[j];
                }
            }
            for(int o:arr){
                System.out.print(o+" ");
            }
        } 
    }
}











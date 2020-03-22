import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class taxi {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int counter=0;
        String [] arr= br.readLine().split(" ");
        Integer[] ele=new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            ele[i]=Integer.parseInt(arr[i]);
        }
        List<Integer> al=Arrays.asList(ele); 
        Collections.sort(al);
        int sum=0;
        boolean[] isv= new boolean[arr.length];
        for(int i=al.size()-1;i>=0;i--){
            int e=al.get(i);
            if(e==4){
                counter++;
                isv[i]=true;
            }else if(e<4){
                sum+=e;
            }
        }

        System.out.println(al);
    }
}
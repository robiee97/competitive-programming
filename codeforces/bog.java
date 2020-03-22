import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class bog {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        HashSet<Character> set= new HashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        if(set.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
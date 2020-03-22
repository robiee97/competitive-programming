import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class caps {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        if (Character.isLowerCase(word.charAt(0))) {
            if (word.substring(1).matches("^[A-Z]$")) {
                System.out.println((char)(word.charAt(0)-32)+word.substring(1).toLowerCase());
            }else{
                System.out.println(word);
            }
        } else if (Character.isUpperCase(word.charAt(0))) {
            if(word.substring(1).matches("([A-Z])")){
                System.out.println(word.toLowerCase());
            }else{
                System.out.println(word);
            }
        }
    }
}
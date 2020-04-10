import java.util.*;

public class maxOccurence {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str= s.nextLine();
        int max=0;
        TreeMap<Character,Integer> map= new TreeMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
                if(map.get(str.charAt(i))>max){
                    max=map.get(str.charAt(i));
                }
            }else{
                map.put(str.charAt(i), 1);
                if(map.get(str.charAt(i))>max){
                    max=map.get(str.charAt(i));
                }
            }
        }

        for(Character c: map.keySet()){
            if(map.get(c)==max){
                System.out.println(c+" "+max);
                break;
            }
        }
    }
}
import java.util.*;
public class bobnstr{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            String one=s.next();
            String two=s.next();
            int count=0;
            HashMap<Character,Integer> map= new HashMap<>();
            for(int i=0;i<one.length();i++){
                if(map.containsKey(one.charAt(i))){
                    map.put(one.charAt(i), map.get(one.charAt(i))+1);
                }else{
                    map.put(one.charAt(i),1);
                }
            }
            for(int i=0;i<two.length();i++){
                if(map.containsKey(two.charAt(i))){
                    map.put(two.charAt(i), map.get(two.charAt(i))-1);
                }else{
                    map.put(two.charAt(i),1);
                }
            }
            for(Character c: map.keySet()){
                if(map.get(c)!=0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
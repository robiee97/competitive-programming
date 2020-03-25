import java.util.*;

public class Lc13{
    
    public int romanToInt(String s) {
        int ans=0;
        int st=s.length()-1;
        int en=st-3;
        int pow=-1;
        while(en>0){
            String sbstr=s.substring(en, st + 1);
            int digit=findRoman(sbstr,pow++,st,en);
            ans+=(int)(digit*Math.pow(10, pow));
        }
        return ans;
    }

    public static int findRoman(String s,int pow,int st,int en){
        ArrayList<String> subseq=new ArrayList<>();
        int max=0;
        for(int i=0;i<s.length();i++){
            subseq.add(s.substring(i,s.length()));
        }
        for(String str:subseq){
            if(isvalid(str,pow)){
                if(str.length()>max){
                    max=str.length();
                }
            }
        }
        return numberToRoman(s,max);
    }

    public static int numberToRoman(String s,int digits){
        s=s.substring(s.length()-digits,digits);
        
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));    
        System.out.println(romanToInt("LVIII"));    
        System.out.println(romanToInt("IV"));    
        System.out.println(romanToInt("IX"));    
    }
    
}
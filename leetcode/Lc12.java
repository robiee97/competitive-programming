import java.util.*;
public class Lc12{
    public static String intToRoman(int num) {
        LinkedList<String> lis= new LinkedList<>();
        String str="";
        int t=0;
        while(num>0){
            int dig=num%10;
            String ans=findRoman((int) (dig*Math.pow(10, t)));
            lis.addFirst(ans);
            t++;
            num/=10;
        }
        for(String s:lis){
            str+=s;
        }
        return str;
    }

    public static String findRoman(int digit){
        String str="";
        if(digit==2000){
            str+="MM";
        }
        if(digit==3000){
            str+="MMM";
        }
        if(digit==1000){
            str+="M";
        }
        if(digit==900){
            str+="CM";
        }
        if(digit==800){
            str+="DCCC";
        }
        if(digit==700){
            str+="DCC";
        }
        if(digit==600){
            str+="DC";
        }
        if(digit==500){
            str+="D";
        }
        if(digit==400){
            str+="CD";
        }
        if(digit==300){
            str+="CCC";
        }
        if(digit==200){
            str+="CC";
        }
        if(digit==100){
            str+="C";
        }

        if(digit==90){
            str+="XC";
        }
        if(digit==80){
            str+="LXXX";
        }
        if(digit==70){
            str+="LXX";
        }
        if(digit==60){
            str+="LX";
        }
        if(digit==50){
            str+="L";
        }
        if(digit==40){
            str+="XL";
        }
        if(digit==30){
            str+="XXX";
        }
        if(digit==20){
            str+="XX";
        }

        if(digit==10){
            str+="X";
        }
        if(digit==9){
            str+="IX";
        }
        if(digit==8){
            str+="VIII";
        }
        if(digit==7){
            str+="VII";
        }
        if(digit==6){
            str+="VI";
        }
        if(digit==5){
            str+="V";
        }
        if(digit==4){
            str+="IV";
        }
        if(digit==3){
            str+="III";
        }
        if(digit==2){
            str+="II";
        }
        if(digit==1){
            str+="I";
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
        System.out.println(intToRoman(58)); 
        System.out.println(intToRoman(9));
        System.out.println(intToRoman(4));
    }
}
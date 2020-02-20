import java.util.*;

public class helpfulMaths{
   	public static void main(String[] args){
	String s="1+2+2+1+2+1+1+1+2+1";
		int i=0;
		int j=0;
		while(i<s.length()){
			if(s.charAt(i)=='+'){
				continue;
			}
			else if(s.charAt(i)=='1'){
				swap(s,i,j);
				i++;
				j++;
			}
			else if(s.charAt(i)=='2'){
				i++;
			}
		}
		for(char a:s){
			System.out.print(a);
		}
	}
	public static void swap(String s,int i,int j){
		char temp=s.charAt(i);
		s.charAt(i)=s.charAt(j);
		s.charAt(j)=temp;
	}

}
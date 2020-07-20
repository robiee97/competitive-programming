import java.util.*;
public class Solutions {
    public static void main(String[] args) {
        // int[] l={1,3,1,4};
        // int[] l={1,3,1,4,5,9};
        // int[] l = { 1, 1, 1, 1, 1 };
        // System.out.println(solution(l));
        // avc();
    }

public static void avc(){
    
    Scanner s= new Scanner(System.in);
    int n=s.nextInt();
    int[] q= new int[n];
    for(int i=0;i<n;i++){
        q[i]=s.nextInt();
    }
    int[] t= new int[n];
    for(int i=0;i<n;i++){
        t[i]=s.nextInt();
    }
    long counter=0;
    boolean f=true;
        while(true){
            for(int i=0;i<n;i++){
                if(t[i]-q[i]<0){
                    f=false;
                    counter-=i;
                    break;
                }else{
                    t[i]-=q[i];
                    counter++;
                }
            }
            if(!f){
                break;
            }
        }
        System.out.println(counter/n);
    }


    public static int[] rem(int[] sortarr, int i) {
        int[] narr = new int[sortarr.length - 1];
        for (int j = 0; j < i; j++) {
            narr[j] = sortarr[j];
        }
        for (int j = i; j < narr.length; j++) {
            narr[j] = sortarr[j + 1];
        }
        return narr;
    }

    // quick sort sorting
    public static int part(int[] arr, int lo, int hi) {
        int pivot = arr[hi];

        int i = 0;
        int j = 0;

        while (i <= hi) {
            if (arr[i] > pivot) {
                i++;
            } else if (arr[i] <= pivot) {
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                i++;
                j++;
            }
        }
        return j - 1;
    }

    public static void quickSort(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int pidx = part(arr, lo, hi);
        quickSort(arr, lo, pidx - 1);
        quickSort(arr, pidx + 1, hi);
    }

    public static int[] s(int[] l) {
        int[] sortarr = new int[l.length];
        quickSort(l, 0, l.length-1);
        for (int i = 0; i < sortarr.length; i++) {
            sortarr[i]=l[i];
        }
        return sortarr;
    }

    public static int[] rs(int[] l) {
        int revsortarr[] = new int[l.length];
        int[] sortarr = s(l);
        for (int i = 0, j = l.length - 1; i < l.length && j >= 0; i++, j--) {
            revsortarr[j] = sortarr[i];
        }
        return revsortarr;
    }

    public static int createNo(int[] l) {
        int[] revsortarr = rs(l);
        int n = 0;
        for (int i = 0; i < revsortarr.length; i++) {
            n += revsortarr[i] * Math.pow(10, revsortarr.length - i - 1);
        }
        return n;
    }

    public static int solution(int[] l) {
        int sum = 0;
        for (int i : l) {
            sum += i;
        }
        if (sum % 3 == 0) {
            return createNo(l);
        } else {
            int[] sortarr = s(l);
            int total=0;
            for (int i = 0; i < sortarr.length-1; i++) {
                for (int j = i; j < sortarr.length; j++) {
                    if((sum-(total+sortarr[j]))%3==0){
                        if(i==0){
                            int[] narr=rem(sortarr, j);
                            return createNo(narr);
                        }else{
                        int[] narr=rem(sortarr, j);
                        int[] ans=new int[narr.length-i];
                        for(int k=i;k<=ans.length;k++){
                            ans[k-i]=narr[k];
                        }
                        return createNo(ans);
                        }
                    }
                }
                total+=sortarr[i];
            }
        }
        return 0;
    }
}
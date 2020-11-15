import java.util.*;
public class ADADISH{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            int time=0;
            if(arr.length==1){
                System.out.println(arr[0]);
            }else if(arr.length==2){
                System.out.println(arr[0]>=arr[1]?arr[0]:arr[1]);
            }else {
                PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
                for(int i:arr){
                    pq.add(i);
                }
                while(pq.size()>2){
                    int a=pq.poll();
                    int b=pq.poll();
                    time+=b;
                    pq.add(a-b);
                }
                time+=Math.max(pq.poll(), pq.poll());
                System.out.println(time);
            }
        }
        s.close();
    }
}
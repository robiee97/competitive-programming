import java.util.*;

public class eskoSdeQ {

    public static class Edge {
        String nbr;
        int cost;

        public Edge(String nbr, int cost) {
            this.nbr = nbr;
            this.cost = cost;
        }
    }

    public static class Route implements Comparable<Route> {
        String routes;
        int cost;

        public Route(String routes, int cost) {
            this.routes = routes;
            this.cost = cost;
        }

        public Route() {
        }

        @Override
        public int compareTo(Route o) {
            return this.cost - o.cost;
        }
    }

    static HashMap<String, ArrayList<Edge>> g = new HashMap<>();
    static ArrayList<Route> ans = new ArrayList<>();

    public static void trains(String st, String des,String psf,int csf) {
        if (st.equals(des)) {
            // ans.add(new Route(psf, csf));
            // psf="";
            // csf=0;
            System.out.println(psf+" "+csf);
            return;
        }
        psf+=st;
        for(Edge e: g.get(st)){
            psf+=" "+e.nbr;
            trains(e.nbr, des, psf, csf+e.cost);
            psf=psf.substring(0,psf.length()-e.nbr.length());
        }
    }

    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        String[] journey = s.nextLine().split(" ");
        String st = journey[0];
        String des = journey[1];

        while (s.hasNext()) {
            String[] data = s.nextLine().split(" ");
            if (g.containsKey(data[0])) {
                ArrayList<Edge> lis = g.get(data[0]);
                lis.add(new Edge(data[1], Integer.parseInt(data[2])));
                g.put(data[0], lis);
            } else {
                ArrayList<Edge> lis = new ArrayList<>();
                lis.add(new Edge(data[1], Integer.parseInt(data[2])));
                g.put(data[0], lis);
            }
        }
        trains(st, des,"",0);

        // for (Route r : ans) {
        //     System.out.println(r.routes + " " + r.cost);
        // }
    }
}

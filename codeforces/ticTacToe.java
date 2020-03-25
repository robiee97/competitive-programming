import java.util.*;

public class ticTacToe {
    static ArrayList<Integer> plylist = new ArrayList<>();
    static ArrayList<Integer> cpulist = new ArrayList<>();

    public static void main(String[] args) {
        char[][] board = { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' },
                { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };
        printB(board);
        while (true) {
            System.out.println("enter place (1-9): ");
            Scanner s = new Scanner(System.in);
            int plyPos = s.nextInt();
            while (plylist.contains(plyPos) || cpulist.contains(plyPos)) {
                System.out.println("this is occupied try another one");
                plyPos = s.nextInt();
            }
            plylist.add(plyPos);
            placement(board, plyPos, "player");

            String ans = winning(board);
            if (ans.length() > 1) {
                System.out.println(ans);
                printB(board);
                break;
            }

            Random r = new Random();
            int cpuPos = r.nextInt(9) + 1;
            while (plylist.contains(cpuPos) || cpulist.contains(cpuPos)) {
                cpuPos = r.nextInt(9) + 1;
            }
            cpulist.add(cpuPos);
            placement(board, cpuPos, "cpu");
            printB(board);
        }
    }

    public static String winning(char[][] board) {
        List comb1 = Arrays.asList(1, 2, 3);
        List comb2 = Arrays.asList(4, 5, 6);
        List comb3 = Arrays.asList(7, 8, 9);
        List comb4 = Arrays.asList(1, 4, 7);
        List comb5 = Arrays.asList(2, 5, 8);
        List comb6 = Arrays.asList(3, 6, 9);
        List comb7 = Arrays.asList(1, 5, 9);
        List comb8 = Arrays.asList(3, 5, 7);

        List<List> l = new ArrayList<>();
        l.add(comb1);
        l.add(comb2);
        l.add(comb3);
        l.add(comb4);
        l.add(comb5);
        l.add(comb6);
        l.add(comb7);
        l.add(comb8);

        for (List lis : l) {
            if (plylist.containsAll(lis)) {
                return "YOU WON";
            } else if (cpulist.containsAll(lis)) {
                return "CPU WON";
            } else if (plylist.size() + cpulist.size() == 9) {
                return "TiE";
            }
        }
        return " ";
    }

    public static void placement(char[][] board, int pos, String user) {
        char sym = ' ';
        if (user.equals("player")) {
            sym = 'X';
        } else if (user.equals("cpu")) {
            sym = 'O';
        }
        switch (pos) {
            case 1:
                board[0][0] = sym;
                break;
            case 2:
                board[0][2] = sym;
                break;
            case 3:
                board[0][4] = sym;
                break;
            case 4:
                board[2][0] = sym;
                break;
            case 5:
                board[2][2] = sym;
                break;
            case 6:
                board[2][4] = sym;
                break;
            case 7:
                board[4][0] = sym;
                break;
            case 8:
                board[4][2] = sym;
                break;
            case 9:
                board[4][4] = sym;
                break;
            default:
                break;
        }

    }

    public static void printB(char[][] board) {
        for (char[] row : board) {
            for (char col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
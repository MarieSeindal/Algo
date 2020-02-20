import java.util.Scanner;


public class comboBreaker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        String input = sc.next();

        String[] moves = new String[length];

        System.out.println(moves[0]);
        System.out.println(moves[1]);
        System.out.println(moves[2]);


//        for (int i= 0; i<moves.length; i++)
//            System.out.println(moves[i]);
    }

    public boolean combo(String a){
        return true;
    }

    public char counter(char a){
        if (a == 'C')
            return 'M';
        else if (a=='L')
            return 'E';
        else if (a=='R')
            return 'C';
        else
            return 'S';

    }






}

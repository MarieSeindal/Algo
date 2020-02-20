import java.util.Scanner;


public class comboBreaker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String length = sc.nextLine();
        String input = sc.nextLine();

        int len = Integer.parseInt(length);
        System.out.println(len);

        String[] moves = new String[3];

//        System.out.println(length);
//        System.out.println(input);

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

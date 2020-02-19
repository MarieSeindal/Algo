import java.util.Scanner;

public class comboBreaker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        String input = sc.next();

        char[] moves = new char[length];

        input.getChars(0, input.length(), moves,0); // (Start element i string, slut index i string. hvilket array, hvor i arrayet)

        for (int i= 0; i<moves.length; i++)
            System.out.println(moves[i]);

//        for (int i=0; i<input.length(); i++){
//            int counter =0;
//            if (input.charAt(i) != 32) {
//                moves[counter] = input.charAt(i);
//                counter++;
//                System.out.println(moves[counter]);
//            }
//
//        }

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

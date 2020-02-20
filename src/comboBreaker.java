import java.sql.SQLOutput;
import java.util.Scanner;


public class comboBreaker {

    public static void main(String[] args) {

// Tag input og omform det til et array.
        Scanner sc = new Scanner(System.in);

        String length = sc.nextLine();
        String input = sc.nextLine();

        int len = Integer.parseInt(length);

        char[] moves = new char[len];

        input = input.replaceAll("\\s", "");

        for (int i = 0; i < input.length(); i++) {
            moves[i] = input.charAt(i);
            System.out.println(moves[i]);
        }
// Logikken
        for (int i=0; i<len; i++)
        if (combo(moves,i))
            System.out.print("F");
        else System.out.print(counter(moves[i]));

    }

    public static boolean combo(char[] moves, int index){

        for (int k=0 ; k<4; k++) { // finder ens bogstaver
            if (moves[index] == moves[index+1]) // tjekker 1 med 2, 2 med 3 og 3 med 4.
                return false;

            else if (moves[index] == moves[index+2] && index < 2) // Tjekker 1 me 3 og 2 med 4
                return false;

            else if (moves[index] == moves[index+3] && index == 0) // tjekker 1 med 4
                return false;

            else
                index++;
        }

        return true;
    }

    public static char counter(char a){
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

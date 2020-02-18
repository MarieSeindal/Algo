import java.util.Scanner;

public class comboBreaker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        String input = sc.next();

        char[] moves = new char[length];

        for (int i=0; i<length; i++){
            int counter =0;
//            if (input.charAt(i)==' ')
//                i++;
            moves[counter]=input.charAt(i);
            counter++;
            System.out.println(input.charAt(i));
        }

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

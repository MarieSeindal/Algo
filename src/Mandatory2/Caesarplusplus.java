package Mandatory2;

import java.io.*;
import java.util.*;

public class Caesarplusplus {

    public static void main(String[] args) {

// input til output
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<Character>();

        // tager den første integer og læser den
        String length = sc.nextLine();
        int len = Integer.parseInt(length);

        // tager resten og læser det
        String input = sc.nextLine();


        input = input.replaceAll("\\s", "");

        // Pushing every character of the string into the stack, maybe not needed :3
        char[] ch = input.toCharArray();
//        for (int i = 0; i < input.length(); i++) {
//            stack.push(ch[i]);
//        }

        //Creating a alphabet array
//        char[] alpha = new char[26];
//        for(int j = 0; j < 26; j++){
//            alpha[j] = (char)(65 + j);
//        }


        // genere stacken
        int temp = 0;
        int tot = 0;

        for (int i=0; i<len; i++){
            if (Character.isLetter(ch[i])) {
                if (Character.isDigit(ch[i-1])){
                    tot = tot + temp;
                    temp = 0;
                }
            } else if (Character.isDigit(ch[i])) {
                temp = temp * 10 + ch[i];
                // if previous char was an int multiply previous int by 10 and add current int
            } else { // pop  (^)


                char pop = stack.pop(); // todo
                System.out.println("Pop: " +  pop); //todo


                continue;
            }

//            stack.push(ch[i]);

            if (ch[i])

        }

    }
    // metode for at printe stacken // todo
    public static void stackPrint (Stack<Character>) {
        for (int p = 0 ; p < ; p++) {

        }
    }


}

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

        // genere stacken
        for (int i=0; i<len; i++){
            if (input.charAt(i) == 94) {
                char pop = stack.pop(); // todo
                System.out.println("Pop: " +  pop); //todo
                continue;
            }

            stack.push(input.charAt(i));

            if (input.charAt())


        }

        // metode for at printe stacken // todo










    }


}

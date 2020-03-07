package Mandatory2;

import java.io.*;
import java.util.*;

public class Caesarplusplus {

    public static void main(String[] args) {

// input til output
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        // tager den første integer og læser den
        String length = sc.nextLine();
        int len = Integer.parseInt(length);

        // tager resten og læser det
        String input = sc.nextLine();
        String[] split = input.split("\\s");

        //input = input.replaceAll("\\s", "");

        // Pushing every character of the string into the stack, maybe not needed :3
//        char[] ch = input.toCharArray(); todo
        for (int i = 0; i < split.length; i++) {
            stack.push(split[i]);
        }

        //Creating a alphabet array
//        char[] alpha = new char[26];
//        for(int j = 0; j < 26; j++){
//            alpha[j] = (char)(65 + j);
//        }


        // genere stacken
        for (int i=0; i<len; i++){

            boolean yesInt = true;
            int a;

            try {
//                a = Character.getNumericValue(input.charAt(i));
                a = Integer.parseInt(split[i]);
            }catch (Exception e){
                System.out.println("Not an int"); //todo
                yesInt = false;
            }

            if (input.charAt(i) == 94) { //Tjekker for pop  (^)

                if (yesInt == true){
                    System.out.println("Move numbers: " + a); //todo
                }

                char pop = stack.pop(); // todo
                System.out.println("Pop: " +  pop); //todo

                continue;
            }

            stack.push(input.charAt(i));

            if (input.charAt(i))

        }

    }
    // metode for at printe stacken // todo
    public static void stackPrint (Stack<Character>) {
        for (int p = 0 ; p < ; p++) {

        }
    }


}

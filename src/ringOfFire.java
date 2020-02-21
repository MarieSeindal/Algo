import java.util.Scanner;

public class ringOfFire {
    public static void main(String[] args) {

        //input = int N,C,K // K= slut antal elever, N = students, C = eliminationNr

        Scanner sc = new Scanner(System.in);
        int n,c,k;

        n = sc.nextInt(); // Total student
        c = sc.nextInt(); // Kill count
        k = sc.nextInt(); // Number of survivors

        //Lav array af integers, aka elever
        boolean[] students = new boolean[n];
        for (int i=0; i<n; i++ ) {
            students[i] = true;
//            System.out.println(students[i]);
        }

        dead(c,n,k,students);
        for (int i=0; i<n; i++ ) {
            System.out.println(students[i]);
        }

    }
    public static void dead(int c, int n, int k, boolean[] students){ //Ændre de elever i arrayet, som er døde

        int count = c;
        int alive = n;

        for (int i=0; alive<=k ; i++) { //loop through total student array

            // Vi har en tæller, som tæller ned

            if (i == students.length-1){ //if total student counting
                i = 0;
                System.out.println("Ring reset");
            }

            if (!students[i]) { //If student is dead, skip him in counting.
                continue;

            } else if (count == 1) {// if student dies, kill him, count reset, alive down.
                students[i] = false;
                count = c;
                alive--;
                System.out.println("Die " + i);
                continue;

            }

            count--;
        }

    }

}

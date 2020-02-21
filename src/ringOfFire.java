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

    }
    public static void dead(int c, int n, int k, boolean[] students){ //Ændre de elever i arrayet, som er døde

        int count = c;


        for (int i=0; i<n-k; i++) { //loop gennem total student array

            // Vi har en tæller, som tæller ned

            if (i == students.length-1){ //Hvis tællingen går ud over arrayets kant
                i = 0;

            }

            if (!students[i]) {
                continue;


            } else if (count == 1) {
                students[i] = false;
                count = c;

            }

            count--;
        }


        
    }


}

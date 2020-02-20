import java.util.Scanner;

public class ringOfFire {
    public static void main(String[] args) {

        //input = int N,C,K // K= slut antal elever, N = students, C = eliminationNr

        Scanner sc = new Scanner(System.in);
        int n,c,k;

        n = sc.nextInt();
        c = sc.nextInt();
        k = sc.nextInt();

        //Lav array af integers, aka elever
        int[] elever = new int[n];
        for (int i=0; i<n; i++ ) {
            elever[i] = i+1;
            System.out.println(elever[i]);
        }

    }
    public static int dead(int c, int n, int k, int[] elever){
        int counter = c;
        for (int i=0; i<n-k; i++) {
            if (elever.length < c){

            }else{

            }
            counter++;
        }



        return 0;

    }


}

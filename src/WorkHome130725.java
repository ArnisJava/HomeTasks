import java.util.Scanner;
public class WorkHome130725 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("введите число n ");
        n = in.nextInt();
        for ( int i =0; i<=n; i++){
            if (( i %5 == 0)&&( i %3 ==0))
                System.out.println( i );

        }
    }

}


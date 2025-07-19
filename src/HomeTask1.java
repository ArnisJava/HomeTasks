 import java.util.Scanner;

   public class HomeTask1 {
       public static void main(String[] args) {
           /*Scanner scanner = new Scanner(System.in);
           // Ввод числа N
           int n;
           int sum = 0;
           System.out.println("Input number n: ");
           n = scanner.nextInt();
           for( int i = 1; i<=n; i++) {
               sum += i;
           }
           System.out.println( sum);*/
           /*Scanner in = new Scanner(System.in);
           int n;
           n = in.nextInt();
           for (int i = 1; i < n; i++) {
               if (n % i == 0) {
                   System.out.println(i + " ");
               }
           }*/
           /*Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int count = 0;
           for( int i = 0; i<n; i++){
               int x = in.nextInt();
               if(x % 2 == 0 ) {
                   count++;
               }
           }
           System.out.println( count);*/
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           long sum = 0;
           for ( int i = 0; i < n; i++){
               int m = in.nextInt();
               sum += m;
           }
           System.out.println( "Сумма эл-тов равна " + sum  );
       }
   }

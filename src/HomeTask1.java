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
           /*Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           long sum = 0;
           for ( int i = 0; i < n; i++){
               int m = in.nextInt();
               sum += m;
           }
           System.out.println( "Сумма эл-тов равна " + sum  );*/
           /*int product = 0;
           for( int i = 1; i<=10; i++){
             for( int j = 1; j<=10; j++) {
                  product = i * j;
                 System.out.printf("%4d", product);

             }
               System.out.println();

             }*/
           /*Scanner in = new Scanner( System.in);
           System.out.println(" Введите кол-во элементов массива:  ");
            int n = in.nextInt();
           int[] nums = new int[n];
           int sum = 0;
           System.out.println("Введите "+ n + " целых чисел: ");
            for( int i = 0; i < n; i++){
                nums[i] = in.nextInt();
                sum += nums[i];
            }
           System.out.println("Сумма всех элементов массива равна " + sum);*/
           /*Scanner in = new Scanner(System.in);
           System.out.println("Введите целое число: ");
           int n = in.nextInt();
           int sumEven = 0;
           int sumOdd = 0;

           for( int i = 0; i<=n; i++ ){
               if( i %2 == 0){
                   sumEven += i;
               }
               else{
                   sumOdd += i;
               }

           }
           System.out.println("Сумма чётных чисел равна: " + sumEven + " Сумма нечётных чисел равна: "  + sumOdd);*/

           Scanner in = new Scanner(System.in);
           System.out.println("Ведите целое число ");
           int n = in.nextInt();
           int prev = 1;
           boolean hasEven = false;
           for( int i =2; i<=n; i+=2){
               prev *= i;
               hasEven = true;

           }
           System.out.println(hasEven ? prev:0);



           



       }
   }

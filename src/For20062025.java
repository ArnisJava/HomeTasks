import java.util.Scanner;

public class For20062025
{
    public static void main(String args[])
    {
        /*for (int i = 1; i < 9; i++){

            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
        }*/
        /*Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Input number n");
        n = in.nextInt();
        for(int i = 1; i<= n; i++){
            System.out.println( i );
        }*/
        /*Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Input number n");
        n = in.nextInt();
        for(int i = 1; i<=n; i++ ){
            if (i%2 == 0){
                System.out.println( i );
            }*/
        /*Scanner in = new Scanner(System.in);
        int n;
        System.out.println( "Input number n");
        n = in.nextInt();
        for(int i =1; i <= n; i++){
            if (i >=10){
                System.out.println( i );
            }

        }*/
        /*Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Input number n");
        n = in.nextInt();
        for(int i = 1; i<= n; i++ ){
            if(( i%5 == 0)&&( i%3 == 0))
                System.out.println( i );
        }*/
        /*Scanner in = new Scanner(System.in);
        int n;
        int s = 0;
        System.out.println("Input number n");*/
        /*Scanner in = new Scanner(System.in);
        int n;
        int s = 0;
        System.out.println("Inpout number n");
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            s = s + i;
        }
        System.out.println( s );*/
        /*Scanner in = new Scanner(System.in);
        int n;
        int f = 1;
        System.out.println("Input number n");
        n = in.nextInt();
        for( int i  = 1; i <= n; i++){
        f = f * i;
        }
        System.out.println( f );*/
        /*Scanner in = new Scanner(System.in);
        int n;
        int f = 1;
        System.out.println( "Input number n" );
        n = in.nextInt();
        if (n == 0)
            f = 1;
        else
            for( int t = 1; t <= n; t++)
                f =2*f;
        System.out.println( f );*/
        /*Scanner in = new Scanner(System.in);
        int f;
        int n;
        int p = 1;

        System.out.println("Input number f");
        f = in.nextInt();
        System.out.println( "Input number n" );
        n = in.nextInt();
        if (n == 0)
            f = 1;
        else
            for( int t = 1; t <= n; t++ )
                p = p*f;
        System.out.println( p );*/
        /*Scanner in = new Scanner(System.in);
        int n;
        int k = 0;
        System.out.println(" Input number n");
        n = in.nextInt();
        for( int i =0; i <=n; i++)
            if(i%2==0)
            {
                k = k+1;
                System.out.println( k +" " +i );}
        System.out.println( k );*/
        /*Scanner in = new Scanner(System.in);
        int n,number,sum1=0,sum2=0,count1=0,count2=0; //Объявление и инициаллизация переменных//
        System.out.println(" Введите кол-во чисел:  ");
        n = in.nextInt();
        for( int i = 1; i <=n; i++) { // int =1 т.к. нумерация чисел начинается с 1//
            System.out.println(" Число номер: " + i);// Выводится порядковый номер числа//
            number = in.nextInt();
            if (number > 0) {
                sum1 = sum1 + number; // сумма чисел введённых пользователем//
                count1 = count1 + 1; // кол-во положительных чисел//
            }
            else {
                sum2 = sum2 + number;
                count2 = count2 + 1;
            }
        }
        System.out.println("Сумма положительных чисел ровна: "+ sum1);
        System.out.println("Сумма отрицательных чисел ровна: " + sum2);
        System.out.println("Кол-во  положительных чисел равно: "+ count1);
        System.out.println("Кол-во  положительных чисел равно: "+ count2);
    }*/
        /*Scanner in = new Scanner(System.in);
        int n, number,sum1 = 0,sum2 = 0,count1 = 0,count2 = 0;
         System.out.println(" Введите с клавиатуры число n");
         n = in.nextInt();
         for( int i = 1; i<=n; i++) {
             System.out.println(" Число номер: " + i + ": ");
             number = in.nextInt();
             if( number%2 == 0  ) {
                 sum1 += number;
                 count1 += 1;
             }
             else {
                 sum2 += number;
                 count2 += 1;
             }
         }
         System.out.println("Сумма чётных чисел ровна: " + sum1);
         System.out.println("Сумма нечётных чисел ровна: " + sum2);
         System.out.println("Кол-во чётных чисел равно: " + count1);
         System.out.println(" Кол-во нечётных чисел равно: " + count2);*/
        /*Scanner in = new Scanner(System.in);
        int n;
        char m;
        System.out.println("Введите с клавиатуры число n ");
        n = in.nextInt();
        System.out.println("введите с клавиатуры символ m ");
        m = in.next().charAt(0);
        for(int i = 1; i<=n; i++)
            System.out.println( m );*/
        /*Scanner in = new Scanner(System. in);
        int n;
        System.out.println("введите с клавиатуры число n");
        n = in.nextInt();
        for( int i = 1; i<=n; i++)
            if( i %2==0)
                System.out.print( "*" );
        else {
                System.out.print("-");
            }*/
       /* Scanner in = new Scanner(System.in);
        int n;
        int a;
        int sum1 = 0;
        int sum2 =0;
        int count1 = 0;
        int count2 = 0;
        System.out.println("Введите число n");
        n = in.nextInt();
        for( int i = 0; i<n; i++ ){
            System.out.println("Введите число с клавиатуры");
            a = in.nextInt();
            if( a > 0 ) {
                sum1 += a;
                count1 +=1;
            }
            else {
                sum2 += a;
                count2 +=1;
            }
        }
        System.out.println("Сумма пол-х чисел равна" + sum1);
        System.out.println(" Кол-во положительных чисел" + count1);
        System.out.println(" Сумма отр-х чисел равна" + sum2);
        System.out.println(" Кол-во отрицательных чисел" + count2);*/
        /*Scanner in = new Scanner( System.in);
        int n;
        System.out.println(" Введите число с клавиатуры");
        n = in.nextInt();
        int[] a = new int[n];
        System.out.println(" Вывести число n= " + n);

        for( int i = 0; i < n; i++){
            System.out.println("Введите число");
            a[i] = in.nextInt();
        }

        System.out.println("Вывод массива: ");
        for(int i = 0; i < n; i++){
            System.out.println( a[i]);
        }

        int max = a[0];
        int min = a[0];
        for( int i = 1; i < n; i++ ){
            if( a[i] > max){
                max = a[i];
            }
            if( a[i] < min){
                min = a[i];
            }
        }
        System.out.println(" Максимальный эл-т: " + max);
        System.out.println("Мининимальный эл-т " + min);*/
        /*int n,a =0,max = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число n ");
        n = in.nextInt();
        System.out.println("Введите числа ");
        for(int i = 0; i < n; i++)
        {
               a = in.nextInt();
               if( a > max)
               {
                   max = a;
               }
        }
        System.out.println("Максимальное число " + max);*/
        /* Ввести с  клавиатуры число n. Ввести n чисел. Вывести на экран среднее арифметическое этих чисел.*/
        /*int n,a = 0;
        float sum = 0;
        float avg = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число n ");
        n = in.nextInt();
        System.out.println("Введите числа ");
        for( int i = 0; i <n; i ++)
        {
            a = in.nextInt();
            sum = sum + a;
        }
        avg = sum/n;
        System.out.println( "Среднее арифметическое чисел равно " + avg);*/

        /*Scanner in = new Scanner(System.in);
        for( int i = 1; i<=10; i++ ) //i это номер текущей строки, сначала i = 1 и j меняется от 1 до 10-и.
        {
            for( int j = 1; j<=10; j++) // j это номер текущего столбца, он меняется от 1 до10 и
                                        // переходит на сл-ю строчку с изменением i
            {
                System.out.print(i * j + "\t "); // Произведение строки на столбец и t - это табуляция, расстояние 4 символа
                                                 // между значениями.
            }
        System.out.println(); // Перевод на следующую строку.
        }*/
        Scanner in = new Scanner( System.in);
        int n;
        System.out.println(" Введите число n ");
        n = in.nextInt();
        for( int i = 0; i< n; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print("*" + " ");
            System.out.println();
        }

    }
}


import java.util.Scanner;

public class homeTask2 {
    public static void main(String[] args) {
    /*{ Scanner in = new Scanner(System. in);
        System.out.println(" Введите два числа через пробел: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int min;
        int max;
        if( a < b){
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }
        int sum = 0;
        for( int i = min; i<= max; i++){
            if ( i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(" Сумма чётных чисел: " + sum);




    }*/
        /*Scanner in = new Scanner(System.in);
        System.out.println(" Введите с клавиатуры размер массива: ");
        int n = in.nextInt();
        int[] array = new int[n];
        System.out.println("Введите числа массива");
        for( int i = 0; i<n; i++){
            System.out.print("Введите элемент " +( i+1) + ":" );
            array[i] = in.nextInt();
        }
        System.out.println(" Массив в обратном порядке: ");
        for( int i = n-1; i>=0; i--){
            System.out.print(array[i]);
            if( i> 0 ){
                System.out.print(" ");

            }
        }*/
        /*Scanner in = new Scanner( System.in);
        System.out.println(" Введите число n: ");
        int n = in.nextInt();
        int sum = 0;
        for( int i = 0; i <=n; i++){
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + n + " = " + sum);*/
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите чмсло n");
        int n = in.nextInt();
        long product = 1;
        for (int i = 2; i <= n; i += 2) {
            product *= i;
        }
        if (n < 2)
            System.out.println(" Нет чётных чисел в диапазоне от 1 до" + n);
        else {
            System.out.println(" Произведение чётных чисел в диапазоне от 1 до" + n + "=" + product);}*/


        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for( int i = 1; i<=10; i++){
            System.out.println( n + "x" + i + "=" + (n*i));

        }*/
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        while(n > 0){ // Запускается цикл кот-й выполняется пока n>0 (т.е. пока условие - истина)
            int last = n % 10; // Вычисляем последнюю цифру числа и записываем в переменную last( операция - остаток от деления на 10)
            sum +=last; // sum = sum + last, добавляем в sum последнюю цифру числа.
            n = n/10; // Отбрасываем последнюю цифру, деля n на 10.( целочисленное деление на 10)
        }
        System.out.println(" Сумма цифр числа: " + sum);

    }



}


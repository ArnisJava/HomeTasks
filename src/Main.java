import java.util.Scanner; // Подключение библиотеки

public class Main {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int a = 10;
        int b = 4;
        boolean c = a == b;         // false
        boolean d = a == 10;       // true
        System.out.printf("result1 %b result2 %b" ,c,d);
        c = a != b;         // true
         d = a != 10;      // false
        System.out.printf("result1 %b result2 %b" ,c,d);
        in.close();
        int num1 = 4;
        int num2 = 6;
        if(num1>num2){
            System.out.println("Первое число больше второго");

        } else{
            System.out.println("Первое число меньше второго");

        }
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("Введите число");
        a = in.nextInt();
        if( a > 0) {
            System.out.println("Число а положительное");
        }
        else {
            System.out.println("Число а отрицательное");
        }
        Scanner in = new Scanner(System.in);
        int num1;
        System.out.println("Введите число");
        num1 = in.nextInt();
        if(num1 %2 == 0){
            System.out.println("число чётное");
        }
        else{
            System.out.println("Число нечётное");
        }
        Scanner in = new Scanner(System.in);
        int j;
        System.out.println("Введите число");
        j = in.nextInt();
        if(( j %3 == 0)&&( j%5 == 0)){
            System.out.println("Число кратно трём и пяти");
        }
        else{
            System.out.println("Число не является кратным 3 и 5");

        }*/

        /*Scanner in = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Введите два числа");
         num1 = in.nextInt();
         num2 = in.nextInt();
         if ((num1 * num2 > 10)||( num2 %5 ==0)){
             System.out.println("Число соответствует условию задачи");

         }
         else{
             System.out.println("Число не соответствует условию");

         }*/
        /*Scanner in = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Введите два числа");
        num1 = in.nextInt();
        num2 = in.nextInt();
        if((num1 - num2 > 0)&&( num2 != 0)){
            System.out.println("Число соответствует условию задачи");
        }
        else{
            System.out.println("Число условиям задачи не соответствует");
        }*/
        /*Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Введите число");
        num = in.nextInt();
        switch(num){
            case 1:
                System.out.println("число равно 1");
                break;
            case 8:
                System.out.println("число равно 8");
                num++;
                break;
            case 9:
                System.out.println("число равно 9");
                break;
            default:
                System.out.println("число не равно 1, 8, 9");

        }*/
        /*Scanner in = new Scanner(System.in);
        System. out.println("Выберете язык: ");
        String language = in.next();
        switch (language){
            case "eng":
                System.out.println("Hello");
                break;
            case "rus":
                System.out.println("Привет!");
                break;
            case "fr":
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("выберите правильный язык");*/

        /*Scanner in = new Scanner(System.in);
        int num;
        num = in.nextInt();
        switch (num){
            case 8:
            case 9:
                System.out.println("morning");
                break;
        }*/
        /*Scanner in = new Scanner(System.in);
        int num;
        num = in.nextInt();
        switch (num){
            case 23,00,01,02,03,04,05:
                System.out.println("Ночь");
            case 06,07,08,09,10,11:
                System.out.println("Утро");
            case 12,13,14,15,16,17:
                System.out.println("День");
            case 18,19,20,21,22:
                System.out.println("Вечер");
                break;

        }*/
        /*Scanner in = new Scanner(System.in);
        int num1;
        int num2;
        char ch;
        System.out.println("Please,input two numbers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        System.out.println("Input sign of operation");
        char st = in.next().charAt(0);
        switch(st){
            case '+':
                System.out.println(num1+num2);
                break;
            case'-':
                System.out.println(num1-num2);
                break;
            case'*':
                System.out.println(num1*num2);
                break;
            case'/':
                if(num2 != 0)
                    System.out.println(num1/num2);
                else
                    System.out.println("Input correct second number");
                break;
            default:
                System.out.println(" Input correct operation");


        }*/
        Scanner in = new Scanner(System.in);
        System.out.println("Choose a mounth");
        int mounth = in.nextInt();
        switch(mounth){
            case 12,1,2:
                System.out.println("It's winter month ");
                break;
            default:
                System.out.println("It's not winter month");


        }


    }
}

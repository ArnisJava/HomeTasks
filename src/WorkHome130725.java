import java.util.Scanner;
public class WorkHome130725 {
    public static void main(String[] args) {

        /*Scanner in = new Scanner(System.in);
        int n;
        System.out.println("введите число n ");
        n = in.nextInt();
        for ( int i =0; i<=n; i++){
            if (( i %5 == 0)&&( i %3 ==0))
                System.out.println( i );

        }*/
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Введите с клавиатуры число n ");
        n = in.nextInt();
        System.out.println("Ведите вариант: ");
        char f = in.next().charAt(0);// Чтение варианта
        switch (f)// Выбор варианта ( перебор вариантов).
        {
            case'а': // В случае варианта "а"
                for( int i = 0; i < n; i++)
                {
                    for( int j = 0; j < n; j++)
                        if(i <= j)  // идёт проверка того, что эл-т нах-ся выше гл.диагонали.
                            System.out.print("*" + "\t");// элементы выше главной диагонали выводится в виде *
                        else
                            System.out.print(" " + "\t");// Остальные выводятся в виде пробела.
                    System.out.println();
                }
        }
    }
}


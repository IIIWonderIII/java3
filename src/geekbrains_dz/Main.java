package geekbrains_dz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Задание №2
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

//        Задание №3
        int a = in.nextInt();
        int b = in.nextInt();
        int c = 0;
        System.out.println("Sum: " + (a + b));

        if (c <= (a + b)) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }


        //Задание №4
          int value = in.nextInt();
          if (value <= 0 ){
              System.out.println("Красный");
          } else if (value <= 100 ) {
              System.out.println("Желтый");
          } if (value > 100 ) {
            System.out.println("Зеленый");
        }

          // Задание №5
        if (a >= b) {
            System.out.println("a >= b");
        } else  if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("Все верно");
        }
    }
}
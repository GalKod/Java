// Дано натуральное число.
// Можно ли представить его в виде суммы трех квадратов натуральных чисел?
// Вывести данные тройки и количество возможных троек

package com.homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);

        int n;
        int count = 0;

        System.out.print("Input a number: ");
        n = in.nextInt();

        double x_top = Math.sqrt((double)(n / 3) )+ 1;
        for (int x = 1; x < x_top; x++){
            double y_top = Math.sqrt((double) (n - x * x) / 2) + 1;
            for (int y = x; y < y_top; y++) {
                double z_top = Math.sqrt((double)(n - x * x - y * y)) + 1;
                for (int z = y; z < z_top; z++) {
                    if (x * x + y * y + z * z == n) {
                        System.out.print(x + "   " + y + "   " + z + "\n");
                        count++;
                    }
                }
            }
        }
        if (count==0){
            System.out.println("No solution");
        } else
            System.out.print(count);
        in.close();
    }
}

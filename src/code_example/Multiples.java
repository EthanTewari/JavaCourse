package code_example;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value of multiple:");
        int num = sc.nextInt();
        System.out.println("enter the range size");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            System.out.println(num + "*" + i + "=" + num * i);

        }
    }
}

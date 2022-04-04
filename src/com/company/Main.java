package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // write your code here
        System.out.println("dao nguoc phan tu trong mang su dung stack");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi");
        String str = sc.nextLine();
        String newStr = "";
        Stack wStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            wStack.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            newStr += wStack.pop();
        }
        newStr = newStr + "---mWord";
        System.out.println("result==" + newStr);


        int[] array = {1, 2, 3, 4, 5};
        Stack<Integer> arr = new Stack<>();
        for (int j = 0; j < array.length; j++) {
            arr.push(array[j]);
        }

        for (int j = 0; j < array.length; j++) {
            array[j] = arr.pop();
        }

        for (int newArr : array) {
            System.out.printf(" " + newArr);
        }
    }
}

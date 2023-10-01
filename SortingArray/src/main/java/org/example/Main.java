package org.example;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static void order(int[] list){
        int temp=0;
        for(int i=0; i<list.length; i++){
            for(int j=i+1; j<list.length; j++){
                if(list[i]>list[j]){
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(list));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int len = input.nextInt();
        int[] arr = new int[len];
        for(int i=1; i <= len; i++){
            System.out.print(i + ". Elemanı giriniz: ");
            int val = input.nextInt();
            arr[i-1] = val;
        }
        order(arr);
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Kaç tane sayı gireceksiniz:");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        int[] dizi = new int[sayi];

        for (int i = 0; i < sayi; i++) {
            System.out.print((i + 1) + ".Sayıyı) giriniz:");
            dizi[i] = input.nextInt();
        }
        int min = dizi[0];
        int max = dizi[0];
        for (int i : dizi

        ) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Max değer:"+max);
        System.out.println("Min değer:"+min);
    }
}

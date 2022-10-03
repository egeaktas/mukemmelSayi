/*

Mükemmel sayı bulan program.

Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt(), toplam = 0;
        for(int i = 1; i<=(sayi/2); i++){
            if(sayi%i == 0){
            toplam = toplam + i;
            }
        }

        if(toplam == sayi){
            System.out.println(sayi+" sayisi bir mükemmel sayıdır.");
        }else{
            System.out.println(sayi+" sayisi bir mükemmel sayı değildir.");
        }

    }
}
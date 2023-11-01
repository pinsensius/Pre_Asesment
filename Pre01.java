import java.util.*;
import java.lang.*;

public class Pre01{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        int angkaSatu = input.nextInt();
        int angkaKeDua = input.nextInt();
        int angkaKeTiga = input.nextInt();

        System.out.println(angkaDigit(angkaSatu) +"\n"+angkaDigit(angkaKeDua) +"\n"+ angkaDigit(angkaKeTiga));

        input.close();

    }

    private static String angkaDigit(int angka){
        String enkripsi = "";
        System.out.println(enkripsi);
        int digit = 0;
        System.out.println(digit);

        while(angka > 0){
           digit = angka % 10;
           digit += 5;
           System.out.println(digit);
           if(digit >= 10){
                System.out.println(digit);
               digit %= 10;
           }
           
           System.out.println(digit);
           String digitKeString = Integer.toString(digit);
           System.out.println(digitKeString);
           enkripsi += digitKeString;
           System.out.println(digitKeString);
           angka = angka / 10;
           System.out.println(angka);

        }

        System.out.println(enkripsi);
        enkripsi = reverseString(enkripsi);

        System.out.println(enkripsi);

        return enkripsi;
    }

    private static String reverseString(String kata){
        StringBuilder reverser = new StringBuilder();

        reverser.append(kata);
        reverser.reverse();

        String hasil = String.valueOf(reverser);
    

        return charSwapper(hasil,1,hasil.length()-1);

    }

    private static String charSwapper(String str, int a, int b){
        StringBuilder swapper = new StringBuilder();

        swapper.append(str);

        swapper.setCharAt(a, str.charAt(b));
        swapper.setCharAt(b, str.charAt(a));

        return swapper.toString();
    }
}
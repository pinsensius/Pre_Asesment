import java.util.*;

public class Pra03 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        String jenisKelamin = input.nextLine();

        int beratBadan = input.nextInt();
        double tinggiBadan = input.nextInt();
        
        double bmi = beratBadan / Math.pow((tinggiBadan / 100), 2);

        if(jenisKelamin.equals("Pria")){

            if(bmi <= 20.50) {
                System.out.printf("%.2f, Kurus", bmi);
            }else if(bmi >= 20.50 && bmi <= 26.99 ){
                System.out.printf("%.2f, Ideal", bmi);
            }else{
                System.out.printf("%.2f, Gemuk", bmi);
            }
        }else{
            if(bmi <= 18.50) {
                System.out.printf("%.2f, Kurus", bmi);
            }else if(bmi >= 18.50 && bmi <= 24.99 ){
                System.out.printf("%.2f, Ideal", bmi);
            }else{
                System.out.printf("%.2f, Gemuk", bmi);
            }
        }

        input.close();
    }
}

import java.util.*;

public class Pre02 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        int angkaSatu = input.nextInt();
        int angkaDua = input.nextInt();

        int hasilAkhir = angkaSatu + angkaDua;
        System.out.println(hasilAkhir);

        String hasilAkhirToString = Integer.toString(hasilAkhir);

        String angka1 = hasilAkhirToString.substring(0,1);
        String angka2 = hasilAkhirToString.substring(1,2);
        String angka3 = hasilAkhirToString.substring(hasilAkhirToString.length() - 1);

        String ratusan = toWords(hasilAkhirToString.substring(0,1));
        String puluhan = toWords(hasilAkhirToString.substring(1,2));
        String satuan = toWords(hasilAkhirToString.substring(hasilAkhirToString.length() - 1));

        if(angka2.contains("0") && angka3.contains("0")){
            System.out.printf("%s ratus",ratusan);
        }else if(angka2.contains("0") || angka2.contains("1")){
            if(angka2.contains("1") && angka3.contains("1")){
                System.out.printf("%s ratus sebelas",ratusan);    
            }else if(angka2.contains("1")){
                System.out.printf("%s ratus %s belas", ratusan, satuan);
            }else{
                System.out.printf("%s ratus %s",ratusan, satuan);
            }
        }else if(angka3.contains("0")){
            System.out.printf("%s ratus %s puluhan", ratusan, puluhan);  
        }else if(angka1.contains("1")){
            System.out.printf("%s puluhan %s",puluhan , satuan);
        }else{
            System.out.printf("%s ratus %s puluhan %s", ratusan, puluhan, satuan);
        }

        input.close();
    }

    private static String toWords(String angka){
        String kalimat = "";
        switch(angka){
            case "0" :
                kalimat = "";
                break;
            case "1" :
                kalimat = "satu";
                break;
            case "2" : 
                kalimat = "dua";
                break;
            case "3" : 
                kalimat = "tiga";
                break;
            case "4" : 
                kalimat = "empat";
                break;
            case "5" : 
                kalimat = "lima";
                break;
            case "6" :
                kalimat = "enam";
                break;
            case "7" : 
                kalimat = "tujuh";
                break;
            case "8" : 
                kalimat = "delapan";
                break;
            case "9" : 
                kalimat = "sembilan";
                break;
            case "10" :
                kalimat = "sepuluh";
                break;
            default :
                System.out.println("Error : number is not found !");
                break;
        }

        return kalimat;
    }
}


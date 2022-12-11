//dairenin çevresini hesaplama
import java.util.Scanner;
public class daireçevre {
    public static void main(String[] args){
      final double PI_SAYISI= 3.141593;

        //Scanner nesnesi oluşturma
        Scanner input =new Scanner(System.in);

        //Kullanıcı yarı çap değeri girişi
        System.out.println(" lütfen yarı çap değerini giriniz.");
        double yaricap =input.nextDouble();


        //Dairenin çevresini hesaplama
        double cevre = 2 * PI_SAYISI * yaricap;


        //Sonucu gösterme
        System.out.println(yaricap+ "yarı çaplı dairenin çevresi"+ cevre +"dir.");


        }

    }


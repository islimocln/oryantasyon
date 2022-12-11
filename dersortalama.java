
import java.util.Scanner;
public class dersortalama {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("vize notunuzu giriniz=");
        int vizenotu= input.nextInt();
        System.out.println("final notunuzu giriniz");
        int finalnotu=input.nextInt();

        double ortalama = vizenotu * 0.4 + finalnotu * 0.6;

        if (ortalama>=50){
            System.out.println("Dersten geçtiniz.notunuz= "+ortalama);
        }else{
            System.out.println("dersten geçemediniz  notunuz="+ ortalama);
        }

    }
}

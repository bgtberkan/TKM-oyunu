import  java.util.Scanner;
import  java.util.Random;
public class Main {
    public static void main(String[] args) {
         System.out.println("Taş, Kağıt, Makas, Oyununa hoş geldiniz");
         System.out.println("oyunun kuralları");
         System.out.println("Taş makası alır, makas kağıdı alır, kağıt taşı alır unutmayın!!");
         System.out.println("Toplam 3 tur oynanılacak ve 2 kez kazanan turun kazananı olur");
         System.out.println("beraberlik durumunda oyun sayılmaz ve bir kez daha oynanılır");
         System.out.println("Taş için 0 tuşuna basın ");
         System.out.println("kağıt için 1 tuşuna basın");
         System.out.println("Makas İçin 2 Tuşuna basın");
        int k1 = 0;
        int pc1 = 0;
        for( int M=1; M<4; M++) {
            Random rnd = new Random();
            Scanner input = new Scanner(System.in);
            int pc = rnd.nextInt(3);
            int K= input.nextInt();
           if (K != 0 && K != 1 && K != 2) {
               System.out.println("Lütfen  taş, kağıt, makas, bunlardan birini seçin ");
               M = M - 1;
           }
               if (K == pc) {
                   System.out.println("Berabere");
                   System.out.println(pc);
                   M = M - 1;
                   System.out.println( " Kullanıcı Skor " + " " + k1 + " " + "Pc Skor " + pc1);
               }
               if (K == 0 && pc == 1) {
                   System.out.println("Kağıt taşı alır kazanan PC!");
                   System.out.println("pc: Easy life easy game!");
                   System.out.println(pc);
                   pc1 = pc1 + 1;
                   System.out.println( " Kullanıcı Skor " + " " + k1 + " " + "Pc Skor " + pc1);

               }
               if (K == 0 && pc == 2) {
                   System.out.println("Taş makası alır kazandınız");
                   System.out.println(pc);
                   k1 = k1 + 1;
                   System.out.println( " Kullanıcı Skor " + " " + k1 + " " + "Pc Skor " + pc1);
               }
               if (K == 1 && pc == 0) {
                   System.out.println("Kağıt taşı alır Kazandınız!");
                   System.out.println(pc);
                   k1 = k1 + 1;
                   System.out.println( " Kullanıcı Skor " + " " + k1 + " " + "Pc Skor " + pc1);
               }
               if (K == 1 && pc == 2) {
                   System.out.println("Makas kağıdı alır kazanan PC!");
                   System.out.println("pc:Hahahaha!");
                   System.out.println(pc);
                   pc1 = pc1 + 1;
                   System.out.println( " Kullanıcı Skor " + " " + k1 + " " + "Pc Skor " + pc1);
               }
               if (K == 2 && pc == 0) {
                   System.out.println("Taş makası alır kazanan PC!");
                   System.out.println("pc:ezzzzz!");
                   System.out.println(pc);
                   pc1 = pc1 + 1;
                   System.out.println( " Kullanıcı Skor " + " " + k1 + " " + "Pc Skor " + pc1);
               }
               if (K == 2 && pc == 1) {
                   System.out.println("Makas kağıdı alır kazandınız!");
                   System.out.println(pc);
                   k1 = k1 + 1;
                   System.out.println( " Kullanıcı Skor " + " " + k1 + " " + "Pc Skor " + pc1);
               }
           }
        if (pc1 < k1){
            System.out.println("Kazandınız!");
        }
        else {
            System.out.println("pc kazanır");
        }
       }
    }

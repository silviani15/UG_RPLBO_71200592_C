import java.util.Scanner;

public class Main {
    public static  void main(String args[]) {

        Mobil M_71200592;
        M_71200592 = new Mobil();
        PejalanKaki P_71200592;
        P_71200592 = new PejalanKaki();
        Scanner inp = new Scanner(System.in);
        System.out.println("Kode lampu lalu lintas saat ini:");
        int lampuCode = inp.nextInt();
        if (lampuCode == 1) {
            System.out.println("-----Lampu Hijau-----");
            System.out.println("M_71200592 jalan...");
            System.out.println("P_71200592 menunggu...");
        } else if (lampuCode == 2) {
            System.out.println("-----Lampu Kuning-----");
            System.out.println("M_71200592 mengurangi kecepatan...");
            System.out.println("P_71200592 bersiap menyeberang jalan...");
        } else if (lampuCode == 3) {
            System.out.println("-----Lampu Merah-----");
            System.out.println("M_71200592 berhenti...");
            System.out.println("P_71200592 menyeberangi jalan...");
        } else {
            System.out.println("Kode lalu lintas tidak valid");
        }
    }
}
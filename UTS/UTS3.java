import java.util.Scanner;

public class UTS3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Masukkan jumlah elemen: ");
        int jumlahElemen = sc.nextInt();

        int[] arrayData = new int[jumlahElemen];
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.println("Masukkan nilai data ke-" + (i + 1) + ":");
            arrayData[i] = sc.nextInt();
        }

        System.out.println("Masukkan angka yang ingin dicari: ");
        int angkaDicari = sc.nextInt();

        boolean ditemukan = false;
        for (int i = 0; i < jumlahElemen; i++) {
            if (arrayData[i] == angkaDicari) {
                System.out.println("Angka " + angkaDicari + " ditemukan pada indeks " + i);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Angka " + angkaDicari + " tidak ditemukan dalam array.");
        }
    }
}

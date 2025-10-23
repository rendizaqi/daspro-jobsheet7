import java.util.Scanner;

public class PenjualanTiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Harga tiket
        int hargaTiket = 50000;
        int totalTiket = 0;
        int totalHarga = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid, silakan masukkan jumlah tiket yang valid!");
                continue;
            }

            // Menghitung total harga tiket
            totalTiket += jumlahTiket;
            totalHarga += jumlahTiket * hargaTiket;

            // Menentukan diskon
            if (jumlahTiket > 10) {
                totalHarga -= totalHarga * 0.15;
            } else if (jumlahTiket > 4) {
                totalHarga -= totalHarga * 0.10;
            }

            // Menampilkan hasil perhitungan
            System.out.println("Total tiket yang terjual: " + totalTiket + " tiket");
            System.out.println("Total harga penjualan: Rp " + totalHarga);

            System.out.print("Apakah ada transaksi lain? (ya/tidak): ");
            sc.nextLine();
            String jawab = sc.nextLine();

            if (jawab.equalsIgnoreCase("tidak")) {
                break;
            }
        }

        System.out.println("Semua transaksi selesai.");
        sc.close();
    }
}

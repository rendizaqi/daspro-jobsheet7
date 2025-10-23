import java.util.Scanner;

public class parkir18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi;
        double total = 0;

        while (true) {
            // Input jenis kendaraan
            System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            jenis = sc.nextInt();

            // Jika input jenis kendaraan adalah 0, program berhenti
            if (jenis == 0) {
                break;
            }

            // Input durasi parkir
            System.out.print("Masukkan durasi parkir (dalam jam): ");
            durasi = sc.nextInt();

            // Tarif parkir dengan kondisi durasi lebih dari 5 jam
            if (durasi > 5) {
                total += 12500;
            } else {
                if (jenis == 1) { // Mobil
                    total += durasi * 3000;
                } else if (jenis == 2) { // Motor
                    total += durasi * 2000;
                }
            }
        }

        // Output total pembayaran
        System.out.println("Total pembayaran parkir: Rp " + total);
    }
}

import java.util.Scanner;

public class Rental {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Transaksi transaksi = new Transaksi();
        transaksi.boot();

        System.out.println("Menu utama");
        System.out.println("1. Daftar Motor dan Harganya");
        System.out.println("2. Peminjaman");
        System.out.println("3. Urutan Pengembalian");
        System.out.println("0. Exit  ");

        int menu = 1;

        while (menu != 0) {

            System.out.println();
            transaksi.jumlahPinjam();

            System.out.print("Masukkan Menu pilihan: ");
            menu = scan.nextInt();

            switch (menu) {
            case 1:
                daftarMotor();
                break;

            case 2:
                transaksi.peminjaman();
                break;

            case 3:
                transaksi.urutanPengembalian();
                break;

            default:
                System.out.println("Maaf pilihan yang anda pilih tidak ada");
            }

        }

    }

    static void daftarMotor() {

        System.out.println("====================================================================");
        System.out.println("                      DAFTAR RENTAL MOTOR                           ");
        System.out.println("===================================================================");
        System.out.println(" ");
        System.out.println("Nama motor yang dipinjam\t\tHarga motor");
        System.out.println("0. Motor Honda Vario\t\t\tRp.100.000");
        System.out.println("1. Motor Honda Beat\t\t\tRp.150.000");
        System.out.println("2. Motor Honda Scoopy\t\t\tRp.110.000");
        System.out.println("3. Motor Honda Spacy\t\t\tRp.100.000");
        System.out.println("4. Motor Honda PCX150\t\t\tRp.100.000");
        System.out.println("5. Motor Yamaha R1\t\t\tRp.200.000");
        System.out.println("6. Motor Yamaha R6\t\t\tRp.250.000");
        System.out.println("7. Motor Suzuki Hayabusa\t\tRp.300.000");
        System.out.println("8. Motor Honda CBR250 RR\t\tRp.450.000");
        System.out.println("9. Motor Honda MegaPro\t\t\tRp.300.000");
        System.out.println();
    }
}
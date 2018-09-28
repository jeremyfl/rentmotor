import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Transaksi {
    private Scanner scan = new Scanner(System.in);
    protected ArrayList<String> pinjam = new ArrayList<String>();
    protected String dataMotor[][] = new String[10][10];

    void boot() {
        // Dimensi array pertama sebagai nama
        // Dimensi array kedua untuk harga

        dataMotor[0][0] = "Motor Honda vario";
        dataMotor[0][1] = "Rp.100.000";
        dataMotor[1][0] = "Motor Honda beat";
        dataMotor[1][1] = "Rp.150.000";
        dataMotor[2][0] = "Motor Honda Scoopy";
        dataMotor[2][1] = "Rp.110.000";
        dataMotor[3][0] = "Motor Honda Spacy";
        dataMotor[3][1] = "Rp.100.000";
        dataMotor[4][0] = "Motor Honda PCX150";
        dataMotor[4][1] = "Rp.100.000";
        dataMotor[5][0] = "Motor Yamaha R1";
        dataMotor[5][1] = "Rp.200.000";
        dataMotor[6][0] = "Motor Yamaha R6";
        dataMotor[6][1] = "Rp.250.000";
        dataMotor[7][0] = "Motor Suzuki Hayabusa";
        dataMotor[7][1] = "Rp.300.000";
        dataMotor[8][0] = "Motor Honda CBR250 RR";
        dataMotor[8][1] = "Rp.450.000";
        dataMotor[9][0] = "Motor Honda MegaPro";
        dataMotor[9][1] = "Rp.300.000";

        // Storing selected motor with array list
        pinjam.add(dataMotor[0][0]);
        pinjam.add(dataMotor[1][0]);
    }

    void peminjaman() {
        System.out.println();
        System.out.println("=============================");
        System.out.print("Pilih motor yang diinginkan: ");
        int selectedMotor = scan.nextInt();

        // Checking same motor name
        if (pinjam.contains(dataMotor[selectedMotor][0])) {
            System.out.println("Maaf, motor tersebut sudah lebih dulu dipinjam orang");
        } else {
            // Storing selected motor with array list
            pinjam.add(dataMotor[selectedMotor][0]);
            System.out.println(dataMotor[selectedMotor][0] + " berhasil dipinjam!");
        }

    }

    void urutanPengembalian() {
        Antrian antrian = new Antrian(pinjam.size());

        for (int i = 0; i < pinjam.size(); i++) {
            antrian.enqueue(pinjam.get(i));
        }

        System.out.println();
        System.out.println("=============================");
        System.out.println("Urutan motor yang akan dikembalikan terlebih dahulu");
        for (int i = 0; i < pinjam.size(); i++) {
            System.out.println(i + " " + antrian.dequeue());
        }

    }

    void jumlahPinjam() {
        System.out.println("Motor yang sedang dipinjam ada: " + pinjam.size());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programratarata;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Programratarata {

    public static void main(String[] args) {
        // Deklarasi variabel
        int banyakNilai;
        int[] nilai;
        double rataRata;

        // Input banyaknya nilai
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai: ");
        banyakNilai = scanner.nextInt();

        // Inisialisasi array nilai
        nilai = new int[banyakNilai];

        // Input nilai mahasiswa
        for (int i = 0; i < banyakNilai; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = scanner.nextInt();
        }

        // Hitung rata-rata nilai
        rataRata = 0;
        for (int i = 0; i < banyakNilai; i++) {
            rataRata += nilai[i];
        }
        rataRata /= banyakNilai;

        // Output rata-rata nilai
        System.out.println("Rata-rata nilai adalah: " + rataRata);
    }
}

import java.util.Scanner;

public class Main {
    static Singlylinkedlist list1 = new Singlylinkedlist();
    static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
    int i = 0;
    while (i != 4) {
        System.out.println("1.Tambah buku \n2.Hapus Buku \n3.Cetak Daftar Buku \n4.Keluar \n");
        System.out.println("Pilih Operasi:");

        i = sc.nextInt();
    switch (i) {
        case 1:
            System.out.println("Masukan Buku di Depan/Belakang? 1/2");
            int posisi = sc.nextInt();
            if (posisi == 1) {
                tambahBukuDepan();
            }else{
                tambahBukuBelakang();
            }

            break;
        case 2:
            System.out.println("Hapus Buku di Depan/Belakang? 1/2");
            int depanBelakang= sc.nextInt();
            if (depanBelakang == 1) {
                list1.HapusDepan();
            }else{
                list1.HapusBelakang();
            }
            break;
        case 3:
            list1.print();
            break;
        case 4:
            
            break;
    
            }
        }
    } 

    static void tambahBukuDepan(){
        String judul;
        String penulis;
        int terbit;
        System.out.println("Judul Buku:");
        judul =sc.next();
        System.out.println("Penulis Buku:");
        penulis = sc.next();
        System.out.println("Tahun Tebit:");
        terbit = sc.nextInt();

        list1.TambahDepan(new Buku(judul, penulis, terbit));
    }

        static void tambahBukuBelakang(){
        String judul;
        String penulis;
        int terbit;
        System.out.println("Judul Buku:");
        judul =sc.next();
        System.out.println("Penulis Buku:");
        penulis = sc.next();
        System.out.println("Tahun Tebit:");
        terbit = sc.nextInt();

        list1.TambahDepan(new Buku(judul, penulis, terbit));
    }
}
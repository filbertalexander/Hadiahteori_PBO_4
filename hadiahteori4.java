import java.util.Scanner;

public class hadiahteori4 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        String nama;
        char grade ;
        final double tugas1 ,tugas2,tugas3, mid , akhir,toltugas,tolakhir;
        System.out.println("===== Menghitung Nilai Mahasiswa=====\n");
        System.out.print("Masukan Nama : ");
        nama = input.nextLine();
        System.out.print("Nilai tugas 1 : ");
        tugas1 = input.nextInt();
        System.out.print("Nilai tugas 2 : ");
        tugas2 = input.nextInt();
        System.out.print("Nilai tugas 3 : ");
        tugas3 = input.nextInt();
        System.out.print("Nilai mid : ");
        mid = input.nextInt();
        System.out.print("Nilai final : ");
        akhir = input.nextInt();
        toltugas = (tugas1+tugas2+tugas3)/3;
        tolakhir = (toltugas * 0.30 )+( mid*0.30)+( akhir * 0.40);
        if (tolakhir >= 80 && tolakhir <=100){
            grade = 'A';
        }
        else if (tolakhir > 60 && tolakhir < 79){
            grade = 'B';
        }
        else if (tolakhir > 50 && tolakhir < 59){
            grade = 'C';
        }
        else if (tolakhir > 40 && tolakhir < 49){
            grade = 'D';
        }
        else {
            grade = 'E';
        }
        
           System.out.println("\n"+nama+" memiliki nilai akhir "+tolakhir+" = "+grade);
                    
    }
}
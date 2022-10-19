import java.util.Scanner;

public class MainKaryawan {
    
    
    public static void main(String[] args) {
        int gajipokok, golongan, harilembur, gajilembur, totalgaji;
        String nama, nik;
        Scanner sc = new Scanner(System.in);
        MainKaryawan k = new MainKaryawan();
        
        System.out.println("--- Rincian Gaji Karyawan ---");
        System.out.print("MASUKAN NAMA       :");
        nama = sc.next();
        System.out.print("MASUKAN NIK        :");
        nik = sc.next();
        System.out.print("MASUKAN GOLONGAN   :");
        golongan = sc.nextInt();
        System.out.print("MASUK LEMBUR       :");
        harilembur = sc.nextInt();
        gajipokok = k.pilihGolongan(golongan);
        gajilembur= k.hitLembur(harilembur);
        totalgaji = k.totalGaji(gajipokok,gajilembur);
        KaryawanXyz p = new KaryawanXyz(nama, nik, gajipokok, golongan, harilembur, gajilembur, totalgaji);
        
        p.tampil();
    }
    
    private int pilihGolongan(int golongan){
        int gajipokok;
        if (golongan == 1){
            gajipokok = 10000;
        }else if(golongan == 2){
            gajipokok = 13000;
        } else if (golongan == 3){
            gajipokok = 15000;
        }else{
            gajipokok = 8000;
        }
        return gajipokok;
    }
    
     int hitLembur(int harilembur){
        int gajilembur;
        return gajilembur= harilembur * 1000;
    }
     
    int totalGaji(int gajipokok, int glembur){
        return gajipokok + glembur;
    }
}
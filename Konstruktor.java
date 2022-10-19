public class Konstruktor {
    int gajipokok, golongan, jkerja, harilembur, gajilembur,totalgaji;
    String nama, nik;
    
    public Konstruktor(String nama, String nik, 
                       int gajipokok, int golongan, int harilembur,
                       int gajilembur, int totalgaji){
        this.nama = nama;
        this.nik = nik;
        this.golongan = golongan;
        this.gajipokok = gajipokok;
        this.harilembur = harilembur;
        this.gajilembur = gajilembur;
        this.totalgaji = totalgaji;
    }
     
    
   void tampil(){
       System.out.println("Nama : "+ this.nama);
       System.out.println("Nik : "+ this.nik);
       System.out.println("Golongan :"+ this.golongan);
       System.out.println("Gaji Pokok : "+ this.gajipokok);
       System.out.println("Gaji Lembur : "+ this.harilembur);
       System.out.println("Total Gaji : "+ this.totalgaji);
   }
}
package Paket;

public class Main {
    public static void  main (String[] args){
        Manusia a1 = new Manusia("Agus");
        System.out.println(a1);
        a1.setNama("Aji");
        System.out.println(a1.getNama());

        Manusia a2 = new Mahasiswa("Budi");
        System.out.println(a2);
        a2.setNama("Bayu");
        System.out.println(a2.getNama());

        Mahasiswa b1 = new Mahasiswa("Susi");
        System.out.println(b1);
        b1.setNama("Santi");
        System.out.println(b1.getNama());
    }
}

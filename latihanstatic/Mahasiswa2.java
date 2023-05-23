package latihanstatic;

public class Mahasiswa2 {
    private static String prodi = "TRPL";
    private String nama;

    public Mahasiswa2(String nama) {
        this.nama = nama;
    }

    public static String getProdi() {
        return prodi;
    }

    public static void setProdi(String prodi) {
        Mahasiswa2.prodi = prodi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nama=" + nama + ", prodi=" + prodi + "}";
    }

    public static void main(String[] args) {
        System.out.println(Mahasiswa2.getProdi());

        Mahasiswa2 st1 = new Mahasiswa2("Mr X satu");
        System.out.println(st1.getNama());
        System.out.println(st1.getProdi());

        Mahasiswa2 st2 = new Mahasiswa2("Mr X dua");
        System.out.println(st2.getProdi());
        System.out.println(st2.getNama());

        st1.setProdi("Teknologi RPL");
        st1.setNama("Agus");
        st2.setProdi("Teknologi Rekayasa Perangkat Lunak");
        st2.setNama("Budi");

        System.out.println(st1.getProdi());
        System.out.println(st1.getNama());
        System.out.println(st2.getProdi());
        System.out.println(st2.getNama());
    }
}

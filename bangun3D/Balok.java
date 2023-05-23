package bangun3D;

public class Balok extends bangun2D.PersegiPanjang {
    private int tinggi;

    public Balok(double panjang, double lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double getLuas() {
        return 2* (getPanjang()*getLebar()+getPanjang()*tinggi+getLebar()*tinggi);
    }

    @Override
    public double getKeliling() {
        return 4* (getPanjang()+getLebar()+tinggi);
    }

    public double getLuasAlas(){
        return super.getLuas();
    }

    public double getVolume(){
        return super.getLuas()*tinggi;
    }

    @Override
    public String toString() {
        return "Balok{" +
                "panjang=" + getPanjang() +
                "lebar=" + getLebar() +
                "tinggi=" + tinggi +
                '}';
    }
}

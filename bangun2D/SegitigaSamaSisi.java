package bangun2D;

import master.Matematika;

public class SegitigaSamaSisi extends Segitiga{

    public SegitigaSamaSisi(double sisi) {
        super(sisi, 0);
        super.setTinggi(getTinggi());
    }

//    @Override
//    public double getTinggi() {
//        double sisi = getAlas();
//        double t = sisi*sisi - (sisi/2)*(sisi/2);
//        return Math.sqrt(t);
//    }

    public double getTinggi(){
        return Matematika.getLurus(getAlas(), getAlas()/2);
    }

    @Override
    public void setTinggi(double tinggi) {
        double alasBaru = Math.sqrt((4.0/3)*tinggi*tinggi);
    }

    @Override
    public double getKeliling() {
        return 3*getAlas();
    }

    @Override
    public String toString() {
        return "SegitigaSamaSisi{" + "sisi=" + getAlas()+ '}';
    }
}

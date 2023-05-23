package bangun2D;

import master.Matematika;

public class SegitigaSiku extends Segitiga{

    public SegitigaSiku(double alas, double tinggi) {
        super(alas, tinggi);
    }

    @Override
    public double getKeliling() {
        return getAlas()+getTinggi()+getSisiMiring();
    }

//    public double getSisiMiring(){
//        return Math.sqrt(Math.pow(getAlas(),2)+Math.pow(getTinggi(),2));
//    }

    public double getSisiMiring(){
        return Matematika.getMiring(getAlas()/2, getTinggi());
    }

    @Override
    public String toString() {
        return "SegitigaSiku{" + "a=" +getAlas()+ ", t=" + getTinggi() + '}';
    }
}

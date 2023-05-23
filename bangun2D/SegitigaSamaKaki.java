package bangun2D;
import master.Matematika;
public class SegitigaSamaKaki extends Segitiga{

    public SegitigaSamaKaki(double alas, double tinggi) {
        super(alas, tinggi);
    }

    @Override
    public double getKeliling() {
        return getAlas()+2*getSisiMiring();
    }

//    public double getSisiMiring(){
//        return Math.sqrt(Math.pow(getAlas()/2,2)+Math.pow(getTinggi(),2));
//    }

    public double getSisiMiring(){
        return Matematika.getMiring(getAlas()/2, getTinggi());
    }

    @Override
    public String toString() {
        return "SegitigaSamaKaki{" + "a=" +getAlas()+ ", t=" + getTinggi() + '}';
    }
}

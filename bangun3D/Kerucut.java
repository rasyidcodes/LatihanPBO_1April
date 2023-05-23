package bangun3D;
import master.Matematika;
public class Kerucut extends Tabung{
    private double phi = 22.0/7;
    public Kerucut(double r, double tinggi) {
        super(r, tinggi);
    }

    public double getLuas() {
        return getLuasAlas() + phi*getR () * getSisiMiring();
    }

//    public double getSisiMiring() {
//        double s = getR() * getR() + getTinggi () *getTinggi();
//        return Math.sqrt(s);
//    }

    public double getSisiMiring(){
        return Matematika.getMiring(getR(), getTinggi());
    }
    public double getVolume() {
        return super. getVolume() / 3;
    }

    @Override
    public String toString() {
        return "Tabung{" +
                "r=" + getR() +
                ", tinggi=" + getTinggi() +
                '}';
    }
}

package bangun3D;

public class Kubus extends bangun2D.Persegi{
    public Kubus(double sisi) {
        super(sisi);
    }

    @Override
    public double getLuas() {
        return 6*super.getLuas();
    }

    @Override
    public double getKeliling() {
        return 12*super.getSisi();
    }

    public double getLuasAlas(){
        return super.getLuas();
    }

    public double getVolume(){
        return super.getLuas()*super.getSisi();
    }

    @Override
    public String toString() {
        return "Kubus{" + "sisi=" + getSisi() + '}';
    }
}

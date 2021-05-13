package Feladat_1;

public class Diak {
    private String vnev;
    private String knev;
    private double erettsegi;
    private double matematika;

    public Diak(String vnev, String knev, double erettsegi, double matematika){
        this.vnev = vnev;
        this.knev = knev;
        this.erettsegi = erettsegi;
        this.matematika = matematika;
    }
    public Diak(){}
    public String getVnev() {
        return vnev;
    }
    public void setVnev(String vnev) {
        this.vnev = vnev;
    }

    public String getKnev() { return knev; }
    public void setKnev(String knev) { this.knev = knev; }

    public double getErettsegi() { return erettsegi;}
    public void setErettsegi(double erettsegi) { this.erettsegi = erettsegi; }

    public double getMatematika() { return matematika; }
    public void setMatematika(double matematika) { this.matematika = matematika; }

    public double atlag(){
        double atlag = (this.erettsegi + this.matematika)/2;
        return atlag;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(vnev + ' ' + knev + ' ' + erettsegi + ' ' + matematika + " atlag: "+ atlag());
        return result.toString();
    }
}

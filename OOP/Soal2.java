class Kubus{
    int s = 10;
    int p = 3;
    int hasil = (int) Math.pow(s,p);
}

class Balok{
    int p = 10;
    int l = 6;
    int t = 3;
}

class Tabung {
    double pi= 3.14;
    double r=7;
    double t= 10;

    double hasilTabung = pi*r*r*t;
}
public class Soal2 {
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        System.out.println("Volume Kubus = "+kubus.hasil);

        Balok balok = new Balok();
        System.out.println("Volume Balok = "+(balok.p*balok.l*balok.t));

        Tabung tabung = new Tabung();
        System.out.println("Volume Tabung = "+tabung.hasilTabung);
    }
}

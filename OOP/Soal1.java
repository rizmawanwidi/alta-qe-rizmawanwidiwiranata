class KelilingPersegi extends LuasPersegi{

}

class KelilingSegitiga extends LuasSegitiga{
    double c = Math.sqrt(a*a+t*t);
}

class KelilingPersegiPanjang extends LuasPersegiPanjang{

}
class LuasPersegi{
    int sisi = 4;
}

class LuasSegitiga{
    double a = 3;
    double t =4;
}

class LuasPersegiPanjang {
    int panjang = 8;
    int lebar = 7;
}
public class Soal1 {
    public static void main(String[] args) {
        LuasPersegi luasPersegi = new LuasPersegi();
        System.out.println("L.Persegi = "+luasPersegi.sisi*luasPersegi.sisi);

        LuasSegitiga luasSegitiga = new LuasSegitiga();
        System.out.println("L.Segitiga = "+luasSegitiga.a*luasSegitiga.t/2);

        LuasPersegiPanjang luasPersegiPanjang = new LuasPersegiPanjang();
        System.out.println("L.Persegi Panjang = "+luasPersegiPanjang.panjang*luasPersegiPanjang.lebar);

        KelilingPersegi kelilingPersegi = new KelilingPersegi();
        System.out.println("Keliling Persegi = " +kelilingPersegi.sisi*4);

        KelilingSegitiga kelilingSegitiga = new KelilingSegitiga();
        System.out.println("Keliling Segitiga = "+(luasSegitiga.a+luasSegitiga.t+kelilingSegitiga.c));

        KelilingPersegiPanjang kelilingPersegiPanjang = new KelilingPersegiPanjang();
        System.out.println("Keliling Persegi Panjang = "+(2*(luasPersegiPanjang.panjang+luasPersegiPanjang.lebar)));


    }
}

import java.util.Scanner;

class Kalkulator{
    int a, b;
    Kalkulator(int a, int b){
        this.a = a;
        this.b = b;
    }
    int tambah(){return a+b;}
    int kurang(){return a-b;}
    int kali(){return a*b;}
    int bagi(){return a/b;}

}
public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka pertama : ");
        int a = scanner.nextInt();
        System.out.println("Masukkan angka kedua : ");
        int b = scanner.nextInt();
        System.out.println("Masukkan operasi bilangan (+,-,*,/) : ");
        String operasi=scanner.next();
        int c=0;
        Kalkulator kalkulator = new Kalkulator(a,b);
        switch (operasi){
            case "+": c=kalkulator.tambah(); break;
            case "-": c=kalkulator.kurang(); break;
            case "*": c=kalkulator.kali(); break;
            case "/": c=kalkulator.bagi(); break;
            default:
                System.out.println("Invalid operation code!!!");
        }
        System.out.println(a + operasi + b + "=" + c);



    }
}

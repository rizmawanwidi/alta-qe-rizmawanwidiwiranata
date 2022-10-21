import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        int bilangan;

        System.out.println("Masukkan Angka");
        Scanner r=new Scanner(System.in);
        bilangan=r.nextInt();

        for (int i=1; i<=bilangan; i++)
        {
            if (bilangan%i==0){
                System.out.println(i+" ");
            }
        }

    }
}

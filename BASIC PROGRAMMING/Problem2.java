public class Problem2 {
    public static void main(String[] args) {
        int studentScore = 12;
        if (studentScore >= 80){
            System.out.println("Nilai anda A");
        } else if (studentScore >=65 && studentScore <=79){
            System.out.println("Nilai anda B+");
        } else if (studentScore >50 && studentScore <=64){
            System.out.println("Nilai anda B");
        } else if (studentScore >=35 && studentScore<=49){
            System.out.println("Nilai anda C");
        }else {
            System.out.println("Nilai anda D");
        }
    }
}

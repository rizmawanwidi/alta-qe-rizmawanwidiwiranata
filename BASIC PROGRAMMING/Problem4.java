public class Problem4 {
    private static boolean primeNumber(int number) {
        if (number < 2) return false;
        else if (number == 2) return true;
        else if (number % 2 == 0) return false;
        else {
            int limit = (int) Math.sqrt(number);
            for (int divisor = 3; divisor <= limit; divisor += 2) {
                if (number % divisor == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        System.out.println(primeNumber(11)); //true
        System.out.println(primeNumber(13)); //true
        System.out.println(primeNumber(17)); //true
        System.out.println(primeNumber(20)); //false
        System.out.println(primeNumber(35)); //false
    }
}

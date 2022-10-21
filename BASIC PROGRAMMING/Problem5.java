public class Problem5 {
    private static boolean palindrome(String value){
        for (int i = 0; i < value.length(); i++){
            int indexAwal = i;
            int indexAkhir = value.length() - i -1;

            if (value.charAt(indexAwal) != value.charAt(indexAkhir)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("civic")); //true
        System.out.println(palindrome("katak")); //true
        System.out.println(palindrome("kasur rusak")); //true
        System.out.println(palindrome("kupu-kupu")); //false
        System.out.println(palindrome("lion")); //false
    }
}

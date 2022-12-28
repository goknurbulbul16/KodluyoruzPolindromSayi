public class Main {
    public static void main(String[] args) {

      isPalindrom(7474);
    }

    static boolean isPalindrom(int number){
        int temp = number, reversNumber = 0, lastNumber;
        while(temp != 0){
            lastNumber = temp % 10;
            reversNumber = (reversNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reversNumber) {
            System.out.println(number+ " palindrom sayıdır.");
            return true;

        }
        else {
            System.out.println(number + " palindrom sayı değildir.");
            return false;
        }
    }
}
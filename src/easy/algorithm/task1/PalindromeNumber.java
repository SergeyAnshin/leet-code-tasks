package easy.algorithm.task1;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        return String.valueOf(x)
                .contentEquals(new StringBuilder().append(x).reverse());
    }

    public boolean isPalindromeBestSolution(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }
}

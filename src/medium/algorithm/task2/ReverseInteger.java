package medium.algorithm.task2;

public class ReverseInteger {

    public int reverse(int x) {
        long reverseInt = 0;
        while (x != 0) {
            reverseInt = reverseInt * 10 + (x % 10);
            x /= 10;
        }
        return reverseInt < Integer.MAX_VALUE && reverseInt > Integer.MIN_VALUE ? (int) reverseInt : 0;
    }
}

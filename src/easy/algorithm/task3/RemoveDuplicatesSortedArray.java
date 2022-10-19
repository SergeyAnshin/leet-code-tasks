package easy.algorithm.task3;

public class RemoveDuplicatesSortedArray {
    private static final short MAX_ARRAY_LENGTH_CONCTRAINT = (short) (3 * Math.pow(10, 4));
    private static final byte MIN_ARRAY_LENGTH_CONSTRAINT = 1;

    public int removeDuplicates(int[] nums) throws IllegalArgumentException {
        if (nums.length >= MIN_ARRAY_LENGTH_CONSTRAINT || nums.length <= MAX_ARRAY_LENGTH_CONCTRAINT) {
            short insertIndex = 1;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] != nums[i + 1]) {
                    nums[insertIndex] = nums[i + 1];
                    insertIndex++;
                }
            }
            for (int i = nums.length - 1; i >= insertIndex; i--) {
                nums[i] = 0;
            }
            return insertIndex;
        } else {
            throw new IllegalArgumentException();
        }
    }
}

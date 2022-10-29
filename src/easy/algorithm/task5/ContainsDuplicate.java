package easy.algorithm.task5;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    private Map<Integer, Object> uniqueNumbers = new HashMap<>();

    public boolean containsDuplicate(int[] nums) {
        for (int num : nums) {
            if (uniqueNumbers.containsKey(num)) {
                return true;
            } else {
                uniqueNumbers.put(num, null);
            }
        }
        return false;
    }
}

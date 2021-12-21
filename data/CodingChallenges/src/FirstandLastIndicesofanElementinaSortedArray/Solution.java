package FirstandLastIndicesofanElementinaSortedArray;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public Solution() {}

    public List<Integer> getRange(int[] array, int target) {
        List<Integer> solution = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
               solution.add(i);

            }

        }
        int first = solution.get(0);
        int last = solution.get(solution.size() - 1);
        List<Integer> finalsolution = new ArrayList<>();
        finalsolution.add(first);
        finalsolution.add(last);

        return finalsolution;

    }

    public static void main(String[] args) {
        int[] testarray1 = new int[]{1,3,3,5,7,8,9,9,9,15};
        Solution case1 = new Solution();
        System.out.println(case1.getRange(testarray1, 9));
    }
}

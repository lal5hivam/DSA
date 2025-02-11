import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> hashmap = new HashMap<>();
        int[] output = new int[nums1.length];

        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty()) {
                if (stack.peek() > nums2[i]) {
                    hashmap.put(nums2[i], stack.peek());
                    stack.push(nums2[i]);
                    break;
                } else {
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                hashmap.put(nums2[i], -1);
                stack.push(nums2[i]);
            }
        }

        for (int i = 0; i < nums1.length; i++) {
            output[i] = hashmap.get(nums1[i]);
        }

        return output;
    }
}

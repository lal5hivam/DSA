import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Wriute your code here.
      int[] ans = new int[2];
      ans[0] = findFloor(a, x);
      ans[1] = findCeil(a, x);
      return ans;
    }
    public static int findFloor(int[] a, int x) {
        int l = 0, r = a.length - 1;
        int floor = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (a[mid] == x) {
                return a[mid];
            } else if (a[mid] < x) {
                floor = a[mid];
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return floor;
    }

    public static int findCeil(int[] a, int x) {
        int l = 0, r = a.length - 1;
        int ceil = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (a[mid] == x) {
                return a[mid];
            } else if (a[mid] < x) {
                l = mid + 1;
            } else {
                ceil = a[mid];
                r = mid - 1;
            }
        }
        return ceil;
    }
}

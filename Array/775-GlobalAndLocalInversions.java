// https://www.youtube.com/watch?v=vFH3zrUbvD4
// 775
class Solution {
    public boolean isIdealPermutation(int[] A) {
        int max = -1;
        for (int i = 0; i < A.length - 2; i++) {
            max = Math.max(A[i], max);
            if (max > A[i + 2]) return false;
        }
        return true;
    }
}
package 数组.time_8_18;

/**leetcode941有效的山脉数组
 * @author Cheneyzhang2018@gmail.com
 * @date 2020/8/18 17:31-17:48
 */
public class NO_lc941有效的山脉数组 {
    public boolean validMountainArray(int[] A) {
        int N = A.length;
        int i = 0;
        while (i + 1 < N && A[i] < A[i + 1]){
            i++;
        }
        if (i == 0 || i == N - 1) return false;
        while (i < N - 1 && A[i] > A[i + 1]){
            i++;
        }return i == N - 1;
    }
}

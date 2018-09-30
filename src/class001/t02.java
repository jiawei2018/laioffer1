package class001;

public class t02 {
    /**
     * Given a target integer T,
     * a non-negative integer K and an integer array A sorted in ascending order,
     * find the K closest numbers to T in A.
     *
     * Assumptions
     *
     * A is not null
     * K is guranteed to be >= 0 and K is guranteed to be <= A.length
     * Return
     *
     * A size K integer array containing the K closest numbers(not indices) in A,
     * sorted in ascending order by the difference between the number and T.
     * Examples
     *
     * A = {1, 2, 3}, T = 2, K = 3, return {2, 1, 3} or {2, 3, 1}
     * A = {1, 4, 6, 8}, T = 3, K = 3, return {4, 1, 6}
     *
     * @param array
     * @param target
     * @param k
     * @return
     */
    public int[] kClosest(int[] array, int target, int k) {
        // Write your solution here
        if(k > array.length)return array;
        int[] res = new  int[k];
        if(k == 0 ) return res;
        int left = 0;
        int right = array.length -1;

        while(left < right - 1){
            int mid =  left + (right - left) /2;
            if(array[mid] == target){
                right = mid;
            }else if (array[mid] < target){
                left = mid;
            }else
                right = mid ;
        }

        int idx = 0;
        while(idx < k){
            if(left  >= 0 && right <= array.length -1 && Math.abs(array[left] - target) < Math.abs(array[right] - target)){
                res[idx++] = array[left--];
            }else if(left  >= 0 && right <= array.length -1 && Math.abs(array[left] - target) > Math.abs(array[right] - target)){
                res[idx++] = array[right++];
            }else
                res[idx++] = left < 0 ? array[right++] : array[left--];
        }
        return res;
    }

    public static void main(String[] args){
        int[] in = {1,4,4,6,9,9,12,15};
        int t =   2;
        int k =  3;

        t02 tss = new t02();
        tss.kClosest(in,t,k);

    }
}

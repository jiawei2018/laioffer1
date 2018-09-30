package class001;

public class kthInTwoSortedArray {


    private int kth(int[] a, int[] b, int aleft, int bleft, int k){

        //base case
        if(aleft > a.length) return b[bleft + k -1];
        if(bleft > b.length) return a[aleft + k -1];

        if( k == 1) return  Math.min(a[aleft], b[bleft]);

        int amid = aleft + k / 2 - 1;
        int bmid = bleft + k / 2 - 1;

        int valA = amid >= a.length ? Integer.MAX_VALUE : a[amid];
        int valB = bmid >= b.length ? Integer.MAX_VALUE : b[bmid];

        if(valA <= valB){
            return kth(a, b, amid + 1, bleft, k - k / 2);
        }else{
            return kth(a, b, aleft, bmid + 1, k - k / 2);
        }


    }
}

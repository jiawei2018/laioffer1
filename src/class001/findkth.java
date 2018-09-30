package class001;

public class findkth {

    //find the kth smallest ele in two sorted arrays. using binary search
    private int findkth(int[] a, int aleft, int[] b, int bleft ,int k){
        if(aleft > a.length){
            return b[bleft + k - 1];
        }
        if(bleft > b.length){
            return a[aleft + k - 1];
        }

        if(k == 1){
            return Math.min(a[aleft], b[bleft]);
        }

        int amid = aleft + k /2 - 1;
        int bmid = bleft + k /2 -1;

        int aval = amid >= a.length ? Integer.MAX_VALUE: a[amid];
        int bval = bmid >= b.length ? Integer.MAX_VALUE: b[bmid];

        if(aval < bval){
            return findkth(a, amid + 1, b, bleft, k- k/2);
        }else{
            return findkth(a, aleft, b, bmid + 1,k - k/2);
        }
    }
}

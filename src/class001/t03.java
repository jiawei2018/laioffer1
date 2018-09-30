package class001;

public class t03 {

    private int te(){
//        // Write your solution here
//        // Write your solution here
//        if(dict.get(0) == null ) return -1;
//        if(dict.get(1) == null ) return dict.get(0) == target ? 0: -1;
//        int idx = 1;
//        while(dict.get(idx) != null) {
//            idx *= 2;
//        }
//
//            int left = 0
//        int right = 1;
//          while(dict.get(right) != null && target > dict.get(right)){
//                right *= 2;
//      }
//
//        while(left <= right){
//            int mid = left + (right- left) /2;
//            if(dict.get(mid) == target) {
//                return mid;
//            }else if (dict.get(mid) < target){
//                left = mid + 1;
//            }else
//                right = mid -1;
//        }
         return -1;
    }

    /**
     *     // Write your solution here
     *     if(dict.get(0) == null ) return -1;
     *     if(dict.get(1) == null ) return dict.get(0) == target ? 0: -1;
     *     int left = 0;
     *     int right = 1;
     *     while(dict.get(right) != null && dict.get(right) < target) {//swap to extend area
     *       left = right;
     *       right *= 2;
     *     }
     *
     *     while(left <= right){
     *       int mid = left + (right- left) /2;
     *       if(dict.get(mid) == null || dict.get(mid) > target) {//this is important
     *         right = mid - 1;
     *       }else if (dict.get(mid) < target){
     *         left = mid + 1;
     *       }else
     *         return mid;
     *       }
     *     return -1;
     */
}

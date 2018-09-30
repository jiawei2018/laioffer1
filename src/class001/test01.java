package class001;

public class test01 {
    public int closest(int[] array, int target) {
        // Write your solution here
        if (array == null || array.length == 0) return -1;
        if (array.length == 1) return 0;
        int left = 0;
        int right = array.length - 1;
        while(left <= right   ){//此题必须如此做???
            int tmpl = left, tmpr = right;
            int mid = left + (right - left) / 2;
            if(array[mid] == target) {
                return mid;
            }else if (array[mid] < target) {
                left = mid  ;
            }else
                right = mid  ;

            if(left == tmpl && right == tmpr) break;
        }
        if(Math.abs(array[left] - target) < Math.abs(array[right] - target)){
            return left;
        }else
            return right;
    }



    public int firstOccur(int[] array, int target) {
        // Write your solution here
        if(array == null || array.length == 0 ) return -1;
        if(array.length == 1 ){
            return array[0] == target ? 0: -1;
        }
        int left = 0;

        int right = array.length - 1;

        while(left <  right -1){//当进不去循环时候说明左右是相邻的 即 left= right-1;
            int mid = left +(right - left) / 2;
            if(array[mid] == target){
                right = mid;
            }else if(array[mid] < target){
                left = mid + 1;
            }else
                right = mid - 1;
        }

        if(array[left] == target) return left;
        if(array[right] == target) return right;
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,2,6,8};
        test01 t = new test01();
        System.out.println(t.firstOccur(arr,1));
    }
}

package class002sort;

/**
 * Given an array of balls, where the color of the balls can only be Red,
 * Green or Blue, sort the balls such that all the Red balls are grouped on the left side,
 * all the Green balls are grouped in the middle and all the Blue balls are grouped on the right side.
 * (Red is denoted by -1, Green is denoted by 0, and Blue is denoted by 1).
 *
 * Examples
 *
 * {0} is sorted to {0}
 * {1, 0} is sorted to {0, 1}
 * {1, 0, 1, -1, 0} is sorted to {-1, 0, 0, 1, 1}
 * Assumptions
 *
 * The input array is not null.
 * Corner Cases
 *
 * What if the input array is of length zero? In this case, we should not do anything as well.
 */
public class rainbowSort {
    public int[] rainbowSort(int[] array) {
        // Write your solution here
        if(array.length == 0){
            return array;
        }

        int left = 0;
        int right = array.length -1;
        int pointer = 0;

        while(pointer <= right){
            if(array[pointer] == -1){
                swap(array, left++, pointer++);
            }else if (array[pointer] == 0){
                pointer++;
            }else if(array[pointer] == 1){
                swap(array, pointer, right--);//mistake 不能pointer++ , 因为跟right交换过来的元素没有检查过!
            }
        }
        return array;

    }
    private void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
    public static void main(String[] args){
        int[] a = {1,1,0,-1,0,1,-1};
        rainbowSort t = new rainbowSort();
        t.rainbowSort(a);
    }

}

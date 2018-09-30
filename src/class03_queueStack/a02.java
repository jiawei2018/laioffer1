package class03_queueStack;

import java.util.LinkedList;

public class a02 {
    /**
     * Given one stack with integers, sort it with two additional stacks (total 3 stacks).
     *
     * After sorting the original stack should contain the sorted integers
     * and from top to bottom the integers are sorted in ascending order.
     *
     * Assumptions:
     *
     * The given stack is not null.
     * Requirements:
     *
     * No additional memory, time complexity = O(nlog(n)).
     * @param s1
     */
    public void sort(LinkedList<Integer> s1) {
        LinkedList<Integer> s2 = new LinkedList<Integer>();
        LinkedList<Integer> s3 = new LinkedList<Integer>();
        // Write your solution here.
        sort(s1, s2, s3,  s1.size());

    }


    private void sort(LinkedList<Integer> s1, LinkedList<Integer> s2, LinkedList<Integer> s3, int cursize){
        if(cursize <= 1) {
            return;
        }

        int mid = cursize / 2;

        for(int i = 0; i < mid; i++){
            s2.push(s1.pop());
        }


        sort(s1, s3, s2, left, mid);
        sort(s2, s3, s1, mid + 1, right);
        //merge(s1, s2, s3, left, mid ,right);

        int leftidx = left;
        int rightidx = mid + 1;
        int idx = 0;

        while(leftidx <= mid && rightidx <= right){
            if(nums[leftidx] < nums[rightidx]){
                temp[idx++] = nums[leftidx++];
            }else
                temp[idx++] = nums[rightidx++];
        }

        while(leftidx <= mid){
            temp[idx++] = nums[leftidx++];
        }
        while(rightidx <= right){
            temp[idx++] = nums[rightidx++];
        }

        for(int i = 0; i < idx; i++){
            nums[left++] = temp[i];
        }
    }


    private void oldsort(int[] nums, int[] temp, int left, int right){
//        if(left >= right){
//            return;
//        }
//        int mid = left + (right - left) / 2;
//        oldsort(nums, temp , left, mid);
//        oldsort(nums, temp, mid + 1, right);
//        oldmerge(nums, temp, left ,mid ,right);
    }


    private void oldmerge(int[] nums, int[] temp, int left, int mid , int right){
        int leftidx = left;
        int rightidx = mid + 1;
        int idx = 0;

        while(leftidx <= mid && rightidx <= right){
            if(nums[leftidx] < nums[rightidx]){
                temp[idx++] = nums[leftidx++];
            }else
                temp[idx++] = nums[rightidx++];
        }

        while(leftidx <= mid){
            temp[idx++] = nums[leftidx++];
        }
        while(rightidx <= right){
            temp[idx++] = nums[rightidx++];
        }

        for(int i = 0; i < idx; i++){
            nums[left++] = temp[i];
        }
    }





}

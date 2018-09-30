package class03_queueStack;

import java.util.Stack;

public class a03 {
    /**
     * Java: Implement a queue by using two stacks.
     * The queue should provide size(), isEmpty(), offer(), poll() and peek()
     * operations.
     * When the queue is empty, poll() and peek() should return null.
     *
     * C++: Implement a queue by using two stacks.
     * The queue should provide size(), isEmpty(), push(), front() and pop() operations.
     * When the queue is empty, front() should return -1.
     *
     * Assumptions
     *
     * The elements in the queue are all Integers.
     * size() should return the number of elements buffered in the queue.
     * isEmpty() should return true if there is no element buffered in the queue, false otherwise.
     */


    /**
     * input: offer(1),         peek(),size(),isEmpty(),            poll(),peek(),size(),isEmpty()
     * output: [null, 1, false, null, null, 0, true]
     *  expected:<[1, 1, false, 1, null, 0, true]> but was:<[null, 1, false, null, null, 0, true]>
     */


    public a03() {// solutions
        // Write your solution here.

    }
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();



    public Integer poll() {
        if(!st2.isEmpty()){
            return st2.pop();
        }else if(st2.isEmpty() && !st1.isEmpty()){
            fill(st1, st2);
            return st2.pop();
        }else
            return null;
    }

    private void fill(Stack<Integer> st1, Stack<Integer> st2){
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
    }

    public void offer(int element) {
        st1.push(element);
    }

    public Integer peek() {
        if(!st2.isEmpty()){
            return st2.peek();
        }else if(st2.isEmpty() && !st1.isEmpty()){
            fill(st1,st2);
            return st2.peek();
        }else

            return null;
    }

    public int size() {
        if(!st1.isEmpty() || !st2.isEmpty()){
            return st1.size() + st2.size();
        }
        return 0;
    }

    public boolean isEmpty() {
        if(st1.isEmpty() && st2.isEmpty()){
            return true;
        }
        return false;
    }

}

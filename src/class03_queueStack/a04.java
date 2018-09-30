package class03_queueStack;

import java.util.Stack;

/**
 * Enhance the stack implementation to support min() operation.
 * min() should return the current minimum value in the stack.
 * If the stack is empty, min() should return -1.
 *
 * pop() - remove and return the top element, if the stack is empty, return -1
 *
 * push(int element) - push the element to top
 * top() - return the top element without remove it, if the stack is empty, return -1
 * min() - return the current min value in the stack.
 */
public class a04 {
    public a04() {
        // write your solution here
    }
    Stack<Integer> st1 = new Stack<>();
    Stack<MyPair> st2 = new Stack<>();

    class MyPair{
        int v;
        int idx;
        MyPair(int val, int idxs){
             v = val;
             idx = idxs;
        }
    }

    public int pop() {
        if(!st1.isEmpty()){
            if(st2.peek().idx == st1.size()){
                st2.pop();
            }
            return st1.pop();
        }else
        return -1;
    }
        int min = 0;
    public void push(int element) {
        int tmp = element;
        st1.push(element);
        if(!st2.isEmpty()){
            int tmpmin = st2.peek().v;
            if(tmpmin > tmp){
                st2.push(new MyPair(tmp, st1.size()));
                min = tmp;
            }
        }else if(st2.isEmpty()){
            st2.push(new MyPair(tmp, st1.size()));
            min = tmp;
        }
    }

    public int top() {
        if(!st1.isEmpty()){
           // System.out.println(st1.peek());
            return st1.peek();
        }
        return -1;
    }

    public int min() {
        if (!st2.isEmpty()) {
            MyPair mypair = st2.peek();
            if (!st1.isEmpty() && st1.size() >= mypair.idx) {
                //System.out.println("min is " + st2.peek().v);
                return st2.peek().v;
            } else if (!st1.isEmpty() && st1.size() < mypair.idx) {
                st2.pop();
                return st2.peek().v;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        a04 t = new a04();
       // t.push(6);

       // System.out.println(t.top()) ;
      //  System.out.println(t.min());
//  ,top(),min(),pop(),     min(),top().min(),pop(),min()
        t.push(6);
        t.min();
        t.push(5);
        t.push(9);
        t.top();
        t.min();
        t.pop();//--9
        t.min();
        t.top();
        t.min();
        t.pop();
        t.min();


    }
}

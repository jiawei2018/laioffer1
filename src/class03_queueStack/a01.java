package class03_queueStack;

import java.util.LinkedList;

/**
 * Given an array that is initially stored in one stack, sort it with one additional stacks (total 2 stacks).
 * <p>
 * After sorting the original stack should contain the sorted integers
 * and from top to bottom the integers are sorted in ascending order.
 * <p>
 * Assumptions:
 * <p>
 * The given stack is not null.
 * Requirements:
 * <p>
 * No additional memory, time complexity = O(n ^ 2).
 */
public class a01 {
    public void sort(LinkedList<Integer> s1) {
        LinkedList<Integer> s2 = new LinkedList<Integer>();
        int size = s1.size();
        int max;
        int temp;
        while (size > 0) {//this is the key
            max = s1.pop();
            for (int i = 0; i < size - 1; i++) {
                temp = s1.pop();
                if (max < temp) {
                    s2.push(max);
                    max = temp;
                } else
                    s2.push(temp);
            }
            s1.push(max);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            size--;
        }


    }
}

/**
 * Stack<Integer> tmpStack = new Stack<Integer>();
 * while(!input.isEmpty())
 * {
 * // pop out the first element
 * int tmp = input.pop();
 * <p>
 * // while temporary stack is not empty and
 * // top of stack is greater than temp
 * while(!tmpStack.isEmpty() && tmpStack.peek()
 * > tmp)
 * {
 * // pop from temporary stack and
 * // push it to the input stack
 * input.push(tmpStack.pop());
 * }
 * <p>
 * // push temp in tempory of stack
 * tmpStack.push(tmp);
 * }
 * return tmpStack;
 */

package sword.easy;

import java.util.Stack;

/**
 * Created by tianguoxing on 2021/3/3 22:45.
 */
public class Sword09CQueue {
    class CQueue {
        private Stack stack1 = null;
        private Stack stack2 = null;
        public CQueue() {
            stack1 = new Stack();
            stack2 = new Stack();
        }

        public void appendTail(int value) {
            stack1.push(value);
        }

        public int deleteHead() {
            if(stack2.empty()){
                while (!stack1.empty())
                    stack2.push(stack1.pop());
            }
            return !stack2.empty() ? Integer.parseInt(stack2.pop().toString()) : -1;
        }
    }

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
}

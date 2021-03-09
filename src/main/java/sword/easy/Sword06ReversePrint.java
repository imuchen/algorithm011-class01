package sword.easy;

import java.util.Stack;

/**
 * Created by tianguoxing on 2021/3/2 22:19.
 */
public class Sword06ReversePrint {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int[] reversePrint(ListNode head) {
        Stack a = new Stack<Integer>();
        int count = 0;
        while(head.next != null){
            a.push(head.val);
            head=head.next;
            count++;
        }
        int[] r = new int[count];
        int index=0;
        while(!a.empty()){
            r[index++]=Integer.parseInt(a.pop().toString());
        }
        return r;
    }


    int[] z;
    int size = 0;
    int y = 0;

    public int[] reversePrint2(ListNode head) {
        recur(head);
        return z;
    }

    public void recur(ListNode head){
        if(head==null){
            z=new int[size];
            return;
        }
        size++;
        recur(head.next);
        z[y++]=head.val;
    }

    public static void main(String[] args) {

    }
}

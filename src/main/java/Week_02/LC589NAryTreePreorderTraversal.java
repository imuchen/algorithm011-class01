package Week_02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tianguoxing on 2020/7/5 12:34.
 */
public class LC589NAryTreePreorderTraversal {

    List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(null != root){
            dfs(root);
        }
        return list;
    }

    private void dfs(Node node){
        if(null != node){
            list.add(node.val);
            for(Node childNode:node.children) {
                dfs(childNode);
            }
        }
        return;
    }


    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}

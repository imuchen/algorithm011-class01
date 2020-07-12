package Week_03;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tianguoxing on 2020/7/12 12:52.
 */
public class LC105BuildTree {
    Map<Integer, Integer> inOrderMap = new HashMap<Integer, Integer>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int count = preorder.length;
        for (int i = 0; i < count; i++) {
            inOrderMap.put(inorder[i], i);
        }
        return myBuildTree(preorder, 0, count - 1, inOrderMap, 0, count - 1);
    }

    private TreeNode myBuildTree(int[] preorder, int preleft, int preright, Map<Integer, Integer> inOrderMap, int inleft, int inright) {
        if (preleft > preright || inleft > inright) return null;
        int rootVal = preorder[preleft];
        int pindex = inOrderMap.get(rootVal);
        TreeNode treeNode = new TreeNode(rootVal);
        treeNode.left = myBuildTree(preorder, preleft + 1, pindex - inleft + preleft, inOrderMap, inleft, pindex - 1);
        treeNode.right = myBuildTree(preorder, pindex - inleft + preleft + 1, preright, inOrderMap, pindex + 1, inright);
        return treeNode;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

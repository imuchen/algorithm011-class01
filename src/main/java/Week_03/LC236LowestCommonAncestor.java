package Week_03;

/**
 * 从根节点出发，左子树和右子树分别包含p或q的节点（p和q均在左子树或右子树时，当前并非最近公共祖先）
 * <p>
 * Created by tianguoxing on 2020/7/11 16:02.
 */
public class LC236LowestCommonAncestor {
    TreeNode res = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        recur(root, p, q);
        return res;
    }


    /**
     *
     * @param cur
     * @param p
     * @param q
     * @return 返回true则继续递归
     */
    private boolean recur(TreeNode cur, TreeNode p, TreeNode q) {
        // terminator
        if (null != res || cur == null) {
            return false;
        }

        // drill down & process current level
        boolean lson = recur(cur.left, p, q);
        boolean rson = recur(cur.right, p, q);
        // 记录当前节点是否有可能成为最近公共祖先
        // 满足条件的节点为：左子树包含p或q && 右子树包含p或q || (当前节点==p || 当前节点==q）&& (左子树包含p或q || 右子树包含p或q)
        if (lson && rson || (cur.val == p.val || cur.val == q.val) && (lson || rson)) {
            res = cur;
        }

        // restore current status
        // 返回递归所需要的结果:当前节点子树是否包含p或q，是则继续递归，否则停止递归
        return lson || rson || cur.val == p.val || cur.val == q.val;
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

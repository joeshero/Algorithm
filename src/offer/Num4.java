package offer;

/**
 * Created by Joe
 * 重建二叉树
 */
public class Num4 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //思路：递归求解
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || pre.length == 0 || in == null || in.length == 0) {
            return null;
        }
        TreeNode node = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return node;
    }

    public TreeNode reConstructBinaryTree(int[] pre, int pl, int pr, int[] in, int il, int ir) {
        if (pl > pr || il > ir) {
            return null;
        }
        TreeNode root = new TreeNode(pre[pl]);

        for (int i = il; i <= ir; i++) {
            if (in[i] == pre[pl]) {
                root.left = reConstructBinaryTree(pre, pl + 1, pl + i - il, in, il, i - 1);
                root.right = reConstructBinaryTree(pre, pl + i + 1 - il, pr, in, i + 1, ir);
                break;
            }
        }
        return root;
    }
}

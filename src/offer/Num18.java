package offer;

/**
 * Created by Joe
 * 二叉树的镜像
 */
public class Num18 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    //自下而上递归
    public void Mirror1(TreeNode root) {
        if (root == null) {
            return;
        }

        Mirror1(root.left);
        Mirror1(root.right);
        swap(root);
    }

    public void swap(TreeNode node) {
        if (node.left == null || node.right == null) {
            return;
        }
        TreeNode p = node.left;
        node.left = node.right;
        node.right = p;
    }

    //自上而下递归
    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        swap(root);
        Mirror(root.left);
        Mirror(root.right);
    }



}

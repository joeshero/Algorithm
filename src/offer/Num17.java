package offer;

/**
 * Created by Joe
 * 树的子结构
 * 判断B是不是A的子结构
 */
public class Num17 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
        //都不为空才能判断
        if (root1 != null && root2 != null) {
            //如果根节点相等，依次比较每个节点
            if (root1.val == root2.val) {
                result = isTree1HavaTree2(root1, root2);
            }
            //如果不匹配，在左子树匹配
            if (!result) {
                result = HasSubtree(root1.left, root2);
            }
            //如果不匹配，在右子树匹配
            if (!result) {
                result = HasSubtree(root1.right, root2);
            }
        }
        return result;

    }

    private boolean isTree1HavaTree2(TreeNode node1, TreeNode node2) {
        //如果tree2遍历完了说明每个节点都符合，返回true
        //两个if顺序不能颠倒
        if (node2 == null) {
            return true;
        }
        //如果tree2没遍历完tree1遍历完了，说明不符合，返回false
        if (node1 == null) {
            return false;
        }
        //其中一个点没对上
        if (node1.val != node2.val) {
            return false;
        }
        return isTree1HavaTree2(node1.left, node2.left) && isTree1HavaTree2(node1.right, node2.right);
    }



}

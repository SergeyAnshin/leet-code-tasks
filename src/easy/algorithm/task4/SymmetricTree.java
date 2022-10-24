package easy.algorithm.task4;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        boolean result = false;
        if (root != null) {
            if (root.left == null && root.right == null) {
                result = true;
            } else {
                result = getResult(root.left, root.right);
            }
        }
        return result;
    }

    private boolean getResult(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode != null && rightNode != null && leftNode.val == rightNode.val) {
            return getResult(leftNode.left, rightNode.right) && getResult(leftNode.right, rightNode.left);
        } else {
            return leftNode == null && rightNode == null;
        }
    }
}

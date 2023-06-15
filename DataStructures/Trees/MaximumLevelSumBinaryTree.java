package DataStructures.Trees;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class MaximumLevelSumBinaryTree {
    public static int maxLevelSum(TreeNode root) {
        int maxLevel = 1;
        int maxSum = root.val;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int sum = 0;

            for(int i = 0; i<size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;

                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }

            if(sum > maxSum) {
                maxSum = sum;
                maxLevel = level;
            }
            level++;
        }
        return maxLevel;
    }
    public static void main(String[] args) {
        // Create the binary tree for the first example
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(7);
        root1.right = new TreeNode(0);
        root1.left.left = new TreeNode(7);
        root1.left.right = new TreeNode(-8);

        // Test the first example
        int level1 = maxLevelSum(root1);
        System.out.println("Level with maximum sum: " + level1); // Output: 2

        // Create the binary tree for the second example
        TreeNode root2 = new TreeNode(989);
        root2.right = new TreeNode(10250);
        root2.right.left = new TreeNode(98693);
        root2.right.right = new TreeNode(-89388);
        root2.right.right.left = new TreeNode(-32127);

        // Test the second example
        int level2 = maxLevelSum(root2);
        System.out.println("Level with maximum sum: " + level2); // Output: 2
    }
}

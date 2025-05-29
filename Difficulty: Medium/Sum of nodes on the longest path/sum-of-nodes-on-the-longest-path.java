/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
} */
class Solution {
    class Result{
        int maxLen=0;
        int maxSum=0;
    }
    public int sumOfLongRootToLeafPath(Node root) {
        // code here
        Result res = new Result();
        dfs(root,0,0,res);
        return res.maxSum;
    }
    public void dfs(Node node, int length, int sum, Result res){
        if(node==null){
            return;
        }
        length+=1;
        sum+=node.data;
        if(node.left==null&&node.right==null){
            if (length > res.maxLen) {
                res.maxLen = length;
                res.maxSum = sum;
            } else if (length == res.maxLen && sum > res.maxSum) {
                res.maxSum = sum;
            }
        }
        dfs(node.left,length,sum,res);
        dfs(node.right,length,sum,res);
    }
}
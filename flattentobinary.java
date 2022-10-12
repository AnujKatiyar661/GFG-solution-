
class Main
{
    static Node prev=null;
    public static void flatten(Node root)
    {
        //code here
         helper(root);
         prev=null;
    }
    public static void helper(Node root){
        if(root==null)return ;
        helper(root.right);
        helper(root.left);
        root.right=prev;
        root.left=null;
        prev=root;
    }
}
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeExample {
    JFrame f;

    TreeExample() {
        f = new JFrame("Tree Example");
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Programming Languages");
        DefaultMutableTreeNode c1 = new DefaultMutableTreeNode("C");
        DefaultMutableTreeNode c2 = new DefaultMutableTreeNode("C++");
        DefaultMutableTreeNode c3 = new DefaultMutableTreeNode("Java");
        DefaultMutableTreeNode c4 = new DefaultMutableTreeNode("Python");
        root.add(c1);
        root.add(c2);
        root.add(c3);
        root.add(c4);
        DefaultMutableTreeNode WebRoot = new DefaultMutableTreeNode("Web Languages");
        DefaultMutableTreeNode c5 = new DefaultMutableTreeNode("HTML");
        DefaultMutableTreeNode c6 = new DefaultMutableTreeNode("CSS");
        DefaultMutableTreeNode c7 = new DefaultMutableTreeNode("JavaScript");
        WebRoot.add(c5);
        WebRoot.add(c6);
        WebRoot.add(c7);
        root.add(WebRoot);
        JTree tree = new JTree(root);
        f.add(tree);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TreeExample();
    }
}
/*
 * package DataStrucTure.Tree;
 * 
 * ������Ĳ���
 * 
 * public class RBNode<T extends Comparable<T>> { boolean color; int key;
 * RBNode<T> left; RBNode<T> right; RBNode<T> parent;
 * 
 * public RBNode(boolean color, int key, RBNode<T> left, RBNode<T> right,
 * RBNode<T> parent) { this.key = key; this.color = color; this.parent = parent;
 * this.left = left; this.right = right;
 * 
 * }
 * 
 * public int getKey() { return key; }
 * 
 * public String toString() { return "" + key + (this.color == RED ? "R" : "B");
 * }
 * 
 * �������� 1.�ӽڵ�Ĳ��� 2.��P�ڵ���� 3.
 * 
 * private void leftRotate(RBNode<T> x) { RBNode<T> y = x.left; x.right =
 * y.left; if (y.left != null) { y.left.parent = x;// Node �������ӽڵ㣬���ӽڵ� }
 * x.parent.left = y; if (x.parent == null) {
 * 
 * } else { if (x == x.parent.left) x.parent.left = y;// ���x��p�����ӽڵ� else
 * x.parent.right = y; }
 * 
 * x.parent = y; y.left = y;
 * 
 * } public void rightRotate(RBNode<T> y) { RBNode<T> x=y.left; y.left=x.right;
 * if(x.right==null) { x.left.parent=y; } x.parent=y.parent; if(y.parent==null)
 * {
 * 
 * }else { if(y.parent.left==y) y.parent.left=x; else y.parent.right=x; }
 * y.parent=x; x.left=y; } }
 */
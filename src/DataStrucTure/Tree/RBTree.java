/*
 * package DataStrucTure.Tree;
 * 
 * public class RBTree<T extends Comparable<T>> { private RBNode<T> root;
 * 
 * private void leftRotate(RBNode<T> x) { RBNode<T> y = x.left; x.right =
 * y.left; if (y.left != null) { y.left.parent = x;// Node �������ӽڵ㣬���ӽڵ� }
 * x.parent.left = y; if (x.parent == null) { this.root = y; } else { if (x ==
 * x.parent.left) x.parent.left = y;// ���x��p�����ӽڵ� else x.parent.right = y;
 * }
 * 
 * x.parent = y; y.left = y;
 * 
 * }
 * 
 * public void rightRotate(RBNode<T> y) { RBNode<T> x = y.left; y.left =
 * x.right; if (x.right == null) { x.left.parent = y; } x.parent = y.parent; if
 * (y.parent == null) { this.root = x; } else { if (y.parent.left == y)
 * y.parent.left = x; else y.parent.right = x; } y.parent = x; x.left = y; }
 * 
 * // ���ڵ���뵽������У���������������������һ���� private void insert(RBNode<T>
 * node) { RBNode<T> current = null; // ��ʾ���node�ĸ��ڵ� RBNode<T> x =
 * this.root; // �������������õ�
 * 
 * // 1. �ҵ������λ�� while (x != null) { current = x; int cmp =
 * node.key.compareTo(x.key); if (cmp < 0) x = x.left; else x = x.right; }
 * node.parent = current; // �ҵ���λ�ã�����ǰcurrent��Ϊnode�ĸ��ڵ�
 * 
 * // 2. �������ж�node�ǲ������ӽڵ㻹�����ӽڵ� if (current != null) { int cmp =
 * node.key.compareTo(current.key); if (cmp < 0) current.left = node; else
 * current.right = node; } else { this.root = node; }
 * 
 * // 3. ������������Ϊһ�ź���� insertFixUp(node); } public void compareTo(int a)
 * {
 * 
 * }
 * 
 * }
 */
package DataStrucTure.Tree;

public class TwoTree {
	private Node root;

	public void TwoTree() {
		root = null;
	}

	public Node find(int key) {
		Node cur = root; // 从根节点开始查找

		if (cur == null) { // 如果树为空，直接返回null
			return null;
		}

		while (cur.age != key) {
			if (key < cur.age) {
				cur = cur.LeftChild;// 如果关键字比当前节点小，转向左子节点
			} else {
				cur = cur.RightChild;// 如果关键字比当前节点大，转向右子节点
			}

			if (cur == null) { // 没有找到结果，搜索结束
				return null;
			}
		}
		return cur;
	}

	// 插入新节点
	public void insert(Node node) {
		if (root == null) {
			root = node; // 如果树为空，则新插入的节点为根节点
		} else {
			Node cur = root;

			while (true) {
				if (node.age < cur.age) {
					if (cur.LeftChild == null) { // 找到了要插入节点的父节点
						cur.LeftChild = node;
						return;
					}
					cur = cur.LeftChild;
				} else {
					if (cur.RightChild == null) { // 找到了要插入节点的父节点
						cur.RightChild = node;
						return;
					}
					cur = cur.RightChild;
				}
			}
		}
	}

	// 删除指定节点
	public boolean delete(Node node) {
		if (root == null) {
			return false; // 如果为空树，直接返回false
		}

		boolean isLeftChild = true; // 记录目标节点是否为父节点的左子节点
		Node cur = root; // 要删除的节点
		Node parent = null; // 要删除节点的父节点

		while (cur.age != node.age) { // 确定要删除节点和它的父节点
			parent = cur;
			if (node.age < cur.age) { // 目标节点小于当前节点，跳转左子节点
				cur = cur.LeftChild;
			} else {// 目标节点大于当前节点，跳转右子节点
				isLeftChild = false;
				cur = cur.RightChild;
			}
			if (cur == null) {
				return false; // 没有找到要删除的节点
			}
		}

		if (cur.LeftChild == null && cur.RightChild == null) { // 目标节点为叶子节点（无子节点）
			if (cur == root) { // 要删除的为根节点
				root = null;
			} else if (isLeftChild) {
				// 要删除的不是根节点，则该节点肯定有父节点，该节点删除后，需要将父节点指向它的引用置空
				parent.LeftChild = null;
			} else {
				parent.RightChild = null;
			}
		} else if (cur.LeftChild == null) { // 只有一个右子节点
			if (cur == root) {
				root = cur.RightChild;
			} else if (isLeftChild) {
				parent.LeftChild = cur.RightChild;
			} else {
				parent.RightChild = cur.RightChild;
			}
		} else if (cur.RightChild == null) { // 只有一个左子节点
			if (cur == root) {
				root = cur.LeftChild;
			} else if (isLeftChild) {
				parent.LeftChild = cur.LeftChild;
			} else {
				parent.RightChild = cur.LeftChild;
			}
		} else { // 有两个子节点
					// 第一步要找到欲删除节点的后继节点
			Node successor = cur.RightChild;
			Node successorParent = null;
			while (successor.LeftChild != null) {
				successorParent = successor;
				successor = successor.LeftChild;
			}
			// 欲删除节点的右子节点就是它的后继，证明该后继无左子节点，则将以后继节点为根的子树上移即可
			if (successorParent == null) {
				if (cur == root) { // 要删除的为根节点，则将后继设置为根，且根的左子节点设置为欲删除节点的做左子节点
					root = successor;
					root.LeftChild = cur.LeftChild;
				} else if (isLeftChild) {
					parent.LeftChild = successor;
					successor.LeftChild = cur.LeftChild;
				} else {
					parent.RightChild = successor;
					successor.LeftChild = cur.LeftChild;
				}
			} else { // 欲删除节点的后继不是它的右子节点
				successorParent.LeftChild = successor.RightChild;
				successor.RightChild = cur.RightChild;
				if (cur == root) {
					root = successor;
					root.LeftChild = cur.LeftChild;
				} else if (isLeftChild) {
					parent.LeftChild = successor;
					successor.LeftChild = cur.LeftChild;
				} else {
					parent.RightChild = successor;
					successor.LeftChild = cur.LeftChild;
				}
			}
		}

		return true;
	}

	// 前序遍历
	public void perorder(Node currentroot) {
		if (currentroot != null) {
			System.out.print(currentroot.age);
			perorder(currentroot.LeftChild);
			perorder(currentroot.RightChild);
		}
	}

	// 中序遍历，这三种遍历都用了迭代的思想
	public void inorder(Node currentRoot) {
		if (currentRoot != null) {
			inorder(currentRoot.LeftChild); // 先对当前节点的左子树对进行中序遍历
			System.out.print(currentRoot.age + "\t"); // 然后访问当前节点
			inorder(currentRoot.RightChild); // 最后对当前节点的右子树对进行中序遍历
		}
	}

	// 后序遍历
	public void postorder(Node currentRoot) {
		if (currentRoot != null) {
			postorder(currentRoot.LeftChild);
			postorder(currentRoot.RightChild);
			System.out.print(currentRoot.age + "\t");
		}
	}

	private int getDepth(Node currentroot, int inidepth) {
		int depth = inidepth;
		int rigdepth, lefdepth;
		if (currentroot != null) {
			lefdepth = getDepth(currentroot, depth);
			currentroot = currentroot.LeftChild;
		}
		return inidepth;

	}

	// 返回关键值最大的节点
	public Node getMax() {
		if (isEmpty()) {
			return null;
		}
		Node cur = root;
		while (cur.RightChild != null) {
			cur = cur.RightChild;
		}
		return cur;
	}

	// 返回关键值最小的节点
	public Node getMin() {
		if (isEmpty()) {
			return null;
		}
		Node cur = root;
		while (cur.LeftChild != null) {
			cur = cur.LeftChild;
		}
		return cur;
	}

	// 判空
	public boolean isEmpty() {
		return (root == null);
	}

	public static void main(String[] args) {

	}

}

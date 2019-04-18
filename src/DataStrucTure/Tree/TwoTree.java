package DataStrucTure.Tree;

public class TwoTree {
	private Node root;

	public void TwoTree() {
		root = null;
	}

	public Node find(int key) {
		Node cur = root; // �Ӹ��ڵ㿪ʼ����

		if (cur == null) { // �����Ϊ�գ�ֱ�ӷ���null
			return null;
		}

		while (cur.age != key) {
			if (key < cur.age) {
				cur = cur.LeftChild;// ����ؼ��ֱȵ�ǰ�ڵ�С��ת�����ӽڵ�
			} else {
				cur = cur.RightChild;// ����ؼ��ֱȵ�ǰ�ڵ��ת�����ӽڵ�
			}

			if (cur == null) { // û���ҵ��������������
				return null;
			}
		}
		return cur;
	}

	// �����½ڵ�
	public void insert(Node node) {
		if (root == null) {
			root = node; // �����Ϊ�գ����²���Ľڵ�Ϊ���ڵ�
		} else {
			Node cur = root;

			while (true) {
				if (node.age < cur.age) {
					if (cur.LeftChild == null) { // �ҵ���Ҫ����ڵ�ĸ��ڵ�
						cur.LeftChild = node;
						return;
					}
					cur = cur.LeftChild;
				} else {
					if (cur.RightChild == null) { // �ҵ���Ҫ����ڵ�ĸ��ڵ�
						cur.RightChild = node;
						return;
					}
					cur = cur.RightChild;
				}
			}
		}
	}

	// ɾ��ָ���ڵ�
	public boolean delete(Node node) {
		if (root == null) {
			return false; // ���Ϊ������ֱ�ӷ���false
		}

		boolean isLeftChild = true; // ��¼Ŀ��ڵ��Ƿ�Ϊ���ڵ�����ӽڵ�
		Node cur = root; // Ҫɾ���Ľڵ�
		Node parent = null; // Ҫɾ���ڵ�ĸ��ڵ�

		while (cur.age != node.age) { // ȷ��Ҫɾ���ڵ�����ĸ��ڵ�
			parent = cur;
			if (node.age < cur.age) { // Ŀ��ڵ�С�ڵ�ǰ�ڵ㣬��ת���ӽڵ�
				cur = cur.LeftChild;
			} else {// Ŀ��ڵ���ڵ�ǰ�ڵ㣬��ת���ӽڵ�
				isLeftChild = false;
				cur = cur.RightChild;
			}
			if (cur == null) {
				return false; // û���ҵ�Ҫɾ���Ľڵ�
			}
		}

		if (cur.LeftChild == null && cur.RightChild == null) { // Ŀ��ڵ�ΪҶ�ӽڵ㣨���ӽڵ㣩
			if (cur == root) { // Ҫɾ����Ϊ���ڵ�
				root = null;
			} else if (isLeftChild) {
				// Ҫɾ���Ĳ��Ǹ��ڵ㣬��ýڵ�϶��и��ڵ㣬�ýڵ�ɾ������Ҫ�����ڵ�ָ�����������ÿ�
				parent.LeftChild = null;
			} else {
				parent.RightChild = null;
			}
		} else if (cur.LeftChild == null) { // ֻ��һ�����ӽڵ�
			if (cur == root) {
				root = cur.RightChild;
			} else if (isLeftChild) {
				parent.LeftChild = cur.RightChild;
			} else {
				parent.RightChild = cur.RightChild;
			}
		} else if (cur.RightChild == null) { // ֻ��һ�����ӽڵ�
			if (cur == root) {
				root = cur.LeftChild;
			} else if (isLeftChild) {
				parent.LeftChild = cur.LeftChild;
			} else {
				parent.RightChild = cur.LeftChild;
			}
		} else { // �������ӽڵ�
					// ��һ��Ҫ�ҵ���ɾ���ڵ�ĺ�̽ڵ�
			Node successor = cur.RightChild;
			Node successorParent = null;
			while (successor.LeftChild != null) {
				successorParent = successor;
				successor = successor.LeftChild;
			}
			// ��ɾ���ڵ�����ӽڵ�������ĺ�̣�֤���ú�������ӽڵ㣬���Ժ�̽ڵ�Ϊ�����������Ƽ���
			if (successorParent == null) {
				if (cur == root) { // Ҫɾ����Ϊ���ڵ㣬�򽫺������Ϊ�����Ҹ������ӽڵ�����Ϊ��ɾ���ڵ�������ӽڵ�
					root = successor;
					root.LeftChild = cur.LeftChild;
				} else if (isLeftChild) {
					parent.LeftChild = successor;
					successor.LeftChild = cur.LeftChild;
				} else {
					parent.RightChild = successor;
					successor.LeftChild = cur.LeftChild;
				}
			} else { // ��ɾ���ڵ�ĺ�̲����������ӽڵ�
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

	// ǰ�����
	public void perorder(Node currentroot) {
		if (currentroot != null) {
			System.out.print(currentroot.age);
			perorder(currentroot.LeftChild);
			perorder(currentroot.RightChild);
		}
	}

	// ��������������ֱ��������˵�����˼��
	public void inorder(Node currentRoot) {
		if (currentRoot != null) {
			inorder(currentRoot.LeftChild); // �ȶԵ�ǰ�ڵ���������Խ����������
			System.out.print(currentRoot.age + "\t"); // Ȼ����ʵ�ǰ�ڵ�
			inorder(currentRoot.RightChild); // ���Ե�ǰ�ڵ���������Խ����������
		}
	}

	// �������
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

	// ���عؼ�ֵ���Ľڵ�
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

	// ���عؼ�ֵ��С�Ľڵ�
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

	// �п�
	public boolean isEmpty() {
		return (root == null);
	}

	public static void main(String[] args) {

	}

}

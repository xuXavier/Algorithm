package DataStrucTure.Tree;

public class Node {
	int age;
	String name;
	Node LeftChild;
	Node RightChild;

	public Node(int age, String name) {
		this.age = age;
		this.name = name;
	}

	private void syso() {
		System.out.println("name" + name + "  age" + age);

	}
}

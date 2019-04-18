package zuosheng;

import java.util.LinkedList;
import java.util.Queue;

public class Test1 {
	private Queue<Integer> queue;
	private Queue<Integer> help;

	public Test1() {
		queue = new LinkedList<Integer>();
		help = new LinkedList<Integer>();
	}

	public void push(int pushInt) {
		queue.add(pushInt);
	}

	public int peek() {
		if (queue.isEmpty()) {
			throw new RuntimeException("Stack is empty!");
		}
		while (queue.size() != 1) {
			help.add(queue.poll());
		}
		int res = queue.poll();
		help.add(res);
		swap();
		return res;
	}

	public int pop() {
		if (queue.isEmpty()) {
			throw new RuntimeException("Stack is empty!");
		}
		while (queue.size() > 1) {
			help.add(queue.poll());
		}
		int res = queue.poll();
		swap();
		return res;
	}

	private void swap() {
		Queue<Integer> tmp = help;
		help = queue;
		queue = tmp;
	}


	public static void main(String[] args) {
		String s="abcdef";
		System.out.println(s.indexOf("cd"));
		String sj = null;
		System.out.println(s.substring(s.indexOf("cd"), s.indexOf("cd")+2));

	}

}

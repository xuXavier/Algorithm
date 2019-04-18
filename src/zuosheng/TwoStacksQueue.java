package zuosheng;

import java.util.Stack;

public class TwoStacksQueue {

		private Stack<Integer> stackPush;
		private Stack<Integer> stackPop;

		public TwoStacksQueue() {
			stackPush = new Stack<Integer>();
			stackPop = new Stack<Integer>();
		}

		public void push(int pushInt) {
			stackPush.push(pushInt);
		}

		public int poll() {
			if (stackPop.empty() && stackPush.empty()) {
				throw new RuntimeException("Queue is empty!");
			} else if (stackPop.empty()) {
				while (!stackPush.empty()) {
					stackPop.push(stackPush.pop());
				}
			}
			return stackPop.pop();
		}

		public int peek() {
			if (stackPop.empty() && stackPush.empty()) {
				throw new RuntimeException("Queue is empty!");
			} else if (stackPop.empty()) {
				while (!stackPush.empty()) {
					stackPop.push(stackPush.pop());
				}
			}
			return stackPop.peek();
		}
		public static void main(String[] args) {
			TwoStacksQueue stack1 = new TwoStacksQueue();
			stack1.push(3);
			System.out.println(stack1.peek());
			stack1.push(4);
			System.out.println(stack1.peek());
			System.out.println(stack1.poll());
			stack1.push(2);
			System.out.println(stack1.poll());



		}
	}


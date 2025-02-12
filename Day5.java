package training;
import java.util.Stack;

		class MinStack {
		    private Stack<Integer> stack = new Stack<>();
		    private Stack<Integer> minStack = new Stack<>();

		    public void push(int val) {
		        stack.push(val);
		        if (minStack.isEmpty() || val <= minStack.peek()) {
		            minStack.push(val);
		        }
		    }

		    public void pop() {
		        if (stack.isEmpty()) return;
		        int removed = stack.pop();
		        if (removed == minStack.peek()) {
		            minStack.pop();
		        }
		    }

		    public int top() {
		        return stack.peek();
		    }

		    public int getMin() {
		        return minStack.peek();
		    }
		

		
		    public static void main(String[] args) {
		        MinStack minStack = new MinStack();
		        minStack.push(5);
		        minStack.push(2);
		        minStack.push(8);
		        minStack.push(1);
		        
		        System.out.println("Minimum: " + minStack.getMin()); // Should print 1
		        minStack.pop();
		        System.out.println("Minimum after pop: " + minStack.getMin()); // Should print 2
		        System.out.println("Top Element: " + minStack.top()); // Should print 8
		    }
		}
	}

}

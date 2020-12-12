package stack.gayle;

public class Stack {
    private final int CAPACITY;
    private int top;
    private Integer[] data;

    public Stack(int capacity) {
	this.CAPACITY = capacity;
	data = new Integer[this.CAPACITY];
	top = -1;
    }

    public Integer push(int e) {
	if (top < (CAPACITY - 1)) {
	    data[++top] = e;
	    return top;
	}
	return -1;
    }

    public Integer pop() {
	return (top > -1) ? data[top--] : null;
    }

    public void disp() {
	System.out.println("\nSTACK: ");
	for (int i = top; i >= 0; i--) {
	    System.out.println(data[i] + ((i == top) ? " top" : ""));
	}
    }

    public static void main(String[] args) {
	Stack st = new Stack(5);
	st.push(20);
	st.push(30);
	// st.push(40);
	// System.out.println(st.push(70));
	System.out.println(st.pop());
	System.out.println(st.pop());
	System.out.println(st.pop());
	st.disp();
    }
}

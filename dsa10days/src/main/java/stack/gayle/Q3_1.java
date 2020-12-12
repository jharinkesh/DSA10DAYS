package stack.gayle;

/**
 * Describe how you could use a single array to implement three stacks.
 */
public class Q3_1 {
    public static void main(String[] args) {

    }
}

class TStack {
    private final int SIZE = 10;
    private int[] top = { -1, -1, -1 };
    private Integer[] data = new Integer[SIZE * 3];

    void push(int stackNumber, int e) {
	if (top[stackNumber] < SIZE * (stackNumber + 1) - 1) {
	    data[++top[stackNumber]] = e;
	}
    }

    int pop(int stackNumber) {
	// if(top[stackNumber])
	return 0;
    }

}

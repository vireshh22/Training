package DS.Stack;

public class NextGreater {

    int[] arr;
    int top;

    NextGreater(int size) {
        arr = new int[size];
        top = -1;
    }

    void push(int element) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        } else {
            top++;
            arr[top] = element;
        }
    }

    void pop() { // pops the last element not first
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            top--;
        }
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            // System.out.println(arr[top]);
            return arr[top];
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 10, 7, 5, 8, 6 };
        NextGreater obj = new NextGreater(arr.length);
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!obj.isEmpty() && arr[i] <= obj.peek()) {
                obj.push(arr[i]);
            }

            if (obj.isEmpty()) {
                arr[i] = -1;
            } else {
                arr[i] = obj.peek();
            }
            obj.push(arr[i]);

        }

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Answer: " + sum);

    }
}

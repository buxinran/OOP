package lab08_Q4;

import java.util.LinkedList;

public class MyStack<T> {
    private LinkedList<T> values = new LinkedList<T>();

    public void push(T t) {
        values.add(t);
    }

    public T pop() {
        return values.removeLast();
    }

    public T top() {
        return values.getFirst();
    }

    public static void main(String[] args) {
        /* Your test code here */
        MyStack<String> stack = new MyStack<String>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        System.out.println(stack.pop());
        System.out.println(stack.top());

    }
}

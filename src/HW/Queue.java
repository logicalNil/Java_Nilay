package HW;

public class Queue<T> {
    private class LinkedListNode<T> {
        private T data;
        private LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        return true;
    }

    public T poll() {
        return null;
    }

    public void offer(T ints) {

    }
}

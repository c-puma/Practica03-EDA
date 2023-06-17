package Map;
import java.util.*;

public class PriorityQueueHeap <T extends Comparable<T>>{

	private Map<QueueElement<T>> heap;

    public PriorityQueueHeap() {
        this.heap = new Map<QueueElement<T>>();
    }

    public void enqueue(T element, int priority) {
        QueueElement<T> queueElement = new QueueElement<>(element, priority);
        heap.insert(queueElement);
    }

    public T dequeue() {
        QueueElement<T> queueElement = heap.remove();
        return queueElement.getElement();
    }

    public T front() {
        QueueElement<T> queueElement = heap.cima();
        return queueElement.getElement();
    }

    public T back() { // me da error
        int lastIndex = heap.size() - 1;
        QueueElement<T> queueElement = heap.get(lastIndex);
        return queueElement.getElement();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }
 
}


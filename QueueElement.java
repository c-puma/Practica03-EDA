package Map;

public class QueueElement<T> implements Comparable<QueueElement<T>> {

	private T element;
    private int priority;

    public QueueElement(T element, int priority) {
        this.element = element;
        this.priority = priority;
    }

    public T getElement() {
        return element;
    }

    public int getPriority() {
        return priority;
    }

    public int compareTo(QueueElement<T> other) {//falta implementar bien
        return Integer.compare(priority, other.getPriority());
    }

	@Override
	public String toString() {
		return "QueueElement [element=" + element + ", priority=" + priority + "]";
	}
    

}

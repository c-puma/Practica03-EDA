package Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*QueueElement<Integer> e1 = new QueueElement<Integer>(15,5);
		QueueElement<Integer> e2 = new QueueElement<Integer>(152,24);
		QueueElement<Integer> e3 = new QueueElement<Integer>(185,51);
		QueueElement<Integer> e4 = new QueueElement<Integer>(115,30);
		QueueElement<Integer> e5 = new QueueElement<Integer>(111,12);
		QueueElement<Integer> e6 = new QueueElement<Integer>(150,4);
		QueueElement<Integer> e7 = new QueueElement<Integer>(1,8);
		
		PriorityQueueHeap testeando = new PriorityQueueHeap();
		
		testeando.enqueue(e1,0);
		testeando.enqueue(e2,1);
		testeando.enqueue(e3,2);
		testeando.enqueue(e4,3);
		testeando.enqueue(e5,11);
		testeando.enqueue(e6,10);
		testeando.enqueue(e7,15);
		
		System.out.println(testeando.dequeue());
		System.out.println(testeando.dequeue());
		System.out.println(testeando.dequeue());
		System.out.println(testeando.dequeue());
		System.out.println(testeando.dequeue());*/
		PriorityQueueHeap<Integer> priorityQueue = new PriorityQueueHeap<>();
		priorityQueue.enqueue(5, 2);
		priorityQueue.enqueue(10, 1);
		priorityQueue.enqueue(14, 13);
		priorityQueue.enqueue(30, 30);
		priorityQueue.enqueue(3, 3);
		//System.out.println(testeando);
		System.out.println(priorityQueue.dequeue());
		System.out.println(priorityQueue.dequeue());
	}

}

import java.util.LinkedList;

public class QueueApplication 
{
	public static void main(String [] args)
	{
		Queue<String> myQueue = new Queue<>();
		
		myQueue.enqueue("Jane");
		myQueue.enqueue("Jess");
		myQueue.enqueue("Jill");
		myQueue.enqueue(myQueue.dequeue());
		myQueue.enqueue(myQueue.getFront());
		myQueue.enqueue("Jim");
		String name = myQueue.dequeue();
		myQueue.enqueue(myQueue.getFront());
		
		System.out.println("Exercise 3");
		Object[] array = myQueue.toArray();
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		
		System.out.println();
		System.out.println();
		
		Queue<String> myDeque = new Queue<>();
		
		myDeque.addToFront("Jim");
		myDeque.addToFront("Jess");
		myDeque.addToBack("jill");
		myDeque.addToBack("Jane");
		name = myDeque.removeFront();
		myDeque.addToBack(name);
		myDeque.addToBack(myDeque.getFront());
		myDeque.addToFront(myDeque.removeBack());
		myDeque.addToFront(myDeque.getBack());
		
		System.out.println("Exercise 4");
		array = myDeque.toArray();
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		
		System.out.println();
		System.out.println();
		
		Queue<String> myPriorityQueue = new Queue<>();
		
		myPriorityQueue.add("Jim");
		myPriorityQueue.add("Jess");
		myPriorityQueue.add("Jill");
		myPriorityQueue.add("Jane");
		name = myPriorityQueue.remove();
		myPriorityQueue.add(name);
		myPriorityQueue.add(myPriorityQueue.getFront());
		myPriorityQueue.add("Jim");
		myPriorityQueue.remove();
		
		System.out.println("Exercise 5");
		array = myPriorityQueue.toArray();
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
}

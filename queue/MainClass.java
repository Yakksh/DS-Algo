package queue;

public class MainClass {

	public static void main(String[] args) {

		MyQueue<Integer> mq = new MyQueue<>();
<<<<<<< HEAD

=======
		
>>>>>>> 24de017... Initial commit
		mq.enqueue(12);
		mq.enqueue(2);
		mq.enqueue(123);
		mq.enqueue(45);
<<<<<<< HEAD

=======
		
		
>>>>>>> 24de017... Initial commit
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
<<<<<<< HEAD

		mq.enqueue(451);
		System.out.println(mq.dequeue());

=======
		
		mq.enqueue(451);
		System.out.println(mq.dequeue());
		
		
>>>>>>> 24de017... Initial commit
	}

}

package cn.edu.ntu.thread;

/**
 * @author Administrator
 *
 */
public class ThreadTest {

	public static void main(String[] args) {

		Storage storage = new Storage(30);
		Producer p1 = new Producer(5, storage);
		Producer p2 = new Producer(15, storage);
		Producer p3 = new Producer(20, storage);
		Customer c1 = new Customer(10, storage);
		Customer c2 = new Customer(10, storage);
		Customer c3 = new Customer(10, storage);
		Customer c4 = new Customer(10, storage);
		Customer c5 = new Customer(10, storage);
		
		p1.start();
		p2.start();
		p3.start();
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
	}

}

package cn.edu.ntu.thread;

public class Customer extends Thread {

	/**
	 * ��������
	 */
	private int cusNum;
	/**
	 * �ֿ�
	 */
	private Storage storage;
	
	public Customer(int cusNum, Storage storage){
		this.cusNum = cusNum;
		this.storage = storage;
	}
	
	public void run(){
		storage.custom(cusNum);
	}
	
}

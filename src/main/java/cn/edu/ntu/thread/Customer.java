package cn.edu.ntu.thread;

public class Customer extends Thread {

	/**
	 * 消费数量
	 */
	private int cusNum;
	/**
	 * 仓库
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

package cn.edu.ntu.thread;

public class Producer extends Thread {

	/**
	 * 生产的数量
	 */
	private int proNum;
	/**
	 * 仓库
	 */
	private Storage storage;
	
	public Producer(int proNum, Storage storage){
		this.proNum = proNum;
		this.storage = storage;
	}
	
	public void run(){
		storage.produce(proNum);
	}
	
}

package cn.edu.ntu.thread;

public class Producer extends Thread {

	/**
	 * ����������
	 */
	private int proNum;
	/**
	 * �ֿ�
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

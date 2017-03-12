package cn.edu.ntu.thread;

public class Storage {

	/**
	 * 最大存储量
	 */
	private int maxCount = 100;
	/**
	 * 当前量
	 */
	private int curCount = 0;
	
	public Storage(){}
	
	public Storage(int curCount){
		this.curCount = curCount;
	}

	public synchronized void produce(int proNum) {
		//生产量+当前量>最大量     则等待，不生产
		if(proNum + curCount > maxCount){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		curCount += proNum;
		System.out.println("生产者生产了" +proNum+ "个馒头，当前库存为" + curCount + "个");
		notifyAll();
	}

	public synchronized void custom(int cusNum) {
		if(curCount < cusNum){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		curCount -= cusNum;
		System.out.println("消费者消费了" +cusNum+ "个馒头，当前库存为" + curCount + "个");
		notifyAll();
	}
	
}

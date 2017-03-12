package cn.edu.ntu.thread;

public class Storage {

	/**
	 * ���洢��
	 */
	private int maxCount = 100;
	/**
	 * ��ǰ��
	 */
	private int curCount = 0;
	
	public Storage(){}
	
	public Storage(int curCount){
		this.curCount = curCount;
	}

	public synchronized void produce(int proNum) {
		//������+��ǰ��>�����     ��ȴ���������
		if(proNum + curCount > maxCount){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		curCount += proNum;
		System.out.println("������������" +proNum+ "����ͷ����ǰ���Ϊ" + curCount + "��");
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
		System.out.println("������������" +cusNum+ "����ͷ����ǰ���Ϊ" + curCount + "��");
		notifyAll();
	}
	
}

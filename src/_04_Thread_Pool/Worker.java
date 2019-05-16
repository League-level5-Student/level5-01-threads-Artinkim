package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;
 
public class Worker implements Runnable {
	ConcurrentLinkedQueue<Task> taskQueue;
	
	Worker(ConcurrentLinkedQueue<Task> taskQueue) {
		this.taskQueue = taskQueue;	
	}
	
	@Override
	public void run() {
		System.out.println(taskQueue.size());
		while(!taskQueue.isEmpty()){
			taskQueue.remove().perform();
		}
	}
	


}

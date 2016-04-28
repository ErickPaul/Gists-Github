import java.sql.Time;


public class Job extends Thread{
	
	private int counter;
	
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0 ;i<100000; i++) counter++;
			notifyAll();
			System.out.println("Counting completed" + counter + " -- ");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Job job = new Job();
		job.start();
		Thread.sleep(10000);
		
		System.out.println("Waiting for counting to complete");
		synchronized (job) {
			System.out.println("lo" + System.currentTimeMillis());
			job.wait();
		}
		System.out.println(job);
	}

}

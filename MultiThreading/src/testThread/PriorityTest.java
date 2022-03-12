package testThread;

public class PriorityTest {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getPriority());     //NOTE : Default priority of parent thread is 5 
		
		PriorityRunnableImpl ct1 = new PriorityRunnableImpl("Child Thread");
		ct1.t.setPriority(10);
		
		PriorityRunnableImpl ct2 = new PriorityRunnableImpl("ChildThreadTwo");
		ct2.t.setPriority(1);
		
		ct1.t.start();
		ct2.t.start();                           //Just because start is called, it's not necessary that the run() is immediately called
		
		try {                                    //With this sleep method, we are ensuring that the child thread take up the processors alternatively for the next 5000ms;
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ct1.t.stop();    //To stop the infinite loop in run()  //After 5000ms , the control is back to the main thread.
		ct2.t.stop();
		
		System.out.println(ct1.t.getName() + " " + ct1.counter);
		System.out.println(ct2.t.getName() + " " + ct2.counter);
		
			
	}

}

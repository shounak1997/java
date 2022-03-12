package testThread;
public class Test {
	public static void main(String[] args) throws Exception{
		Thread mainThread = Thread.currentThread(); // Creating an object of the main thread
		
		RunnableImpl ct2 = new RunnableImpl("Runnable Thread");
		ct2.t.start();
	    	
		ChildThread ct1 = new ChildThread("Child Thread 1"); // Instantiation of the ChildThread which extends Thread class
		//ct1.start();   //Implicitly calls run of child thread class. // Note:Without start, a thread will not be created in the OS level,only the JRE will think it is a thread.
		//t1.run()    //Without start, it would work like any other method call.No multithreading.
		
		for(int i=0; i<3;i++) {
			System.out.println(mainThread.getName());  // Calling the getName method of the Thread Class.(API)
			
			Thread.sleep(50);      //Calling static sleep method of thread class, Note: the sleep method throws an InterruptedException which we should handle.
			
		}
		
		/*try {
			ct1.join();  // Ideally, child thread should complete execution before main thread. join() waits for ct1 to join. Throws InterruptedException
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/ 
		ct1.join();
		ct2.t.join();
		System.out.println("MainThread Over!");
	}
}

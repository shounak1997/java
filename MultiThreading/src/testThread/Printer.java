package testThread;

public class Printer {    //Synchronized: The resource locks a single thread until it's entire run process is complete. Even if the thread's time is exhausted, a  second thread is blocked until the first thread returns and complete's it's run    .
	
	synchronized public void print(String msg){                    //Printer takes in a message and prints it.
		System.out.print("[");
		System.out.print(msg);
		try {
			Thread.sleep(10);                            // This sleep is to simulate a real world scenario where a thread runs out of time while processing and is sent to the queue
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.print("]");
	}

}
  

//Output without synchronized: [Hello[World[Earth]]] / [World[Earth[Hello]]] etc...
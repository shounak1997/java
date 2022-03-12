package testThread;

public class PriorityRunnableImpl implements Runnable{
    
    Thread t;
    long counter;
    PriorityRunnableImpl(String name){
    	t = new Thread(this);
		t.setName(name); 
		//t.start();      NOTE:Either start here or in main, if called twice StackOverflowError
	}          
	@Override
	public void run(){
		while (true) {    //Infinite Loop
			counter ++;  
			//System.out.println(t.getName() + counter);
		}
		
	}
}
 
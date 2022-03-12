package testThread;
//NOTE: Runnable Interface has only one abstract run() method. All the setName, getName etc from Thread class is not present in Runnable.
public class RunnableImpl implements Runnable {
	String name;
	Thread t;                //Initializing the Thread class reference
	RunnableImpl(String name){
		//this: used to create a thread object of this class itself.
	    t = new Thread(this); //Since Runnable does'nt support setName,getName we create an Object of the Thread class(java.lang) and use it to do these functions.
		this.name = name;
		//setName(name); NOTE:Runnable:setName is undefined.
		t.setName(name);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i =0; i<3;i++) {
    	    System.out.println(name);
    	    try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	    }
	}
}


package testThread;

public class PrinterThread implements Runnable{
	String msg;
	Printer resource;
	Thread t;


	public PrinterThread(String msg, Printer resource){
		this.msg = msg;
		this.resource = resource;
		this.t = new Thread(this);
		t.start();
		
	}
	
	
	@Override
	public  void run()  {
		// TODO Auto-generated method stub
        resource.print(msg);         //Calling the print method of the printer
	}
	
	
     
}

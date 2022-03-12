package testThread;

public class SyncDemo {
	public static void main(String[] args) {
		Printer resource = new Printer();
		
		PrinterThread pt1 = new PrinterThread("Hello",resource);   //Resource Sharing: All threads use the same resource
		PrinterThread pt2 = new PrinterThread("World",resource);
		PrinterThread pt3 = new PrinterThread("Earth",resource);    //Imagine each thread to be a process where a person who has called the printer to print while simultaneously many other people are doing the same process
				
   }

}

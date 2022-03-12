package testThread;

public class ChildThread extends Thread {
	String name;
	ChildThread(String name){
		this.name = name;
		setName(this.name);
	}
    public void run() {
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

public class Consumer extends Thread {
	private Array plate;
	private int number;

    public Consumer(Array p, int number) {
       plate = p;
       this.number = number;
    }
    
    public void run(){
    	int value = 0;
    	
    	for(int i = 0; i < 100 ; i++){
    		try{
    			sleep(100);
    		} catch(InterruptedException e) {
    		}
    		
    		value = plate.get();
    		System.out.println("Consumer #" + this.number 
    				+ " got: " + value);
    	}
    }
}

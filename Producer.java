import java.util.Random;

public class Producer extends Thread {
	private Array plate;
	private int number;
	
	public Producer(Array p, int number){
		plate = p;
		this.number = number;
	}
	
	public void run(){
		Random random = new Random();
		for(int i = 0; i < 100; i++){
			int r = random.nextInt(100);
			plate.put(r);
			System.out.println("Producer #" + this.number + " put: " + r);
			
			try{
				sleep(100);
			}catch (InterruptedException e){
			}
		}
	}
}

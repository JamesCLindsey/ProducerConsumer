public class Array {
	
	private int[] food = new int[10];
	private boolean available = false;
	private int i = 0;
	
	synchronized public int get(){
		
		while(!available){
			try{
				wait();
			}catch (InterruptedException e){
			}
		}
		
		available = false;
		i--;
		notifyAll();
		return food[i];
	}
	
	synchronized public void put(int value){
		while(available){
			try{
				wait();
			}catch (InterruptedException e){
			}
		}
		
		available = true;
		food[i] = value;
		i++;
		notifyAll();
	}
}

package src;
public class countdown1 extends Thread{
private int tempo;
    
    public countdown1(int t){
        this.tempo=t;
    }
    public void countdown(int t) {
		// TODO Auto-generated constructor stub
	}
	public void run(){
        for(int i = tempo; i>0;i--){
            System.out.println(i);
            
            try {
                sleep(1000);
            }
            catch (InterruptedException e) {
            	e.printStackTrace();
            }
        }
    }
}
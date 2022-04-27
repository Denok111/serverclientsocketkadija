package src;
import java.io.IOException;
import java.net.InetAddress;

public class gestclient {

	public static void main(String[] args) {
		try{
	        client cli = new client(InetAddress.getLocalHost(), 2000);
	        System.out.println("Client connesso");
	        System.out.println("Server: " +cli.leggi());
	        countdown1 cd = new countdown1(Integer.getInteger(cli.leggi()));
	        cd.start();
	        }
		catch(IOException e){
	            e.printStackTrace();
	        }
	}
}
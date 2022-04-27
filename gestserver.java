package src;
public class gestserver {

	public static void main(String[] args) {
		server srv = new server(2000);
		
		if(srv!=null) {
	        srv.inAscolto();
	        srv.scrivi("5");
	        System.out.println("Client: " +srv.leggi());
		}
	}
}
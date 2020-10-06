import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;


public class server extends UnicastRemoteObject implements SampleServer{
    server() throws RemoteException{
        super();
    }

    public int sum(int a ,int b) throws RemoteException{

        return a+b;
    }
    public static void main(String args[]){
        try{
            server Server = new server();
            Naming.rebind("rmi://localhost:1099/test",Server);
            System.out.println("Server waiting.......");

        }
        catch(java.net.MalformedURLException me){
            System.out.println("Malformed URL"+ me.toString());
        }
        catch (RemoteException re){
            System.out.println("Remote Exception "+re.toString());
        }
    }
}

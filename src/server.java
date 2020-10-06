import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.time.LocalTime;

public class server extends UnicastRemoteObject implements SampleServer{
    server() throws RemoteException{
        super();
    }

    public LocalTime serTime() throws RemoteException{
        LocalTime myObj = LocalTime.now();
        return myObj;
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

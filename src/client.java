
import java.rmi.*;
import java.rmi.server.*;
public class client {
    public static void main(String[] args)
    {
        try{
            System.out.println("Security Manager Loaded");
            String url = "rmi://localhost:1099/test";
            SampleServer remoteObject= (SampleServer) Naming.lookup(url);
            System.out.println("Got Remote Object");
            System.out.println("Current Server Time"+ remoteObject.serTime());
        }
        catch (RemoteException re){
            System.out.println("Error in lookup : "+ re.toString());
        }
        catch (java.net.MalformedURLException me){
            System.out.println("Malformed URL "+ me.toString());
        }
        catch (java.rmi.NotBoundException exc){
            System.out.println("Not Bound: "+ exc.toString());
        }
    }
}

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalTime;

public interface SampleServer extends Remote {
    public int sum(int a,int b) throws RemoteException;
}

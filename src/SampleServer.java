import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalTime;

public interface SampleServer extends Remote {
    public LocalTime serTime() throws RemoteException;
}

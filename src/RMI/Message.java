package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Message extends Remote {
    String sayHello(String name ) throws RemoteException;
    double saySquareRoot(String name) throws RemoteException;
}

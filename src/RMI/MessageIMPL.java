package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MessageIMPL extends UnicastRemoteObject implements Message {
    public MessageIMPL() throws RemoteException{}

    @Override
    public String sayHello(String name) throws RemoteException {
        return name;
    }

    @Override
    public double saySquareRoot(String name)throws RemoteException {
        int i=Integer.parseInt(name);

        return Math.sqrt(i);
    }
}

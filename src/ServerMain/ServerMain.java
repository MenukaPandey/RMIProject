package ServerMain;

import RMI.MessageIMPL;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerMain {
    private void startServer(){
        try {
            Registry registry=LocateRegistry.createRegistry(1099);
            registry.bind("myMessage",new MessageIMPL());

        }catch (Exception e){}
        System.out.println("System is ready");
    }
    public static void main(String[] args){
        ServerMain main=new ServerMain();
        main.startServer();
    }
}

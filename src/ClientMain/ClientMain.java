package ClientMain;





import RMI.Message;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientMain {
    private void doTest(){
        try{
            Registry myRegidtry=LocateRegistry.getRegistry("127.0.0.1",1099);
            Message impl =(Message)myRegidtry.lookup("myMessage");
            String s=impl.sayHello("Menuka Pandey");
            double d=impl.saySquareRoot("5");
            System.out.println("RMI Message sent and response received");
            System.out.println(s+"\n"+d);

        }catch (Exception e){

        }
    }
    public static void main(String[] args){
        ClientMain main=new ClientMain();
        main.doTest();
    }
}

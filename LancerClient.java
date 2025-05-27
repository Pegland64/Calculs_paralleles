
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.rmi.server.ServerNotActiveException;

import raytracer.Scene;


public class LancerClient{
    public static void main(String args[])throws RemoteException, NotBoundException, ServerNotActiveException{
	Registry reg = LocateRegistry.getRegistry(args[0],1099);
	ServiceCentral sc  = (ServiceCentral) reg.lookup("Servicecentral");
	Scene s = new Scene("simple.txt",512,512);
	sc.enregistrerScene(s);
    }
}

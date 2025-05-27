import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.ServerNotActiveException;
import java.util.List;

public interface ServiceCentral extends Remote {
   public void enregistrerScene(Scene s) throws RemoteException,ServerNotActiveException;
 
   public List<Scene> couperNoeud(Scene s) throws RemoteException,ServerNotActiveException;

   public boolean envoyerNoeud(Scene s) throws RemoteException, ServerNotActiveException;

   public void envoyerClient(Image i) throws RemoteException, ServerNotActiveException;
}
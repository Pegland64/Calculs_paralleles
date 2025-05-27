import java.rmi.RemoteException;
import java.rmi.server.ServerNotActiveException;
import java.util.*;

public class Central implements ServiceCentral{

    Scene sceneClient;
    List<Scene> sousScene = new ArrayList<>();




    public void enregistrerScene(Scene s) throws RemoteException,ServerNotActiveException{

    }
 
    public List<Scene> couperNoeud(Scene s) throws RemoteException,ServerNotActiveException{

    }

    public boolean envoyerNoeud(Scene s) throws RemoteException, ServerNotActiveException{

    }

    public void envoyerClient(Image i) throws RemoteException, ServerNotActiveException{
        
    }
}
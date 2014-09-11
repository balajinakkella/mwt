import java.rmi.*;
public interface DNSLookup extends Remote
{
public String getIP(String hostName) throws RemoteException;
}

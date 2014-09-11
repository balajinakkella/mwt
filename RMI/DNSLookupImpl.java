import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
import java.lang.*;
public class DNSLookupImpl extends UnicastRemoteObject implements DNSLookup
{
public DNSLookupImpl() throws RemoteException
{
super();
// call base class constructor
}
public String getIP(String hostName) throws RemoteException
{
String res[]={"172.16.99.99","172.16.99.98"};
String hn[]={"clubmotivo.com","google.com"};
int i=0;
while(i<2)
{
if(hostName.equals(hn[i]))
{
System.out.println("Server: getIP(" + hostName + ") = " + res[i]);
return res[i];
}
i++;
}
return "HostName not found";
}
}

import java.rmi.*;
import java.rmi.server.*;
public class Server{
public static void main(String args[])
{
try
{
DNSLookupImpl fi = new DNSLookupImpl();
Naming.rebind("rmi://localhost:1099/cbit", fi);
System.out.println("Server: Ready...");
}
catch (Exception e)
{
System.out.println("Server: Failed to register RMIExampleImpl: " + e);
}
}
}

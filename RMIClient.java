import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
public class RMIClient
{
public static void main(String argv[])
{
String strName = "rmi://localhost:1099/cbit";
System.out.println("Client: Looking up " + strName + "...");
DNSLookup f=null;
try
{
f=(DNSLookup)Naming.lookup(strName);
}
catch (Exception e)
{
System.out.println("Client: Exception thrown looking up " + strName);
System.exit(1);
}
try
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("enter the host name: ");
String val=br.readLine();
//Invoking Business Method
String res = f.getIP(val);
System.out.println("Client:getIP(" + val + ") = " + res);
}
catch(RemoteException e)
{
System.out.println("Client: Excpetion thrown calling Factorial().");
System.exit(1);
}
catch(Exception e){
System.out.println(e.toString());
}
}
}

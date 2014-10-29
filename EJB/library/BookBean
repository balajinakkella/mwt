package pack2;

import javax.ejb.*;
import java.rmi.RemoteException;
import java.util.*;

@Stateless(mappedName="lib")
public class BookBean implements BookRemote 
{
	Vector shelf;
	
	public BookBean()
	{
		shelf = new Vector();
	}

	public void addBook(String bname) 
	{
		shelf.add(bname);
	}

	public Vector getBooks() 
	{
		return shelf;
	}

}

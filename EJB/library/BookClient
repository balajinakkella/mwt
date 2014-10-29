package pack2;

import java.util.*;
import javax.naming.InitialContext;
import javax.naming.Context;

public class BookClient {
	public static void main(String z[]) {
		try {
			int choice = 1;
			Properties p = new Properties();
			p.put(Context.INITIAL_CONTEXT_FACTORY,"org.jnp.interfaces.NamingContextFactory");
			p.put(Context.URL_PKG_PREFIXES,"org.jboss.naming:org.jnp.interfaces");
			p.put(Context.PROVIDER_URL, "localhost");
			InitialContext ctx = new InitialContext(p);
			BookRemote bref = (BookRemote) ctx.lookup("lib");
			Scanner sc = new Scanner(System.in);

			while (choice != 2) {
				String bname;
				System.out.println("Enter choice 1. Add 2. Over");
				choice = sc.nextInt();
				if (choice == 1) {
					System.out.println("Enter book name");
					bname = sc.next();
					bref.addBook(bname);
				} 
				else if (choice == 2) {
					break;
				}
			}

			Vector v = bref.getBooks();
			System.out.println("Size of vector \t" + v.size());
			for (int i = 0; i < v.size(); ++i) {
				System.out.println((String) v.elementAt(i));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

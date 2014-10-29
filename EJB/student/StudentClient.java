package pack5;

import java.util.*;

import javax.naming.InitialContext;
import javax.naming.Context;


public class StudentClient {
	public static void main(String z[]) {

		try {
			int choice = 1;
			Properties p = new Properties();
			p.put(Context.INITIAL_CONTEXT_FACTORY,
					"org.jnp.interfaces.NamingContextFactory");
			p.put(Context.URL_PKG_PREFIXES,
					"org.jboss.naming:org.jnp.interfaces");
			p.put(Context.PROVIDER_URL, "localhost");
			InitialContext ctx = new InitialContext(p);

			StudentRemote ro = (StudentRemote) ctx.lookup("stu");

		
			Scanner sc = new Scanner(System.in);
			while (choice != 2) {
				String sname;
				String roll;
				String marks;
				int marks1;
				System.out.println("Enter choice 1. Add 2. Over");
				choice = sc.nextInt();
				if (choice == 1) {
					System.out.println("Enter student name:");
					sname = sc.next();
					System.out.println("Enter rollno:");
					roll = sc.next();
					System.out.println("Enter marks");
					marks = sc.next();
					marks1=Integer.parseInt(marks);
					ArrayList as=new ArrayList();
					as.add(sname);
					as.add(roll);
					as.add(marks);
					ro.addStudentDetails(as);
				} else if (choice == 2) {
					break;
				}
			}

			ArrayList al=ro.getDetails();
			System.out.println("No of students added \t" + al.size());
			for (int i = 0; i < al.size(); ++i) {
				ArrayList sd = (ArrayList) al.get(i);
				String[] student = (String[]) sd.toArray(new String[3]);
				for(int j=0;j<sd.size();j++)
				{
				System.out.println(student[j]);
				
				
			}
				System.out.println("\n");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

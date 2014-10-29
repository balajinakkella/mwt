package pack5;

import java.util.*;

import javax.ejb.Remote;


@Remote
public interface StudentRemote {
	public void addStudentDetails(ArrayList a);
	public ArrayList getDetails();
}

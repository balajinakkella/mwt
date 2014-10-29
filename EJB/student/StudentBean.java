package pack5;

import javax.ejb.Stateless;
import java.util.*;

@Stateless(mappedName="stu")
public class StudentBean implements StudentRemote{
	ArrayList st;
	public StudentBean() {
		 st = new ArrayList();
	}
	
	@Override
	public  void addStudentDetails(ArrayList as){
	st.add(as);
}
	@Override
	public ArrayList getDetails()
	{
	return st;
	}
}

package Application_own;

import java.util.List;
import java.util.Map;

public class ExpertListnMaps
{
	List<Integer> marks;
	Map<String,String> contact;
	@Override
	public String toString() {
		return "ExpertListnMaps [marks=" + marks + ", contact=" + contact + "]";
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	public Map<String, String> getContact() {
		return contact;
	}
	public void setContact(Map<String, String> contact) {
		this.contact = contact;
	}
}

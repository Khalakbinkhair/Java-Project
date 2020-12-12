package Interface;
import Classes.*;
public interface nurseOperation {
	public void insertNurse(Nurse n);
	public void removeNurse(Nurse n);
	public Nurse getNurse(String id);
	public void showAllNurse();
}

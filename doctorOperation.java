package Interface;
import Classes.*;
public interface doctorOperation {
	public void insertDoctor(Doctor d);
	public void removeDoctor(Doctor d);
	public void showAllDoctor();
	public Doctor getDoctor(String id);
}

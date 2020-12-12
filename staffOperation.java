package Interface;
import Classes.*;
public interface staffOperation {
	public void insertStaff(Staff s);
	public void removeStaff(Staff s);
	public Staff getStaff(String id);
	public void showAllStaff();
}

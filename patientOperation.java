package Interface;
import Classes.*;

public interface patientOperation {
	public void registrarPatient(Patient p);
	public void removePatient(Patient p);
	public Patient getPatient(String id);
	public void showAllPatient();
}

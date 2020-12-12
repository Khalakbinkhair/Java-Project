package Classes;

public class Patient {
	private String patientId;
	private String patientName;
	private String address;
	private String phoneNum;
	
	
	public Patient() {}
	public Patient(String patientId, String patientName, String address,String phoneNum)
	{
		this.patientId = patientId;
		this.patientName = patientName;
		this.address = address;
		this.phoneNum = phoneNum;
		
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhoneNum(String phoneNum)
	{
		this.phoneNum = phoneNum;
	}
	public String getPhoneNum()
	{
		return phoneNum;
	}
	
}

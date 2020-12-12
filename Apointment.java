package Classes;
import java.util.Random;

public class Apointment {
	
	private String doctId;
	private String PatiId;
	private String patName;
	private String docName;
	private int roomNum;
	private double time;
	
	public Apointment() {}
	public Apointment( String doctId, String patiId,String patName, String docName)
	{
		
		this.doctId = doctId;
		this.PatiId = patiId;
		this.patName = patName;
		this.docName = docName;
	}
	
	Random rand = new Random();
	
	int R = rand.nextInt(25);
	
	public void setRoomNum()
	{
		this.roomNum =R;
	}
	public int getRoomNum()
	{
		return roomNum;
	}
	
	public String getDoctId() {
		return doctId;
	}
	public void setDoctId(String doctId) {
		this.doctId = doctId;
	}
	public String getPatiId() {
		return PatiId;
	}
	public void setPatiId(String patiId) {
		PatiId = patiId;
	}
	public void setPatName(String patName)
	{
		this.patName = patName;
	}
	public String getPatName()
	{
		return patName;
	}
	public void setDocName(String docName)
	{
		this.docName = docName;
	}
	public String getDocName()
	{
		return docName;
	}
	
	
}

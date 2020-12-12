package Classes;
import Interface.*;
import Classes.*;
import FileIo.FileReadWriteDemo;

public class Receptionist implements doctorOperation, nurseOperation, staffOperation,patientOperation, apointmentOperation, EmergencyOperation{
private Doctor doctor[] = new Doctor[500]; 
private Nurse nurse[] = new Nurse[500];
private Staff staff[] = new Staff[500];
private Patient patient[] = new Patient[500];
private Apointment apointment[] = new Apointment[500]; 
private Emergency emergency[] = new Emergency[500];

FileReadWriteDemo frwd = new FileReadWriteDemo();

	public void insertDoctor(Doctor d)
	{
		int flag = 0;
		for(int i=0;i<doctor.length;i++)
		{
			if(doctor[i]==null)
			{
				doctor[i]=d;
				flag = 1;
				break;
			}
		}
		if(flag ==1)
		{
			System.out.println("Doctor Inserted");
		}
		else
		{
			System.out.println("Doctor Can Not Be Inserted");
		}
	}
	
	public void removeDoctor(Doctor d)
	{
		int flag = 0;
		for(int i =0;i<doctor.length;i++)
		{
			if(doctor[i]==d)
			{
				doctor[i]=null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Doctor Removed!!!");
		}
		else
		{
			System.out.println("Doctor Can Not Be Removed!!!");
		}
		
	}
	public void showAllDoctor()
	{
		System.out.println("------- ALL DOCTORS -----------");
		for(Doctor d: doctor)
		{
			if(d!=null)
			{
				System.out.println("Doctor Id: "+d.getId());
				System.out.println("Doctor Name: "+d.getName());
				System.out.println("Doctor Department: "+d.getDepartment());
				System.out.println("Doctor Salary: "+d.getSalary()+"\n");
			}
		}
		System.out.println("---------------------------------------");
	}
	public Doctor getDoctor(String docId)
	{
		Doctor d = null;
		for(int i=0;i<doctor.length;i++)
		{
			if(doctor[i]!=null)
			{
				if(doctor[i].getId().equals(docId))
				{
					d = doctor[i];
					break;
				}
			}
		}
		return d;
	}
	
	public void insertNurse(Nurse n)
	{
		int flag = 0;
		for(int i=0;i<nurse.length;i++)
		{
			if(nurse[i]==null)
			{
				nurse[i]=n;
				flag = 1;
				break;
			}
			
		}
		if(flag==1)
		{
			System.out.println("Nurse Inserted!!!");
		}
		else
		{
			System.out.println("Nurse Can Not Be Inserted!!!");
		}
	}
	
	public void  removeNurse(Nurse n)
	{
		int flag = 0;
		for(int i = 0;i<nurse.length;++i)
		{
			if(nurse[i]==n)
			{
				nurse[i]=null;
				flag = 1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Nurse Removed!!!");
		}
		else
		{
			System.out.println("Nurse Can Not Be Removed!!!");
		}
		
	}
	public Nurse getNurse(String id)
	{
		Nurse nu = null;
		for(int i=0;i<nurse.length;++i)
		{
			if(nurse[i].getId().equals(id))
			{
				nu = nurse[i];
				break;
			}
			

		}
		return nu;
	}
	public void showAllNurse()
	{
		System.out.println("------------ All NURSE -------------------\n");
		for(Nurse n3: nurse)
		{
			if(n3!=null)
			{
				System.out.println("Nurse Id: "+n3.getId());
				System.out.println("Nurse Name: "+n3.getName());
				System.out.println("Nurse Salary: "+n3.getSalary());
			}
		}
		System.out.println("--------------------------------");
	}
	
	public void insertStaff(Staff s)
	{
		int flag = 0;
		for(int i =0;i<staff.length;i++)
		{
			if(staff[i]==null)
			{
				staff[i]=s;
				flag = 1;
				break;
			}
		}
		if(flag ==1)
		{
			System.out.println("Staff Added!!!");
		}
		else      
		{
			System.out.println("Staff Can Not Be Added!!!");
		}
	}
	public void removeStaff(Staff s)
	{
		int flag = 0;
		for(int i =0;i<staff.length;++i)
		{
			if(staff[i]==s)
			{
				staff[i]=null;
				flag =1;
				break;
			}
		}
		if(flag ==1)
		{
			System.out.println("Staff Removed!!!");
		}
		else 
		{
			System.out.println("Staff Can Not Be Removed!!!");
		}
	}
	public Staff getStaff(String id)
	{
		Staff s1= null;
		for(int i =0;i<staff.length;++i)
		{
			if(staff[i].getId().equals(id))
			{
				s1 = staff[i];
				break;
			}
		}
		return s1;
	}
	public void showAllStaff()
	{
		for(Staff s2: staff)
		{
			if(s2!=null)
			{
				System.out.println("Staff Id: "+s2.getId());
				System.out.println("Staff Name: "+s2.getName());
				System.out.println("Staff Category: "+s2.getCategory());
				System.out.println("Staff Salary: "+s2.getSalary());
			}
		}
	}
	
	public void registrarPatient(Patient p)
	{
		int flag = 0;
		for(int i = 0;i<patient.length;++i)
		{
			if(patient[i]==null)
			{
				patient[i] = p;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("\nPatient Registered!!!");
		}
		else
		{
			System.out.println("\nPatient Can Not Be Registered!!!");
		}
	}
	
	public void removePatient(Patient p)
	{
		int flag = 0;
		for(int i=0;i<patient.length;++i)
		{
			if(patient[i]==p)
			{
				patient[i]=null;
				flag =1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Patient Removed");
		}
		else
		{
			System.out.println("Patient Can Not Be Removed");
		}
	}
	public Patient getPatient(String id)
	{
		Patient p2 = null;
		for(int i=0;i<patient.length;++i)
		{
			if(patient[i].getPatientId().equals(id))
			{
				p2 =patient[i];
				break;
			}
		}
		return p2;
	}
	public void showAllPatient()
	{
		for(Patient p3: patient)
		{
			if(p3!=null)
			{
				System.out.println("Patient Id: "+p3.getPatientId());
				System.out.println("Patient Name: "+p3.getPatientName());
				System.out.println("Patient Address: "+p3.getAddress());
				System.out.println("Patient Contact Number: "+p3.getPhoneNum());
			}
			
		}
	}
	public void apointment(Apointment a1)
	{
		int flag =0;
		
		
		for(int i=0;i<apointment.length;++i)
		{
			if(apointment[i]==null)
			{
				apointment[i] = a1;
				for(int j=0;j<patient.length;++j)
				{
					if(apointment[i].getPatiId().equals(patient[j].getPatientId()))
					{
						apointment[i].setPatName(patient[j].getPatientName());
						
						
						break;
					}
					/*if(apointment[i].getPatiId().equals(patient[j].getPatientId())==false)
					{
						System.out.println("\nError!!! Cant Find Patient ID");
						break;
					}*/
		
				}

				
				for(int z =0;z<doctor.length;z++)
				{
					if(apointment[i].getDoctId().equals(doctor[z].getId()))
					{
						apointment[i].setDocName(doctor[z].getName());
						
						
						break;
					}
					/*if(apointment[i].getDoctId().equals(doctor[z].getId())==false)
					{
						System.out.println("\nError!!! Cant Find Doctor Id");
						break;
					}*/
				}
				
				System.out.println("-----------------------------------------");
				
						apointment[i].setRoomNum();
						String s;
						s="\nPatient "+apointment[i].getPatName()+" Is Apointment To Doctor "+apointment[i].getDocName()+" At Room "+apointment[i].getRoomNum()+"\n";
						
							frwd.writeInFile(s);	
						
						flag =1;
					
				break;
				
			}
			
		}
		if(flag==1)
		{
			System.out.println("Apointment Successful");
		}
		else
		{
			System.out.println("Apointment Can Not Be Registared!!!");
		}
					
	}
	
	public boolean docDetails()
	{
		boolean b = true;
		
		for(Doctor d: doctor)
		{
			if(d!=null)
			{
				System.out.print("Doctor Id: "+d.getId()+"\t Doctor Name: "+d.getName()+"\t Doctor Department: "+d.getDepartment()+"\n");
				
			}
		}
		if(doctor[0]==null)
		{
			System.out.println("--------No Doctor Available----------");
			b = false;
		}
		return b;
	}
	
	public void showAllApointment()
	{
		frwd.readFromFile();
		
	}
	
	public void EmergencyDep(Emergency e)
	{
		int flag = 0;
		
		for(int i = 0;i<emergency.length;++i)
		{
			if(emergency[i]==null)
			{
				emergency[i] = e;
				flag = 1;		
				break;
			}
			
		}
		if(flag == 1)
		{
			System.out.println("----------------------------------------");
			System.out.println("Your Are Admitted To Emergency Department");
		}
		else
		{
			System.out.println("----------------------------------------");
			System.out.println("Error!!Cant Admit");
		}
	}
	
	public void showAllRecord()
	{
		boolean x = true;
		System.out.println("Patient Name\tPatient Age\tContact Number\tDetected Problem");
		System.out.println("------------------------------------------------------------");
		for(Emergency e: emergency)
		{
			if(e!=null)
			{
				System.out.println(e.getName()+"\t\t"+e.getAge()+"\t\t"+e.getNumber()+"\t\t"+e.getProblem());
				x = false;
			}
		}
		if(x)
		{
			System.out.println("---------No Record Available-------------");
		}
	}
	
	public void FinnaceRecord(int x)
	{
		System.out.println("ID\tSalary");
		System.out.println("-------------");
		if(x==1)
		{
			boolean se = true;
			
			for(Doctor d1: doctor)
			{
				if(d1!=null)
				{
					System.out.println(d1.getId()+"\t"+d1.getSalary());
					se = false;
				}
			}
			if(se)
			{
				System.out.println("Not Available");
			}
			
		}
		if(x==2)
		{
			boolean se1 = true;
			
			for(Nurse n1: nurse)
			{
				if(n1!=null)
				{
					System.out.println(n1.getId()+"\t"+n1.getSalary());
					se1 = false;
				}
			}
			if(se1)
			{
				System.out.println("Not Available");
			}
		}
		if(x==3)
		{
			boolean se2 = true;
			for(Staff s1: staff)
			{
				if(s1!=null)
				{
					System.out.println(s1.getId()+"\t"+s1.getSalary());
					se2 = false;
				}
			}
			if(se2)
			{
				System.out.println("Not Available");
			}
		}
		
		
	}
}

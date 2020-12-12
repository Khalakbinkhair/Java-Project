
import java.util.Scanner;
import Classes.*;


public class start {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Receptionist r = new Receptionist();
		
		
		
		
		boolean choice = true;
		System.out.println("-------------------------------------------------------\n");
		System.out.println("\tWELCOME TO HOSPITAL MANAGEMENT SYSTEM\n");
		System.out.println("--------------------------------------------------------\n");
		while(choice)
		{
			System.out.println("What Do You Want To Do?");
			System.out.println("1. Employee Management");
			System.out.println("2. Patient Management");
			System.out.println("3. Make An Apointment");
			System.out.println("4. Show All Apointment");
			System.out.println("5. Emergency");
			System.out.println("6. Finnace");
			System.out.println("7. Exit");
			
			System.out.print("\nEnter Your Option: ");
			int option = in.nextInt();
			
			switch(option)
			{
			case 1:
				///////////////////////EMPLOYEE MANAGEMENT////////////////////////
				System.out.println("------------------------------------");
				System.out.println("\tEMPLOYEE MANAGEMENT");
				System.out.println("------------------------------------");
				System.out.println("\nWhat Do You Want To Do?");
				System.out.println("1. Manage Doctor");
				System.out.println("2. Manage Nurse");
				System.out.println("3. Manage Staff");
				System.out.println("4. Go Back");
				
				System.out.print("Enter Your Option: ");
				int w1 = in.nextInt();
				//boolean random = true;
				
				
				switch (w1)
				{
				////////////////////////DOCTOR MANAGEMENT//////////////////////
				case 1:
					System.out.println("--------------------------------");
					System.out.println("\tDOCTOR MANAGEMENT");
					System.out.println("---------------------------------");
					System.out.println("What Do You Want To DO? ");
					System.out.println("1. Add A New Doctor");
					System.out.println("2. Remove Exiting Doctor");
					System.out.println("3. Get A Doctor Information");
					System.out.println("4. Show All Doctor");
					System.out.println("5. Go Back");
					
					System.out.print("Enter Your Option: ");
					int w2 = in.nextInt();
				
				
				
				switch(w2)
				{
				case 1:
					System.out.println("---------- ADD A NEW DOCTOR ---------");
					Doctor d = new Doctor();
					
					String x = in.nextLine();
					
					System.out.print("Enter Doctor ID: ");
					String docId = in.nextLine();
					d.setId(docId);
					
					System.out.print("Enter Doctor Name: ");
					String docName = in.nextLine();
					d.setName(docName);
					
					System.out.print("Enter Doctor Department: ");
					String docDept = in.nextLine();
					d.setDepartment(docDept);
					
					System.out.print("Enter Doctor Salary: ");
					double docSalary = in.nextDouble();
					d.setSalary(docSalary);
					
					
					r.insertDoctor(d);
					
					System.out.println("---------------------------------------");
					break;
				case 2:
					System.out.println("--------- REMOVE EXITING DOCTOR ----------");
					String x2 = in.nextLine();
					System.out.print("Enter Doctor Id: ");
					String DocId = in.nextLine();
					
					r.removeDoctor(r.getDoctor(DocId));
					System.out.println("------------------------------------------");
					break;
				case 3:
					System.out.println("---------- GET A DOCTOR INFORMATION---------------");
					System.out.print("Enter Doctor Id: ");
					
					String t = in.nextLine();
					
					String docId2 = in.nextLine();
					
					Doctor d1 = r.getDoctor(docId2);
					if(d1!=null)
					{
						System.out.println("Doctor Id: "+d1.getId());
						System.out.println("Doctor Name: "+d1.getName());
						System.out.println("Doctor Department: "+d1.getDepartment());
						System.out.println("Doctor Salary: "+d1.getSalary());
					}
					else
					{
						System.out.println("Doctor Does Not Found!");
					}
					System.out.println("-----------------------------------");
					break;
				case 4:
					System.out.println("---------------------------");
					r.showAllDoctor();
					System.out.println("-------------------------------------");
					break;
				case 5:
					System.out.println("-------------------------------------");
					System.out.println("GOING BACK");
					System.out.println("------------------------------------");
					break;
				default:
					System.out.println("-------------------------------");
					System.out.println("INVALID");
					System.out.println("--------------------------------");
					
						
				}
				
				break;
				
				///////////////////////NURSE MANAGEMENT//////////////////////
			case 2:
					System.out.println("-------------------------------");
					System.out.println("\tNURSE MANAGEMENT");
					System.out.println("-------------------------------");
					System.out.println("What Do You Want To DO? ");
					System.out.println("1. Add A New Nurse");
					System.out.println("2. Remove Exiting Nurse");
					System.out.println("3. Get A Nurse Information");
					System.out.println("4. Show All Nurse");
					System.out.println("5. Go Back");
					
					System.out.println("Enter Your Option");
					int w3 = in.nextInt();
					
					switch(w3)
					{
					case 1:
						System.out.println("---- ADD A NEW NURSE----\n");
						Nurse n = new Nurse();
						
						String x = in.nextLine();
						
						System.out.print("Enter Nurse ID: ");
						String nurId = in.nextLine();
						n.setId(nurId);
						
						System.out.print("Enter Nurse Name: ");
						String nurName = in.nextLine();
						n.setName(nurName);
						
						System.out.print("Enter Doctor Salary: ");
						double nurSalary = in.nextDouble();
						n.setSalary(nurSalary);
						
						
						r.insertNurse(n);
						
						System.out.println("---------------------------------------");
						break;
					case 2:
						System.out.println("--------- REMOVE EXITING NURSE ----------");
						String x2 = in.nextLine();
						System.out.print("Enter Nurse Id: ");
						String nurId1 = in.nextLine();
						
						r.removeNurse(r.getNurse(nurId1));
						System.out.println("------------------------------------------");
						break;
					case 3:
						System.out.println("---------- GET A NURSE INFORMATION ---------------");
						System.out.print("Enter Nurse Id: ");
						String nurId2 = in.nextLine();
						
						Nurse n1 = r.getNurse(nurId2);
						if(n1!=null)
						{
							System.out.println("Nurse Id: "+n1.getId());
							System.out.println("Nurse Name: "+n1.getName());
							System.out.println("Nurse Salary: "+n1.getSalary());
						}
						else
						{
							System.out.println("Nurse Does Not Found!");
						}
						System.out.println("-----------------------------------");
						break;
					case 4:
						System.out.println("---------------------------");
						r.showAllNurse();
						System.out.println("-------------------------------------");
						break;
					case 5:
						System.out.println("-------------------------------------");
						System.out.println("GOING BACK");
						System.out.println("------------------------------------");
						break;
					default:
						System.out.println("-------------------------------");
						System.out.println("INVALID");
						System.out.println("--------------------------------");
						
								
					}
					break;
				
			case 3:
				///////////////////////////STAFF MANAGEMENT//////////////////////////////
				System.out.println("-------------------------------");
				System.out.println("\tSTAFF MANAGEMENT");
				System.out.println("-------------------------------");
				System.out.println("What Do You Want To DO? ");
				System.out.println("1. Add A New Staff");
				System.out.println("2. Remove Exiting Staff");
				System.out.println("3. Get A Staff Information");
				System.out.println("4. Show All Staff");
				System.out.println("5. Go Back");
				
				System.out.println("Enter Your Option");
				int w4 = in.nextInt();
				
				switch(w4)
				{
				case 1:
					System.out.println("---- ADD A NEW STAFF----\n");
					Staff s = new Staff ();
					
					String x4 = in.nextLine();
					
					System.out.print("Enter Staff ID: ");
					String staffId = in.nextLine();
					s.setId(staffId);
					
					System.out.print("Enter Staff Name: ");
					String staffName = in.nextLine();
					s.setName(staffName);
					
					System.out.println("Enter Staff Category: ");
					String cate = in.nextLine();
					s.setCategory(cate);
					
					System.out.print("Enter Staff Salary: ");
					double staffSalary = in.nextDouble();
					s.setSalary(staffSalary);
					
					
					r.insertStaff(s);
					
					System.out.println("---------------------------------------");
					break;
				case 2:
					System.out.println("--------- REMOVE EXITING STAFF ----------");
					String x = in.nextLine();
					
					System.out.print("Enter Staff Id: ");
					String stafId1 = in.nextLine();
					
					r.removeStaff(r.getStaff(stafId1));
					System.out.println("------------------------------------------");
					break;
				case 3:
					System.out.println("---------- GET A STAFF INFORMATION---------------");
					System.out.print("Enter Staff Id: ");
					String stafId2 = in.nextLine();
					
					Staff s2 = r.getStaff(stafId2);
					if(s2!=null)
					{
						System.out.println("Staff Id: "+s2.getId());
						System.out.println("Staff Name: "+s2.getName());
						System.out.println("Staff Category: "+s2.getCategory());
						System.out.println("Staff Salary: "+s2.getSalary());
					}
					else
					{
						System.out.println("Staff Does Not Found!");
					}
					System.out.println("-----------------------------------");
					break;
				case 4:
					System.out.println("---------------------------");
					r.showAllStaff();
					System.out.println("-------------------------------------");
					break;
				case 5:
					System.out.println("-------------------------------------");
					System.out.println("GOING BACK");
					System.out.println("------------------------------------");
					break;
				default:
					System.out.println("-------------------------------");
					System.out.println("INVALID");
					System.out.println("--------------------------------");
					
						
				
					}
					break;
				case 4:
					System.out.println("----------------------------------");
					System.out.println("\tGOING BACK");
					
					System.out.println("---------------------------------");
					break;
				default:
					System.out.println("-------------------------------");
					System.out.println("\tINVALID");
					System.out.println("-------------------------------");
				
			}
				
				break;
				
				///////////////EMPLOYEE MANAGEMENT ENDS//////////////////////
			case 2:
				////////////////////////PAITENT MANAGEMENT////////////////////////
				System.out.println("-------------------------------------");
				System.out.println("\tPATIENT MANAGEMENT");
				System.out.println("------------------------------------/n");
				System.out.println("What Do You Want To DO? ");
				System.out.println("1. Registrar A New Patient");
				System.out.println("2. Remove Extiting Patient Account");
				System.out.println("3. Get A Patient Info");
				System.out.println("4. Show All Patient");
				System.out.println("5. Go Back");
				
				System.out.println("Enter Your Option: ");
				int w5 = in.nextInt();
				
				switch(w5)
				{
				case 1:
					System.out.println("--------Registrar Patient -------------/n");
					Patient p  = new Patient();
					
					String x = in.nextLine();
					
					System.out.print("Enter Patient Id: ");
					String patId = in.nextLine();
					p.setPatientId(patId);
					
					System.out.print("Enter Patient Name: ");
					String patName = in.nextLine();
					p.setPatientName(patName);
					
					System.out.print("Enter Patient Address: ");
					String patAdd = in.nextLine();
					p.setAddress(patAdd);
					
					System.out.print("Enter Patient Contact Number: ");
					String patPhn = in.nextLine();
					p.setPhoneNum(patPhn);
					
					r.registrarPatient(p);
					System.out.println("-------------------------------------");
					break;
					
				case 2:
					System.out.println("-------Remove Patient---------------------/n");
					
					String x1 = in.nextLine();
					
					System.out.print("Enter Patient Id: ");
					String patId2 =in.nextLine();
					
					r.removeDoctor(r.getDoctor(patId2));
					
					break;
					
				case 3:
					System.out.println("------------Get A Patient----------------/n");
					
					String x2 = in.nextLine();
					
					System.out.print("Enter Patient Id: ");
					String patId3 = in.nextLine();
					
					Patient p2 = r.getPatient(patId3);
					if(p2!=null)
					{
						System.out.println("Patient ID: "+p2.getPatientId());
						System.out.println("Patient Name: "+p2.getPatientName());
						System.out.println("Patient Address:"+p2.getAddress());
						System.out.println("Patient Contact Number: "+p2.getPhoneNum());
					}
					System.out.println("-------------------------------------");
					break;
					
				case 4:
					System.out.println("----------------All Patient------------------/n");
					r.showAllPatient();
					System.out.println("-------------------------------------------");
					break;
				case 5:
					System.out.println("--------------------");
					System.out.println("\tGOING BACK");
					System.out.println("-----------------------");
					break;	
				default:
					System.out.println("---------------------");
					System.out.println("\tINVALID");
					System.out.println("---------------------");
				}
				
				break;
            //////////////////////////PATIENT MANAGEMENT ENDS/////////////////
			case 3:
				////////////////MAKE AN APOINTMENT///////////////////
				System.out.println("-----------Make An Apointment----------\n");
				if(r.docDetails())
				{
					System.out.println();
				
					Apointment ap = new Apointment();
					String patiId, doctId;
				
					String x = in.nextLine();
				
					System.out.println("Enter Patient Id: ");
					patiId = in.nextLine();
					ap.setPatiId(patiId);
				
					System.out.println("Enter Doctor Id: ");
					doctId = in.nextLine();
					ap.setDoctId(doctId);
				                      
					r.apointment(ap);
					
				}
				System.out.println("--------------------------------------");
				
				break;
			case 4:
				////////////////////ACCOUNT MANGEMENT/////////////////
				System.out.println("-------------All Apointment---------------");
				r.showAllApointment();
				System.out.println("------------------------------------------");
				break;
			case 5:
				///////////////EMEREGENCY/////////////
				System.out.println("---------------------Emergency Department------------------\n");
				
				System.out.println("1. Admit To Emergency");
				System.out.println("2. Show All Emergency Patient Record\n");
				System.out.print("Enter Your Option: ");
				
				int s = in.nextInt();
				
				switch(s)
				{
				case 1:
					System.out.println("-------------Admit Emergency Patient-----------------");
					Emergency e  = new Emergency();
					
					String name,number,problem;
					int age;
					
					String x1 = in.nextLine();
					
					System.out.print("Enter Emergency Patient Name: ");
					name = in.nextLine();
					e.setName(name);
					
					System.out.print("Enter Emergency Patient Age:");
					age = in.nextInt();
					e.setAge(age);
					String x = in.nextLine();
					
					System.out.print("Enter Emergency Patient Contact Number:");
					number = in.nextLine();
					e.setNumber(number);
					
					System.out.print("Enter Emergency Patient illnesses and injuries:");
					problem = in.nextLine();
					e.setProblem(problem);
					
					r.EmergencyDep(e);
					
					System.out.println("----------------------------------------------");
					break;
					
				case 2:
					System.out.println("-----------------All Emergency Record--------------\n");
					r.showAllRecord();
					System.out.println("\n-------------------------------------------------------");
					break;
					
				default:
						System.out.println("Invalid!!!");
				}
				break;
				
			case 6:
				System.out.println("--------------------Finnace-----------------------------");
				System.out.println("1. Show All Doctors Salary Info");
				System.out.println("2. Show All Nurses Salary Info");
				System.out.println("3. Show All Staff Salaray Info");
				System.out.print("\nEnter Your Option: ");
				
				int s1 = in.nextInt();
				
				r.FinnaceRecord(s1);
				
				if(s1>3)
				{
					System.out.println("Invalid Option");
				}
				
				System.out.println("\n--------------------------------------");
				
				break;
				
			case 7:
				choice = false;
				System.out.println("-------------Thank You For Using Our System--------------");
				break;
			default:
				/////////////////////Invalidid/////////
				System.out.println("Thank you");
				break;
				
					
				
			
			}
			 
		}
		
		
		
		
	}
}

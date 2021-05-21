package databaseAdministrator;


import javax.swing.JOptionPane;

public class Student {
	private String firstName;
	private String lastName;
	private int year;
	private String ID;
	private String course="";
	private int costOfCourse=600;
	private int balance=0;
	private int remainingFee;
	private int amountPaid=0;
	private static int id=1000;
	
//	Constructor
	public Student() {
		this.firstName=JOptionPane.showInputDialog("Enter Student first Name");
		this.lastName=JOptionPane.showInputDialog("Enter Student last Name");
		this.year=Integer.parseInt(JOptionPane.showInputDialog("1- Freshman\n2- Junior\n3- Senior\n4- SuperSenior\nEnter year"));		
		this.setId();
		this.coursesEnroll();
		this.payFee();
//		this.show();
	}
	
//	set Id
	public void setId(){
		this.ID=this.year+""+id;
		id++;
	}
	
//	Enroll courses informaHotion
	public void coursesEnroll() {
		String s=JOptionPane.showInputDialog(null,"Enter courses to enroll ('Q' to quit)");
		if(s.equals("Q")) {
			JOptionPane.showMessageDialog(null, "Total fee: "+this.balance);
			return;
		}
		else if(!s.equals("Q")) {
			this.course=s;
			this.balance=this.balance+this.costOfCourse;
		while(true) {
			s=JOptionPane.showInputDialog(null,"Enter courses to enroll ('Q' to quit)");
			if(!s.equals("Q")) {
				this.course=this.course+", "+s;
				this.balance=this.balance+this.costOfCourse;
			}
			else {
				break;
			}
		}
		}
		JOptionPane.showMessageDialog(null, "Total fee: "+this.balance);
	}
	
//	Pay fee
	public void payFee() {
		this.remainingFee=this.balance;
		this.amountPaid =Integer.parseInt(JOptionPane.showInputDialog("Enter the amount you're paying: "));
		this.remainingFee=this.balance-this.amountPaid;
	}

//Display all information
	public void show() {
		JOptionPane.showMessageDialog(null,"First Name: "+this.firstName+"\n"+"Last Name: "+this.lastName+ "\n"+"Year: "+this.year+"\n"+"ID: "+this.ID+"\n"+"Enrolled courses: "+this.course+"\n"+"Total Fee: "+this.balance+"\n"+"Amount Paid: "+this.amountPaid+"\n"+"Remaining Fee: "+this.remainingFee);

	}
}

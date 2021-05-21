package databaseAdministrator;
import javax.swing.*;

public class StudentDatabaseApp {

	public static void main(String[] args) {
//		Ask how many new users we want to add

		int noOfEntry=Integer.parseInt(JOptionPane.showInputDialog("Enter the numbers of students to add-"));
		Student student[]=new Student[noOfEntry];
		for(int i=0;i<noOfEntry;i++) {
			student[i]=new Student();
		}
		for(Student i: student) {
			i.show();
		}
	}

}

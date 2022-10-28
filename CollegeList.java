package Lab;

import java.util.Scanner;
public class CollegeList {
	 public static void main(String args[]) {
	 Scanner input = new Scanner(System.in);
	 Person person = new Person();
	 Employee employee = new Employee();
	 Faculty faculty = new Faculty();
	 
	 System.out.print("Press 'E' for Employee, 'F' for Faculty, and 'S 'for Student: ");
	 String feedback = input.nextLine();
	 while(true){
		 if (feedback.equalsIgnoreCase("E")) {
	 System.out.println("Type Employee's name, contact number, salary and department. ");
	 person.setName(input.nextLine());
	 person.setContactNum(input.nextLine());
	 employee.setSalary(input.nextDouble());
	 input.nextLine();
	 employee.setDepartment(input.nextLine());
	 System.out.println("----------------------------------------------------------------------------");
	 System.out.println("Name: " + person.getName() + "\nContact Number: " +
	person.getContactNum() +
	 "\nSalary: " + employee.getSalary() + "\nDepartment: " +
	employee.getDepartment());
	 break;
	 }
	 else if (feedback.equalsIgnoreCase("F")){
	 System.out.println("Press 'Y' if the faculty member is regular/tenured or 'N' if not: ");
	 String tenure = input.nextLine();
	
	 while(true){
	 if (faculty.isRegular() == tenure.equalsIgnoreCase("Y")){
	 System.out.println("Type faculty's name, contact number, salary and department.");
	 person.setName(input.nextLine());
	 person.setContactNum(input.nextLine());
	 employee.setSalary(input.nextDouble());
	 input.nextLine();
	 employee.setDepartment(input.nextLine());
	 System.out.println("----------------------------------------------------------------------------");
	 System.out.println("Name: " + person.getName() + "\nContact Number: " +
	person.getContactNum() +
	 "\nSalary: " + employee.getSalary() + "\nDepartment: " + employee.getDepartment()
	+ "\nStatus: Regular");
	 break;
	 }
	 else if(faculty.isRegular() == tenure.equalsIgnoreCase("N")){
	 System.out.println("Type faculty's name, contact number, salary and department.");
	 person.setName(input.nextLine());
	 person.setContactNum(input.nextLine());
	 employee.setSalary(input.nextDouble());
	 input.nextLine();
	 employee.setDepartment(input.nextLine());
	 System.out.println("----------------------------------------------------------------------------");
	 System.out.println("Name: " + person.getName() + "\nContact Number: " +
	person.getContactNum() +
	 "\nSalary: " + employee.getSalary() + "\nDepartment: " + employee.getDepartment()
	+ "\nStatus: Not Regular");
	 break;
	 }
	
	 }
	 break;
	 }
	 else if(feedback.equalsIgnoreCase("S")){
	 Student student = new Student();
	 System.out.println("Type Student's name,contact number, enrolled program, and year level: ");
	 person.setName(input.nextLine());
	 person.setContactNum(input.nextLine());
	 student.setProgram(input.nextLine());
	 student.setYearLevel(input.next());
	 System.out.println("----------------------------------------------------------------------------");
	 System.out.println("Name: " + person.getName() + "\nContact Number: " +
	person.getContactNum() +
	 "\nProgram: " + student.getProgram() + "\nYear Level: " + student.getYearLevel());
	 break;
	 }
	 }
	 }
	}

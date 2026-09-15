import java.util.Scanner;
 class Assignments2{
  public static void main(String[] args){
	Scanner scanner =new Scanner(System.in);
	
	System.out.print("Enter Student marks : ");
	int marks  = scanner.nextInt();
	
	 if(marks<0 || marks>100){
		System.out.println("Invalid marks");
	  }else if (marks>=90){
		System.out.println("The Grade: A ");
			}else if (marks>=75){
		System.out.println("The Grade : B ");
			}else  if (marks>=60){
		System.out.println("The Grade : C ");
			}else if(marks>=45){
		System.out.println("The Grade :E ");
			}else{
		System.out.println("The Grade : Fail ");
			}
	
	scanner.close();
	
  }
}
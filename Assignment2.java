import java.util.Scanner;
 class Assignments2{
  public static void main(String[] args){
	Scanner scanner =new Scanner(System.in);
	
	System.out.print("Enter first number : ");
	int firstNum  = scanner.nextInt();
	
	System.out.print("Enter Second number : ");
	int secondNum  = scanner.nextInt();
	
	System.out.print("Enter third number : ");
	int thirdNum  = scanner.nextInt();
	
	if(firstNum == secondNum && secondNum == thirdNum){
		System.out.println("All the numbers are equal");
	} 
	else if(firstNum >= secondNum  && firstNum >= thirdNum){
		System.out.println("The Largest number :" + firstNum);
	} 
	else if(secondNum >= firstNum && secondNum >= thirdNum){
		System.out.println("The Largest number :" + secondNum);
		}
		else {
		System.out.println("The Largest number :" + thirdNum);
		}
	 
	scanner.close();
  }
}
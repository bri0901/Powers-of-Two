import java.util.Scanner;

public class PowersofTwo {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		while (num % 2 == 0 && num!=0) {
			num = num / 2;	
		}
		
		if(num == 1) {
			System.out.println("This number is a power of 2");
		}
		else {
			System.out.println("This number is not a power of 2");
		}
	}

}

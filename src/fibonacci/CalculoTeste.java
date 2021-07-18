package fibonacci;

import java.util.Scanner;

public class CalculoTeste {

	public static void main(String[] args) {
		
		Calculo ccl = new Calculo();
		 Scanner sc = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Entre com o termo: ");

		    int n = sc.nextInt();  // Read user input
		    sc.close();
		    
		    for (int i = 0; i <= n; i++) {
				System.out.println("(" + i + "):" + ccl.fibo(i) + "\t");
			}
		    
		    
		  
	}

}

import java.util.Scanner;

public class Calculator {
    	private int num1;
          private int num2;
       private String operator;

    // Constructor to initialize the calculator
    public void calculate() {
	  
        // Get user input
        Scanner scanCalc = new Scanner(System.in);
	System.out.println("Input the first number:");
	num1= scanCalc.nextInt();
scanCalc.nextLine();
	System.out.println("Input the operator");
	
	 String operator=scanCalc.nextLine();
	System.out.println("Input the second number:");
	num2=scanCalc.nextInt();

    
	switch (operator) {
	case "+":
		add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));	
		break;
	case "-" :
		subtract (num1, num2);
		System.out.println(num1 + "-" + num2 + " = " + (num1-num2));
		break;

	case "x" :
		multiply ( num1, num2);
		System.out.println(num1 +" x " + num2 + " = " + (num1*num2));
		break;

	case "/" :
		 divide ( num1,  num2);
		 System.out.println(num1 +"/" + num2 + " = "  + (num1/num2));
			
}
}

        public String add ( int num1, int num2){
	return num1 + " + " + num2 + " = " + (num1+num2);
}

	public String subtract (int num1, int num2){
	return num1 + "-" + num2 + " = " + (num1-num2); 
}

	public String divide (int num1, int num2) {
	return num1 +"/" + num2 + " = "  + (num1/num2); 
}

	public String multiply (int num1, int num2){
	return num1 +" x " + num2 + " = " + (num1*num2); 
}

}
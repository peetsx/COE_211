import java.util.Scanner;

    public class EntryPoint {
    public static void main (String[] args) {
    int input;
    boolean answer=true;
    Scanner scan= new Scanner(System.in);
	
	while(answer== true){
    System.out.println("Which service would you like to use?");
    System.out.println("[1] : Basic week visualizer" + "\n" + " [2]: Advanced week visualizer" + "\n" + " [3]: Basic calculator" + "\n" + " [4]: Employee repertoire");
	 input= scan.nextInt();
    
	while ( input>4 || input<0){
	System.out.println( "Please make sure you pick a number between 1 and 4");
input= scan.nextInt();
}
 switch (input) {

case 1:
	BasicWeek basic= new BasicWeek();
 	basic.printDays();
	break;

case 2: 
	AdvancedWeek advanced= new AdvancedWeek();
	advanced.printDays();
	break;

case 3: 
	Calculator calc= new Calculator();
	calc.calculate();
	break;

case 4: 
	Employee emp=new Employee();
	emp.display();
}


	
	System.out.println("Would you like to perform another operation? (y/n)");
	scan.nextLine();
	String ans =scan.nextLine();
	if (ans.equals("y")) {
	answer=true; 
} else {
 answer = false; }
}
	
    }

}
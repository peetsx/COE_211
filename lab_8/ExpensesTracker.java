import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

	public class ExpensesTracker{
		public static void main(String[] args){
			try{
				FileWriter fw= new FileWriter(new File("expenses.txt"));
				BufferedWriter bw= new BufferedWriter(fw);
				PrintWriter outToFile = new PrintWriter(bw);

				Scanner scan=new Scanner(System.in);
				
				String name, product;
				double amount;
				String answer;
	
				do{
			
					System.out.println("Input your name: ");
					name=scan.nextLine();
			
					System.out.println("What did you purchase?");
					product=scan.nextLine();		
	
					System.out.println("How much did you pay? (in USD)");
					amount=scan.nextDouble();

					outToFile.print(name+ " purchased " + product + " for " + amount + " US Dollars.");
					
					outToFile.close();
		
					System.out.println("Would you like to log another purchase? (y/n)");
					scan.nextLine();
					answer=scan.nextLine();
				}while (answer.equals("y"));
		
	
						if(answer.equals("n")){
								
							System.out.println("Get off of ZoodMall!");
							System.out.println("Would you like to read a summary of your purchases?");
							String answer2=scan.nextLine();
							scan.close();
								if(answer2.equals("y")){	
		
											Scanner fileScan = new Scanner(new File ("expenses.txt"));
											String content=fileScan.nextLine();
											System.out.println(content);

											}
										
								      }

							}catch (IOException e) {
								System.out.println("An error occured.");
								e.printStackTrace() ;
 
  		
		}
	}
}

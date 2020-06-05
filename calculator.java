import java.util.Scanner;

	public class calculator{
		public static void displayMenu(){
		System.out.println("====================");
		System.out.println("1 - Addition");
		System.out.println("2 - Subtraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division");
		System.out.println("5 - Modulus");
		System.out.println("6 - Exit");
		System.out.println("====================");
		}

		public static double addition(double n1, double n2){
			double ans = n1 + n2;
			return ans;
		}

		public static double subtraction(double n1, double n2){
					double ans = n1 - n2;
					return ans;
		}

		public static double multiplication(double n1, double n2){
					double ans = n1 * n2;
					return ans;
		}

		public static double division(double n1, double n2){
					double ans = n1 / n2;
					return ans;
		}

		public static double modulus(double n1, double n2){
					double ans = n1 % n2;
					return ans;
		}

		public static void main(String[] args){
			displayMenu();

			System.out.printf("\nPlease select an operation\n");


			Scanner in = new Scanner(System.in);
			int choice;
			choice = in.nextInt();



				while(choice != 6){

					if(choice == 1){
						System.out.printf("\nAddition\n");
						System.out.println("Please enter two numbers to be added");
						double n1 = in.nextDouble();
						double n2 = in.nextDouble();


						double answer = addition(n1,n2);

						System.out.println("Answer = " + answer);
					}

					else if(choice == 2){
							System.out.printf("\nSubtraction\n");
							System.out.println("Please enter two numbers to be subtracted");
							double n1 = in.nextDouble();
							double n2 = in.nextDouble();

							double answer = subtraction(n1,n2);

							System.out.println("Answer = " + answer);
					}

					else if(choice == 3){
							System.out.printf("\nMultiplication\n");
							System.out.println("Please enter two numbers to be multiplied");
							double n1 = in.nextDouble();
							double n2 = in.nextDouble();

							double answer = multiplication(n1,n2);

							System.out.println("Answer = " + answer);
					}

					else if(choice == 4){
							System.out.printf("\nDivision\n");
							System.out.println("Please enter two numbers to be divided");
							double n1 = in.nextDouble();
							double n2 = in.nextDouble();

							double answer = division(n1,n2);

							System.out.println("Answer = " + answer);
					}

					else if(choice == 5){
							System.out.printf("\nModulus\n");
							System.out.println("Please enter two numbers for modulus division");
							double n1 = in.nextDouble();
							double n2 = in.nextDouble();

							double answer = modulus(n1,n2);

							System.out.println("Answer = " + answer);
					}



					System.out.println();
					displayMenu();
					choice = in.nextInt();

				}




		}
	}
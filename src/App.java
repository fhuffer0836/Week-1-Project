public class App {
	// -------------------------------- 1. Declaring variables
	double ItemPrice = 5.25;
	double ItemPrice2 = 9.18;
	double MoneyInWallet = 10;
	double MoneyInWallet2 = 15;
	int NumberOfFriends = 5;
	int NumberOfFriends2 = 8;
	int Age = 20;
	int Age2 = 30;
	String FirstName = "John";
	String FirstName2 = "Jim";
	String LastName = "Doe";
	String LastName2 = "Smith";

	public static void main(String[] args) {

		// ---------------------------- 2. [Main] Creating variables for the constructors
		App myApp = new App(); 
		// ^ Creating the object

		double MLO = myApp.DoubleCalculation();
		int FPY = myApp.IntCalculation();
		String FN = myApp.StringConcatenation();
		
		double MLO2 = myApp.DoubleCalculation2();
		int FPY2 = myApp.IntCalculation2();
		String FN2 = myApp.StringConcatenation2();
		// ^ Calling the variables

		myApp.DisplayVars(MLO, FPY, FN, MLO2, FPY2, FN2);
		// ^ Calling the class method
	}
	
	// --------------------------------- 3. Doing calculations and returning the final variables
	double DoubleCalculation() { 

		double MoneyLeftOver = MoneyInWallet - ItemPrice;
		return MoneyLeftOver;
	}
	double DoubleCalculation2() { 

		double MoneyLeftOver2 = MoneyInWallet2 - ItemPrice2;
		return MoneyLeftOver2;
	}

	int IntCalculation() {

		int FriendsPerYear = Age / NumberOfFriends;
		return FriendsPerYear;
	}
	int IntCalculation2() {

		int FriendsPerYear2 = Age2 / NumberOfFriends2;
		return FriendsPerYear2;
	}

	String StringConcatenation() {

		String FullName = FirstName + " " + LastName;
		return FullName;
	}
	String StringConcatenation2() {

		String FullName2 = FirstName2 + " " + LastName2;
		return FullName2;
	}
	// ---------------------------------- 4. Displaying all of the final variables
	public void DisplayVars(double MoneyLeftOver, int FriendsPerYear, String FullName, double MoneyLeftOver2, int FriendsPerYear2, String FullName2) {

		System.out.println("Person 1 has $" + MoneyLeftOver + " left over.");
		System.out.println("Person 2 has $" + MoneyLeftOver2 + " left over.");
		System.out.println("Person 1 has made " + FriendsPerYear + " friends per year.");
		System.out.println("Person 2 has made " + FriendsPerYear2 + " friends per year.");
		System.out.println("Person 1's full name is " + FullName + ".");
		System.out.println("Person 2's full name is " + FullName2 + ".");

	}
}
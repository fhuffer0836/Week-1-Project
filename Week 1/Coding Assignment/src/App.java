public class App {
	// -------------------------------- 1. Declaring variables
	double ItemPrice = 5.25;
	double MoneyInWallet = 10;
	int NumberOfFriends = 5;
	int Age = 20;
	String FirstName = "John";
	String LastName = "Doe";

	public static void main(String[] args) {

		// ---------------------------- 2. [Main] Creating variables for the constructors
		App myApp = new App(); 
		// ^ Creating the object

		double MLO = myApp.DoubleCalculation();
		int FPY = myApp.IntCalculation();
		String FN = myApp.StringConcatenation();
		// ^ Calling the variables

		myApp.DisplayVars(MLO, FPY, FN);
		// ^ Calling the class method
	}
	
	// --------------------------------- 3. Doing calculations and returning the final variables
	double DoubleCalculation() { 

		double MoneyLeftOver = MoneyInWallet - ItemPrice;
		return MoneyLeftOver;
	}

	int IntCalculation() {

		int FriendsPerYear = Age / NumberOfFriends;
		return FriendsPerYear;
	}

	String StringConcatenation() {

		String FullName = FirstName + " " + LastName;
		return FullName;
	}
	// ---------------------------------- 4. Displaying all of the final variables
	public void DisplayVars(double MoneyLeftOver, int FriendsPerYear, String FullName) {

		System.out.println("You have $" + MoneyLeftOver + " left over.");
		System.out.println("You have made " + FriendsPerYear
				+ " friends per year.");
		System.out.println("Your full name is " + FullName + ".");

	}
}
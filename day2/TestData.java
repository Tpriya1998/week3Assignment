package week3.day2;

public class TestData {
	
	public void enterCredentials() {
		System.out.println("Enter right Credentials");
	}
	
	public void navigateToHomePage ( ) {
		System.out.println("Navigate To Home Page ");
	}

	public static void main(String[] args) {
		TestData dataOptions = new TestData();
		dataOptions.enterCredentials();
		dataOptions.navigateToHomePage();
		
	

	}

}

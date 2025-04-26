package week3.day2;

public class TextField extends WebElement {
	
	public void getText () {
		System.out.println("Text Field");
	}

	public static void main(String[] args) {
		
		TextField textFieldOptions = new TextField();
		textFieldOptions.getText();
		textFieldOptions.click();
		textFieldOptions.setText();
		
		

	}

}

package week3.day2;

public class Button extends WebElement {
	
	public void Submit() {
		System.out.println("Submit Document");
	}

	public static void main(String[] args) {
		Button submitOptions = new Button ();
		
		submitOptions.Submit();
		submitOptions.click();
		submitOptions.setText();
	 
	}

}

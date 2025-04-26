package week3.day2;

public class WebElement {
	
	public void click() {
		System.out.println(" Click Button");
	}
	
	public void setText() {
		System.out.println("Ïnheritence Concept");
	}

	public static void main(String[] args) {
		WebElement webElementOptions = new WebElement();
		webElementOptions.click();
		webElementOptions.setText();
		
		

	}

}

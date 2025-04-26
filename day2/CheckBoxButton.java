package week3.day2;

public class CheckBoxButton extends Button  {
	
	public void clickCheckButton() {
		System.out.println(" Click CheckBox Button");
	}

	public static void main(String[] args) {
		CheckBoxButton buttonOptions = new CheckBoxButton();
		buttonOptions.clickCheckButton();
		buttonOptions.click();
		buttonOptions.setText();
		buttonOptions.Submit();
		

	}

}

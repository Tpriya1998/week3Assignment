package week3.day2;

public class Elements extends Button {
	
	public void named() {
		System.out.println("Execution Completed");
	}

	public static void main(String[] args) {
		Elements namedOptions = new Elements();
		namedOptions.named();
		namedOptions.Submit();
		namedOptions.click();
		namedOptions.setText();
	
	}

}

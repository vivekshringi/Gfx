package GfxTest.GfxTest;

import java.util.Calendar;

public class GetDate {
	

	
	public String getCurrentDate(Calendar c) {
		return String.format("%te", c);
	}
	
	public String getCurrentYear(Calendar c) {
		return String.format("%tY", c);
	}
	
	public String getCurrentMonth(Calendar c) {
		return String.format("%tb", c);
	}
	
	public String getCurrentTime(Calendar c) {
		return String.format("%tT", c);
	}
	

	public static void main(String[] args) {
		
		
	//while(true) {\
		Calendar ca = Calendar.getInstance();
		GetDate d = new GetDate();
	System.out.println(d.getCurrentDate(ca));
	System.out.println(d.getCurrentTime(ca));
	System.out.println(d.getCurrentMonth(ca));
	System.out.println(d.getCurrentYear(ca));
	//}
	
	}

}

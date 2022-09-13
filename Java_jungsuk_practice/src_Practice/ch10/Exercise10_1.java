package ch10;

import java.util.*;
import java.text.*;

public class Exercise10_1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(2010,0, 1);
		
		for(int i = 0; i< 12; i++) {
			int weekday = cal.get(Calendar.DAY_OF_WEEK);
			
			
			
			int seconSunday = (weekday==1) ? 8 : 16 - weekday;
			
			cal.set(Calendar.DAY_OF_MONTH, seconSunday);
			
			Date d = cal.getTime();
			System.out.println(new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.").format(d));
			
			
			
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH, 1);
			
			
		}

	}

}

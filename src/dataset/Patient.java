package dataset;

import java.util.Hashtable;
import java.util.Map;

public class Patient {
	
	protected String myData() {
		Map<String, String> nation = new Hashtable<>();
		nation.put("Kampala", "Uganda");
		nation.put("Kigali", "Rwanda");
		nation.put("Dodoma", "Tanzania");
		
		nation.forEach((K, L) -> System.out.println("Capital City of " + L + " is " + K));
		
		return "Put in conceptDictionary";
	}
	
	public static void main(String[] args) {
		
	}
}

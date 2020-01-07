package lesson1;

import java.util.HashMap;

public class hasmapuse_try_functions {

	public static HashMap<String, String> getcredentials() 
	{
		HashMap<String,String> userpass=new HashMap<String,String>();
		userpass.put("nishant_tuli", "freecrm@123");
		//userpass.put("naveenk", "test@123");
		return userpass;
	}
}

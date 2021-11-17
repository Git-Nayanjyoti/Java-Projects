package hash.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;



public class Mobile {
	HashMap<String, ArrayList<String>> mobileList = new HashMap<String, ArrayList<String>>();

	public String addMobile(String company, String model) {

		ArrayList<String> list = new ArrayList<>();
		list.add(model);
		if (mobileList.get(company) == null) {
			mobileList.put(company, list);
		} else {
			mobileList.get(company).addAll(list);
		} 

		String message = "model added successfully";
		// System.out.println(message);
		return message;
	}

	@SuppressWarnings("unused")
	public String buyMobile(String company, String Model) {
		String mes = null;
		String message1 = "mobile sold successfully";
		String message2 = "item not available";

		for (ArrayList<String> uuidlist : mobileList.values()) {
			for (int i = uuidlist.size() - 1; i >= 0; i--) {
				if (uuidlist.get(i).equals(Model)) {
					uuidlist.remove(i);
					mes = message1;
					break;

				} else {
					mes = message2;
				}
			}
		} 
		return mes;

	}
	

	public ArrayList<String> getModels(String company) {
		// System.out.println(mobileList.get(company));
		return mobileList.get(company);
	}
		

	private String[] split(String val) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {

		Mobile obj = new Mobile();
		obj.addMobile("oppo", "K3");
		obj.addMobile("oppo", "M1");
		obj.addMobile("apple", "iphone7");
		obj.addMobile("apple", "iphone8");
		obj.getModels("oppo");
		obj.getModels("apple");
		System.out.println(obj.buyMobile("oppo", "M1"));
		System.out.println(obj.getModels("oppo"));
		System.out.println(obj.buyMobile("oppo", "M1"));
		System.out.println(obj.buyMobile("oppo", "M1"));
		System.out.println(obj.getModels("apple"));
		System.out.println(obj.buyMobile("apple", "iphone8"));
		System.out.println(obj.getModels("apple"));
		System.out.println(obj.buyMobile("apple", "iphone8"));

	}

} 

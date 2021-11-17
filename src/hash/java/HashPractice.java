package hash.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashPractice {

	public class mobile {
		HashMap<String, ArrayList<String>> mobileList = new HashMap<String, ArrayList<String>>();

		public String addMobile(String company, String model) {

			ArrayList<String> list = new ArrayList<>();
			list.add(model);
			mobileList.put(company, list);
			String message = "Successfully added.";
			list = null;
			return model + message;

		}

		public String buyMobile(String company, String Model) {

			String message = "Sold successfully";
			return message;
		}

		public ArrayList<String> getModels(String company) {
			return mobileList.get(company);
		}

		public static void main(String[] args) {

//			HashMap<Integer, String> studList = new HashMap<Integer, String>();
//			studList.put(1,"Nayan");
//			studList.put(27, "Kapil");
//			studList.put(3,  "Deep");
//			studList.put(27, "rahul");
//			for (@SuppressWarnings("rawtypes") Map.Entry m :studList.entrySet() ) {
//				System.out.println(m.getKey() + " " + m.getValue());
//			}
			mobile obj = new mobile();
			obj.addMobile("oppo", "K3");

		}

	}

}

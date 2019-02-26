package Data;

import org.json.*;

public class InfoRetreiver {

	private static InfoRetreiver unique;
	private JSONObject obj;
	private JSONArray resArray;

	private InfoRetreiver() {
//		String s = "https://raw.githubusercontent.com/andrejewski/periodic-table/master/data.json";
		
		String jsonString = InformationStringClass.INFORMATION;
		obj = new JSONObject(jsonString);
		resArray = obj.getJSONArray("elements");
//		for(int i = 0; i < resArray.length(); i++) {
//			System.out.println(resArray.getJSONObject(i).getInt("atomicNumber") + " " + resArray.getJSONObject(i).getString("name") + " " + resArray.getJSONObject(i).get("atomicMass"));
//		}
	}
	
	public static InfoRetreiver instance() {
		if(unique == null)
			unique = new InfoRetreiver();
		return unique;
	}
	
	public String getAtomicMass(int aNum) {
		return String.valueOf(resArray.getJSONObject(aNum - 1).get("atomicMass"));
	}

	public String getAtomicRadius(int aNum) {
		return String.valueOf(resArray.getJSONObject(aNum - 1).get("atomicRadius"));
	}

	public String getStandardState(int aNum) {
		return String.valueOf(resArray.getJSONObject(aNum-1).get("standardState"));
	}
	
	public String getBondingType(int aNum) {
		return String.valueOf(resArray.getJSONObject(aNum-1).get("bondingType"));
	}

	public String getMeltingPoint(int aNum) {
		return String.valueOf(resArray.getJSONObject(aNum-1).get("meltingPoint"));
	}
	
	public String getBoilingPoint(int aNum) {
		return String.valueOf(resArray.getJSONObject(aNum-1).get("boilingPoint"));
	}

	public String getYearDiscovered(int aNum) {
		return String.valueOf(resArray.getJSONObject(aNum-1).get("yearDiscovered"));
	}
}

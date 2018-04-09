/*package com.knowarth.notifications.portlet;

import org.json.JSONArray;
import org.json.JSONObject;

public class Demo {

public static void main(String[] args)  {

	try
	{
	Object objectData = PeoplePowerAPI.getNotificationList("d101");
	
	if(objectData!=null){
		System.out.println("People Power Data Object : "+objectData);
		
		int ModCnt = 0;
		String url = "";
		String ApprovalCategory="";
		String Notification_Text="";
		int functionalityCode=0;
		String empppId="";
		
		if(objectData instanceof JSONArray){
			JSONArray jsonArray = new JSONArray(objectData.toString());
			
			for(int i = 0; i < jsonArray.length(); i++)
			{
				JSONObject objects = jsonArray.getJSONObject(i);
			    ModCnt = objects.getInt("ModCnt")+ModCnt;
			    url = objects.getString("Targeted_Url");
			    ApprovalCategory = objects.getString("ApprovalCategory");
			    Notification_Text=objects.getString("Notification_Text");
			    functionalityCode=objects.getInt("FunctionalityCode");
			  	empppId=objects.getString("EmpId");
			    
			  	System.out.println(ModCnt +"-- > "+url +"-- > "+ApprovalCategory +"-- > "+Notification_Text);
			}
		}
		else{
			JSONObject objects = new JSONObject(objectData.toString());
			ModCnt = objects.getInt("ModCnt");
			url = objects.getString("Targeted_Url");
		    ApprovalCategory = objects.getString("ApprovalCategory");
		    Notification_Text=objects.getString("Notification_Text");
		    functionalityCode=objects.getInt("FunctionalityCode");
		  	empppId=objects.getString("EmpId");
		    
		  	System.out.println(ModCnt +"-- > "+url +"-- > "+ApprovalCategory +"-- > "+Notification_Text);
		}
		
	}
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	}	
}
*/
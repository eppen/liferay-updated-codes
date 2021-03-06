package com.knowarth.notifications.portlet;


import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactory;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.xml.SAXReaderUtil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringBufferInputStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class PeoplePowerAPI {
     
 
        
   
    public static Document loadXMLString(String response) throws Exception
	{
	           DocumentBuilderFactory dbf =DocumentBuilderFactory.newInstance();
                  DocumentBuilder db = dbf.newDocumentBuilder();
                  InputSource is = new InputSource(new StringReader(response));

	    return db.parse(is);
	}
    
    public static Object  getQtrackNotificationList(String empId)
   {
       Object resp = null;
       HttpURLConnection con = null;
       try
       {
         String requestXml="<Envelope xmlns=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                           "  <Body>\n" +
                           "    <GetAllEmployeesDetails xmlns=\"http://tempuri.org/\">\n" +
                           "      <Adid>"+empId+"</Adid>\n" +
                           "    </GetAllEmployeesDetails>\n" +
                           "  </Body>\n" +
                           "</Envelope>";
       
        // System.out.println(requestXml);
              
       StringBuffer response = new StringBuffer();
       
       String credurl="http://10.9.58.86/WebService_QtracLiferay_Integration/WebService_QtracLiferay_Integration.asmx?wsdl/GetAllEmployeesDetails";
      	
		URL obj = new URL(credurl);
		con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("POST");
               con.setRequestProperty("Content-Length", "1307");
               con.setRequestProperty("Content-Type","text/xml; charset=utf-8");
		con.setDoInput(true);
               con.setDoOutput(true);
               OutputStream os = con.getOutputStream();
               BufferedWriter writer = new BufferedWriter(
                       new OutputStreamWriter(os, "UTF-8"));
               writer.write(requestXml);
               writer.flush();
               writer.close();
               os.close();

               con.connect();
		
		int responseCode = con.getResponseCode();
		System.out.println("POST Response Code :: " + responseCode);
		
		if (responseCode == HttpsURLConnection.HTTP_OK) { //success
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream(),"utf-8"));
			String inputLine=null;

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

                     JSONArray val = JSONFactoryUtil.createJSONArray();
                       Document xmlDoc = loadXMLString(response.toString());
          
                       NodeList childs = xmlDoc.getElementsByTagName("Table");
                  
                       for (int i = 0; i < childs.getLength(); i++) {
                   
                        JSONObject values = JSONFactoryUtil.createJSONObject();
                        values.put("FunctionalityCode",xmlDoc.getElementsByTagName("FunctionalityCode").item(i).getTextContent());
                         values.put("Notification_Text",xmlDoc.getElementsByTagName("Notification_Text").item(i).getTextContent());
                          values.put("ModCnt",xmlDoc.getElementsByTagName("ModCnt").item(i).getTextContent());
                           values.put("EmpId",xmlDoc.getElementsByTagName("EmpId").item(i).getTextContent());
                            values.put("Targeted_Url",xmlDoc.getElementsByTagName("Targeted_Url").item(i).getTextContent());
                             values.put("Identification_Flag",xmlDoc.getElementsByTagName("Identification_Flag").item(i).getTextContent());
                              values.put("ApprovalCategory",xmlDoc.getElementsByTagName("ApprovalCategory").item(i).getTextContent());
                               values.put("ErrorStatus",xmlDoc.getElementsByTagName("ErrorStatus").item(i).getTextContent());
                       
                               val.put(values);
                        
                       }
                       resp=val;
                   System.out.println("Qtrac Notification data : "+resp);
               
               }
               else
               {
                   
               }
   }
   
       catch(Exception e)
       {
    	   e.printStackTrace();
           System.err.println(e.getMessage());
       }
       finally
       {
         if(con!=null)
         {
             con.disconnect();
             System.out.println("Connection Closed");
         }
       }
       return resp;
  
   }

    public static JSONArray  getPeoplePowerNotificationList(String empId)
    {
        JSONArray mainJsonArray = null;
         HttpsURLConnection con = null;
        try
        {
          HashMap<String, String> postDataParams= new HashMap<String,String>();
        postDataParams.put("AppID", "CHFAVRHDA274");
        postDataParams.put("Password", "ChF#hrIntra3");
        postDataParams.put("Empid", empId);
        postDataParams.put("Username", "FhrUesr");
                
        StringBuffer response = new StringBuffer();
        
        String credurl="https://peoplepower.chola.murugappa.com/services/formulahrintranetservice.asmx/GetNotificationList";
       	
		URL obj = new URL(credurl);
		con = (HttpsURLConnection) obj.openConnection();
		con.setRequestMethod("POST");
		con.setDoInput(true);
                con.setDoOutput(true);
                OutputStream os = con.getOutputStream();
                BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(os, "UTF-8"));
                writer.write(getPostDataString(postDataParams));
                writer.flush();
                writer.close();
                os.close();

                con.connect();
		
		int responseCode = con.getResponseCode();
		System.out.println("POST Response Code :: " + responseCode);
               // System.out.println(""+con.getResponseMessage());
		
		if (responseCode == HttpsURLConnection.HTTP_OK) { //success
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream(),"utf-8"));
			String inputLine=null;

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			 
			String xmljson=JSONFactoryUtil.convertXMLtoJSONMLObject(response.toString());
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(new StringBufferInputStream(response.toString()));

			
			NodeList nList=doc.getElementsByTagName("EmpNotificationDetail");
			
			mainJsonArray=JSONFactoryUtil.createJSONArray();
			
			//System.out.println("nList Size : "+nList.getLength());
			for (int temp = 0; temp < nList.getLength(); temp++) {
				
				JSONObject subJsonObj=JSONFactoryUtil.createJSONObject();
				
				Node nNode = nList.item(temp);

				//System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					
					Element eElement = (Element) nNode;
					subJsonObj.put("FunctionalityCode", eElement.getElementsByTagName("FunctionalityCode").item(0).getTextContent());
					subJsonObj.put("ModCnt", eElement.getElementsByTagName("ModCnt").item(0).getTextContent());
					subJsonObj.put("Targeted_Url", eElement.getElementsByTagName("Targeted_Url").item(0).getTextContent());
					subJsonObj.put("Identification_Flag", eElement.getElementsByTagName("Identification_Flag").item(0).getTextContent());
					subJsonObj.put("Notification_Text", eElement.getElementsByTagName("Notification_Text").item(0).getTextContent());
					subJsonObj.put("EmpId", eElement.getElementsByTagName("EmpId").item(0).getTextContent());
					subJsonObj.put("ApprovalCategory", eElement.getElementsByTagName("ApprovalCategory").item(0).getTextContent());
					subJsonObj.put("ErrorStatus", eElement.getElementsByTagName("ErrorStatus").item(0).getTextContent());
					
				}
				mainJsonArray.put(subJsonObj);
				
			}
			 
		    }
                else
                {
                    
                }
    }
    
        catch(Exception e)
        {
            e.printStackTrace();
        }
         finally
        {
          if(con!=null)
          {
              con.disconnect();
          }
        }
        return mainJsonArray;
    }

    
    
    
     private static String getPostDataString(HashMap<String, String> params) throws UnsupportedEncodingException{
        StringBuilder result = new StringBuilder();
        boolean first = true;
        for(Map.Entry<String, String> entry : params.entrySet()){
            if (first)
                first = false;
            else
                result.append("&");

            result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
        }

        return result.toString();
    }
}

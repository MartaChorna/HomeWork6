package pack2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;



public class Response {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	         Response.call_me();
	        } catch (Exception e) {
	         e.printStackTrace();
	       }
	     }
		   
	public static void call_me() throws Exception {
	     String url = "http://data.fixer.io/api/latest?access_key=19085a48ed4f9821f5624f571eeadae4&format=1";
	     URL obj = new URL(url);
	     HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	     int responseCode = con.getResponseCode();
	     String contentType = con.getContentType();
	     Object message = con.getResponseMessage();
	     System.out.println("\nSending 'GET' request to URL : " + url);
	     System.out.println("Response Code : " + responseCode + " " + message);
	     System.out.println("Response content type: " + contentType);
	     
	     BufferedReader in = new BufferedReader(
	             new InputStreamReader(con.getInputStream()));
	     String inputLine;
	     StringBuffer response = new StringBuffer();
	     while ((inputLine = in.readLine()) != null) {
	     	response.append(inputLine);
	     }
	     in.close();
	     
	     System.out.println("Response body: " + response.toString());
	     JSONObject myResponse = new JSONObject(response.toString());
	     System.out.println("result after Reading JSON Response");
	     System.out.println("date- "+myResponse.getString("date"));
	     System.out.println("base- "+myResponse.getString("base"));
	     System.out.println("timestamp- "+myResponse.getInt("timestamp"));
	     

	}
	     
	   }
	
	



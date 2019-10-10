package com;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class WriteJSON {
public static void main(String[] args) {
	
	JSONObject js=new JSONObject();
	
	js.put("firstName", "Shraddha");
	js.put("lastName", "Dokras");
	js.put("website", "howtodoinjava.com");
    
	try (FileWriter file = new FileWriter("employees.json")) 
	{
		
		
	}
	catch(IOException e)
	{
		
		
	}
 
}

}

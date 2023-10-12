package com.acorn.practiceAPI;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.IOException;

@Controller
public class ApiExplorerController {
    
   
    	
    	@Autowired
    	ApiExplorer api;
    	
    	@ResponseBody
    	@GetMapping(value="/api", produces = "application/json;charset=UTF-8")
    	public String openApi() throws IOException {
    		String result = api.getApiTest();
    		return result;
    	
    }
}
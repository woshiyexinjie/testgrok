package com.groktest.test.grotest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import oi.thekraken.grok.api.Grok;
import oi.thekraken.grok.api.GrokUtils;
import oi.thekraken.grok.api.Match;
import oi.thekraken.grok.api.exception.GrokException;
import oi.thekraken.grok.api.Discovery;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws GrokException, IOException
    {
    	Grok g = Grok.create("patterns/patterns", "%{COMMONAPACHELOG}");

	    BufferedReader br = new BufferedReader(new FileReader("songlog"));
	    String line;
	    System.out.println("Starting test with httpd log");
	    while ((line = br.readLine()) != null) {
	      System.out.println(line);
	      Match gm = g.match(line);
	      gm.captures();
	      gm.toJson();
	      
	    }
	    br.close();
    }
}

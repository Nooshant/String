package com.duke;

import java.util.HashMap;

/**
 * @author thakurde
 *https://leetcode.com/problems/html-entity-parser/
 */
public class EntityParser {
	
	public String entityParser(String text) {
        HashMap<String, String> map = new HashMap<>();
        map.put("&quot;","\"");
        map.put("&apos;", "'");
        map.put("&amp;", "&");
        map.put("&gt;", ">");
        map.put("&lt;", "<");
        map.put("&frasl;", "/");
        
        StringBuilder ans = new StringBuilder();
        int len = text.length();
        
        for(int i = 0; i < text.length(); i++)
        {
            if(text.charAt(i)=='&' && (i+1)< len && text.charAt(i+1)!='&')
            {
                String subString = null;
                if((i+3)< len && text.charAt(i+3)==';')
                {
                   subString = text.substring(i,i+3+1);
                   System.out.println(subString);
                   i=i+3;
                }
                else if((i+4)< len && text.charAt(i+4)==';')
                {
                	subString = text.substring(i,i+4+1);
                	System.out.println(subString);
                	i=i+4;
                }
                else if((i+5)< len && text.charAt(i+5)==';')
                {
                	subString = text.substring(i,i+5+1);
                	System.out.println(subString);
                	i=i+5;
                }
                else if((i+6)< len && text.charAt(i+6)==';')
                {
                	subString = text.substring(i,i+6+1);
                	System.out.println(subString);
                	i=i+6;
                }
                if(subString!=null)
                {
                	String entity = map.get(subString);
                	ans.append(entity);
                	
                }
                else {
                	ans.append(text.charAt(i));
                }
            }
            else {
            	ans.append(text.charAt(i));
            }
        }
        System.out.println(ans.toString());
		return ans.toString();
        
    }

	public static void main(String[] args) {
		
		//new EntityParser().entityParser("x &gt; y &amp;&amp; x &lt; y is always false");
		new EntityParser().entityParser("&&gt;");
		new EntityParser().entityParser("&&&");
		new EntityParser().entityParser("&&&amp&&");

	}

}

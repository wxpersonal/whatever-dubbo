package com.wx.whatever.common.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
	
	 /** 
	    * md5加密(ITS) 
	    * @param str 
	    * @param charSet 
	    * @return 
	    */  
	   public synchronized static final String getMD5Str(String str,String charSet) { //md5加密  
	    MessageDigest messageDigest = null;    
	    try {    
	        messageDigest = MessageDigest.getInstance("MD5");    
	        messageDigest.reset();   
	        if(charSet==null){  
	            messageDigest.update(str.getBytes());  
	        }else{  
	            messageDigest.update(str.getBytes(charSet));    
	        }             
	    } catch (NoSuchAlgorithmException e) {    
	         e.printStackTrace();
	    } catch (UnsupportedEncodingException e) {    
	        e.printStackTrace();
	    }    
	      
	    byte[] byteArray = messageDigest.digest();    
	    StringBuffer md5StrBuff = new StringBuffer();    
	    for (int i = 0; i < byteArray.length; i++) {                
	        if (Integer.toHexString(0xFF & byteArray[i]).length() == 1)    
	            md5StrBuff.append("0").append(Integer.toHexString(0xFF & byteArray[i]));    
	        else    
	            md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));    
	    }    
	    return md5StrBuff.toString();    
	}  
	   
	   
		public static void main(String[] args) {
			String password = "abc123";
			System.out.println("加密前："+password);
			System.out.println("加密后："+getMD5Str(password,null));
			
		}

}

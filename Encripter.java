package com.example.smartt;

public class Encripter {

	String text;
	char temp[];
	
	void setString(String s){
		text=s;
	}
	void encript(){
		
		temp=text.toCharArray();
		for(int i=0;i<temp.length;++i){
			temp[i]=(char) (temp[i]+1);
		}
		text=String.valueOf(temp);
		
	}
	String decript(){
		
		temp=text.toCharArray();
		for(int i=0;i<temp.length;++i){
			temp[i]=(char) (temp[i]-1);
		}
		text=String.valueOf(temp);
		return text;
	}
	
	
	
	
}

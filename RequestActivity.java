package com.example.smartt;

import java.net.URLEncoder;

import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class RequestActivity extends Activity {

	Button btn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_request);
		
		btn=(Button)findViewById(R.id.request);
		
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				
				String s="the content from file";
				
				
				
				HttpClient client=new DefaultHttpClient();
				String url="http://samplesite.com/api/verify/"+s;
				try{
					String setServerString="";
					HttpGet httpGet=new HttpGet(url);
					ResponseHandler<String> responseHandler=new BasicResponseHandler();
					setServerString=client.execute(httpGet,responseHandler);
					
					Toast.makeText(getApplicationContext(),"Connected",Toast.LENGTH_LONG).show();
					
				}catch(Exception e){
					Toast.makeText(getApplicationContext(),"Cannot Get",Toast.LENGTH_LONG).show();
				}
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_request, menu);
		return true;
	}

}
